package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "access-api",
        url = "http://localhost:9090/",configuration = ClientConfig.class)
public interface RestClient {

    @GetMapping("/secure/rest")
    public String getMessage();
}
