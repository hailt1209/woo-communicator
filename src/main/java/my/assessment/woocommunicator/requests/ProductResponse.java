package my.assessment.woocommunicator.requests;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

@Data
public class ProductResponse implements Serializable {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("permalink")
    private String permalink;

    @JsonProperty("date_created")
    private LocalDateTime dateCreated;

    @JsonProperty("date_created_gmt")
    private LocalDateTime dateCreatedGmt;

    @JsonProperty("date_modified")
    private LocalDateTime dateModified;

    @JsonProperty("date_modified_gmt")
    private LocalDateTime dateModifiedGmt;

    @JsonProperty("type")
    private String type;

    @JsonProperty("status")
    private String status;

    @JsonProperty("featured")
    private boolean featured;

    @JsonProperty("catalog_visibility")
    private String catalogVisibility;

    @JsonProperty("description")
    private String description;

    @JsonProperty("short_description")
    private String shortDescription;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("price")
    private String price;

    @JsonProperty("regular_price")
    private String regularPrice;

    @JsonProperty("sale_price")
    private String salePrice;

    @JsonProperty("date_on_sale_from")
    private LocalDateTime dateOnSaleFrom;

    @JsonProperty("date_on_sale_from_gmt")
    private LocalDateTime dateOnSaleFromGmt;

    @JsonProperty("date_on_sale_to")
    private LocalDateTime dateOnSaleTo;

    @JsonProperty("date_on_sale_to_gmt")
    private LocalDateTime dateOnSaleToGmt;

    @JsonProperty("price_html")
    private String priceHtml;

    @JsonProperty("on_sale")
    private boolean onSale;

    @JsonProperty("purchasable")
    private boolean purchasable;

    @JsonProperty("total_sales")
    private int totalSales;

    @JsonProperty("virtual")
    private boolean virtual;

    @JsonProperty("downloadable")
    private boolean downloadable;

//    @JsonProperty("downloads")
//    private String downloads;

    @JsonProperty("download_limit")
    private int downloadLimit;

    @JsonProperty("download_expiry")
    private int downloadExpiry;

    @JsonProperty("external_url")
    private String externalUrl;

    @JsonProperty("button_text")
    private String buttonText;

    @JsonProperty("tax_status")
    private String taxStatus;

    @JsonProperty("tax_class")
    private String taxClass;

    @JsonProperty("manage_stock")
    private boolean manageStock;

    @JsonProperty("stock_quantity")
    private int stockQuantity;

    @JsonProperty("stock_status")
    private String stockStatus;

    @JsonProperty("backorders")
    private String backorders;

    @JsonProperty("backorders_allowed")
    private boolean backordersAllowed;

    @JsonProperty("backordered")
    private boolean backordered;

    @JsonProperty("sold_individually")
    private boolean soldIndividually;

    @JsonProperty("weight")
    private String weight;

//    @JsonProperty("dimensions")
//    private ProductDimensions dimensions;

    @JsonProperty("shipping_required")
    private boolean shippingRequired;

    @JsonProperty("shipping_taxable")
    private boolean shippingTaxable;

    @JsonProperty("shipping_class")
    private String shippingClass;

    @JsonProperty("shipping_class_id")
    private int shippingClassId;

    @JsonProperty("reviews_allowed")
    private boolean reviewsAllowed;

    @JsonProperty("average_rating")
    private String averageRating;

    @JsonProperty("rating_count")
    private int ratingCount;

    @JsonProperty("related_ids")
    private int[] relatedIds;

    @JsonProperty("upsell_ids")
    private int[] upsellIds;

    @JsonProperty("cross_sell_ids")
    private int[] crossSellIds;

    @JsonProperty("parent_id")
    private int parentId;

    @JsonProperty("purchase_note")
    private String purchaseNote;

//    @JsonProperty("categories")
//    private Category[] categories;

//    @JsonProperty("tags")
//    private Tag[] tags;

//    @JsonProperty("images")
//    private String images;

//    @JsonProperty("attributes")
//    private String attributes;

//    @JsonProperty("default_attributes")
//    private String defaultAttributes;

    @JsonProperty("variations")
    private int[] variations;

    @JsonProperty("grouped_products")
    private int[] groupedProducts;

    @JsonProperty("menu_order")
    private int menuOrder;

//    @JsonProperty("meta_data")
//    private String metaData;


}
