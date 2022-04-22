package com.postcity.mvp.controller;

import com.postcity.mvp.service.PostService;
import com.postcity.mvp.vo.ResponsePost;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class PostController {

    private final PostService postService;
    private final Environment env;

    @GetMapping("/posts")
    public ResponseEntity<List<ResponsePost>> getPosts() {
        List<ResponsePost> posts =
                postService.getPosts()
                        .stream()
                        .map(postDto -> new ModelMapper().map(postDto, ResponsePost.class))
                        .collect(toList());
        return ResponseEntity.status(HttpStatus.OK).body(posts);
    }
}
