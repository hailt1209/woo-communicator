package my.assessment.woocommunicator.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.icoderman.woocommerce.ApiVersionType;
import com.icoderman.woocommerce.WooCommerce;
import com.icoderman.woocommerce.WooCommerceAPI;
import com.icoderman.woocommerce.oauth.OAuthConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

@Configuration
public class WooCommerceConfiguration {

    @Value("${woo-commerce.url}")
    private String url;

    @Value("${woo-commerce.consumer-key}")
    private String consumerKey;

    @Value("${woo-commerce.consumer-secret}")
    private String consumerSecret;

    @Bean
    public WooCommerce configWooCommerceRestClient(){
        OAuthConfig config = new OAuthConfig(url, consumerKey, consumerSecret);
        WooCommerce wooCommerce = new WooCommerceAPI(config, ApiVersionType.V3);
        return wooCommerce;
    }
}
