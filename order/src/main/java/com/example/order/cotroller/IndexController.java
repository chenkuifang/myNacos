package com.example.order.cotroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author: Quifar
 * @version: 1.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping
    public String index() {
        return "index";
    }
}
