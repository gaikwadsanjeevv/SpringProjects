package com.edigest.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartInfo {

    @GetMapping("cart")
    public int cardValue() {
        return 50+200;
    }
}
