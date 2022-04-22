package com.postcity.mvp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloController {

    private final Environment env;

    @GetMapping("/hello")
    public String hello() {
        return "hello mvp service";
    }

    @GetMapping("/check-port")
    public String check(HttpServletRequest request)
    {
        log.info("port:: {} {}", env.getProperty("local.server.port"), request.getServerPort());
        return "custom filter check";
    }
}
