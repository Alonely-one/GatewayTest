package com.project.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  *@author Duanzp
  *@since 2024-04-07 22:57:41
  */
@RestController
@RequestMapping("system")
public class SystemTestController {

    @GetMapping("/test")
    public String system() {
        return "哦吼，网关转发成功！";
    }
}
