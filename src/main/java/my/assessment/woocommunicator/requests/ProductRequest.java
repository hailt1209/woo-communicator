package my.assessment.woocommunicator.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ProductRequest implements Serializable {
    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("regular-price")
    private String regularPrice;

    @JsonProperty("description")
    private String description;
}
