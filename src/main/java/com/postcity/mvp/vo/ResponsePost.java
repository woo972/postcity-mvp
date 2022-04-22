package com.postcity.mvp.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePost {
    private Long id;
    private String writer;
    private String latitude;
    private String longitude;
    private Integer zDepth;
    private String postText;
}
