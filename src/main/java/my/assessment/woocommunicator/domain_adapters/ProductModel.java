package my.assessment.woocommunicator.domain_adapters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icoderman.woocommerce.EndpointBaseType;
import com.icoderman.woocommerce.WooCommerce;
import lombok.Getter;
import lombok.Setter;
import my.assessment.woocommunicator.domain_models.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Component()
@Scope("prototype")
public class ProductModel implements Product, Serializable {

    private final WooCommerce wooCommerceClient;

    private final ObjectMapper objectMapper;

    @Getter @Setter
    @JsonProperty("id")
    private int id;

    @Getter @Setter
    @JsonProperty("name")
    private String name;

    @Getter @Setter
    @JsonProperty("slug")
    private String slug;

    @Getter @Setter
    @JsonProperty("permalink")
    private String permalink;

    @Getter @Setter
    @JsonProperty("date_created")
    private LocalDateTime dateCreated;

    @Getter @Setter
    @JsonProperty("date_created_gmt")
    private LocalDateTime dateCreatedGmt;

    @Getter @Setter
    @JsonProperty("date_modified")
    private LocalDateTime dateModified;

    @Getter @Setter
    @JsonProperty("date_modified_gmt")
    private LocalDateTime dateModifiedGmt;

    @Getter @Setter
    @JsonProperty("type")
    private String type;

    @Getter @Setter
    @JsonProperty("status")
    private String status;

    @Getter @Setter
    @JsonProperty("featured")
    private boolean featured;

    @Getter @Setter
    @JsonProperty("catalog_visibility")
    private String catalogVisibility;

    @Getter @Setter
    @JsonProperty("description")
    private String description;

    @Getter @Setter
    @JsonProperty("short_description")
    private String shortDescription;

    @Getter @Setter
    @JsonProperty("sku")
    private String sku;

    @Getter @Setter
    @JsonProperty("price")
    private String price;

    @Getter @Setter
    @JsonProperty("regular_price")
    private String regularPrice;

    @Getter @Setter
    @JsonProperty("sale_price")
    private String salePrice;

    @Getter @Setter
    @JsonProperty("date_on_sale_from")
    private LocalDateTime dateOnSaleFrom;

    @Getter @Setter
    @JsonProperty("date_on_sale_from_gmt")
    private LocalDateTime dateOnSaleFromGmt;

    @Getter @Setter
    @JsonProperty("date_on_sale_to")
    private LocalDateTime dateOnSaleTo;

    @Getter @Setter
    @JsonProperty("date_on_sale_to_gmt")
    private LocalDateTime dateOnSaleToGmt;

    @Getter @Setter
    @JsonProperty("price_html")
    private String priceHtml;

    @Getter @Setter
    @JsonProperty("on_sale")
    private boolean onSale;

    @Getter @Setter
    @JsonProperty("purchasable")
    private boolean purchasable;

    @Getter @Setter
    @JsonProperty("total_sales")
    private int totalSales;

    public ProductModel(WooCommerce wooCommerceClient, ObjectMapper objectMapper) {
        this.wooCommerceClient = wooCommerceClient;
        this.objectMapper = objectMapper;
    }

    public Product save() {
        Map attributeMap = objectMapper.convertValue(this, Map.class);
        Map createdProduct = wooCommerceClient.create(EndpointBaseType.PRODUCTS.getValue(), attributeMap);
        return objectMapper.convertValue(createdProduct, Product.class);
    }

    public Product update() {
        Map attributeMap = objectMapper.convertValue(this, Map.class);
        Map createdProduct = wooCommerceClient.update(EndpointBaseType.PRODUCTS.getValue(), this.id, attributeMap);
        return objectMapper.convertValue(createdProduct, Product.class);
    }

    public boolean delete() {
        wooCommerceClient.delete(EndpointBaseType.PRODUCTS.getValue(), this.id);
        return true;
    }
}
