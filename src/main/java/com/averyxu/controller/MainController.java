package com.averyxu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bxu
 * @since
 */
@RestController
public class MainController {
    @RequestMapping("index")
    public String index(){
        return "Hello";
    }
}
