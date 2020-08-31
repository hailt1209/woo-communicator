package my.assessment.woocommunicator.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import my.assessment.woocommunicator.common.ApiConstants;
import my.assessment.woocommunicator.requests.ProductRequest;
import my.assessment.woocommunicator.requests.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/" + ApiConstants.REST_API_PREFIX + "/" + ApiConstants.REST_API_VERSION_1 + "/products")
public class ProductController {

    private final ObjectMapper objectMapper;
    private final WooCommerce wooCommerceClient;

    public ProductController(ObjectMapper objectMapper, WooCommerce wooCommerceClient) {
        this.objectMapper = objectMapper;
        this.wooCommerceClient = wooCommerceClient;
    }

    @GetMapping("")
    public ResponseEntity<List> getAllProducts() {
        List allProducts = wooCommerceClient.getAll(EndpointBaseType.PRODUCTS.getValue());
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping("")
    public ResponseEntity<ProductResponse> addNewProduct(ProductRequest productRequest) {
        Map attributeMap = objectMapper.convertValue(productRequest, Map.class);
        Map createdProduct = wooCommerceClient.create(EndpointBaseType.PRODUCTS.getValue(), attributeMap);
        ProductResponse productResponse = objectMapper.convertValue(createdProduct, ProductResponse.class);

        return ResponseEntity.ok(productResponse);
    }
}
