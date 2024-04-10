package com.project.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Duanzp
 * @since 2024-04-08 23:46:19
 */
@RestController
@RequestMapping("test")
public class GatewayTestController {

    @GetMapping
    public String test() {
        return "访问成功！";
    }
}
