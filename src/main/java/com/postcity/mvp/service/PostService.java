package com.postcity.mvp.service;

import com.postcity.mvp.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService{

    @Transactional(readOnly = true)
    public List<PostDto> getPosts() {
        // invoke db
        List<PostDto> posts = new ArrayList<>();
        posts.add(buildTempPost(111L, "post city test1", "", "", 1,"WRITER1" ));
        posts.add(buildTempPost(222L, "post city test2", "", "", 1,"WRITER2" ));
        posts.add(buildTempPost(333L, "post city test3", "", "", 2,"WRITER3" ));
        posts.add(buildTempPost(444L, "post city test4", "", "", 3,"WRITER4" ));

        return posts;
    }

    private PostDto buildTempPost(Long id, String text, String lat, String lon, Integer depth, String writer){
        return PostDto.builder()
                .id(id)
                .postText(text)
                .latitude(lat)
                .longitude(lon)
                .zDepth(depth)
                .writer(writer)
                .build();
    }
}
