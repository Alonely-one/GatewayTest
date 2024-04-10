package com.project.custom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Duanzp
 * @Description
 * @since 2024-04-10 20:53:22
 */
@RestController
@RequestMapping("/custom")
public class CustomTestController {

    @GetMapping
    public String test() {
        return "访问到了客户";
    }
}
