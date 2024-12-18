package com.edigest.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class payment {

    @GetMapping("pay")
    public String payDone() {
        return "Payment Done Successfully";
    }
}
