package com.postcity.mvp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostDto {
    private Long id;
    private String writer;
    private String latitude;
    private String longitude;
    private Integer zDepth;
    private String postText;
}
