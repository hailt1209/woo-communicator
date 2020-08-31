package my.assessment.woocommunicator.domain_adapters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import my.assessment.woocommunicator.domain_models.Product;
import my.assessment.woocommunicator.domain_models.ProductLoader;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@Scope("prototype")
public class ProductLoaderModel implements ProductLoader {

    private final ObjectMapper objectMapper;
    private final WooCommerce wooCommerceClient;

    public ProductLoaderModel(ObjectMapper objectMapper, WooCommerce wooCommerceClient) {
        this.objectMapper = objectMapper;
        this.wooCommerceClient = wooCommerceClient;
    }

    @Override
    public Product get(int id) {
        Map productAttributes = wooCommerceClient.get(EndpointBaseType.PRODUCTS.getValue(), id);
        return objectMapper.convertValue(productAttributes, ProductModel.class);
    }

    @Override
    public List<Product> getAll() {
        List wcProducts = wooCommerceClient.getAll(EndpointBaseType.PRODUCTS.getValue());
        List results = new ArrayList();
        for (Object wcProduct : wcProducts) {
            Product product = objectMapper.convertValue(wcProduct, ProductModel.class);
            results.add(product);
        }
        return results;
    }
}
