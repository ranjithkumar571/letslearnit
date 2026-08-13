package com.ranjith.demo.letslearnit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getMeMyMsg")
    public String getMeMyData() {
        return "Thank you my Dear";
    }

}
