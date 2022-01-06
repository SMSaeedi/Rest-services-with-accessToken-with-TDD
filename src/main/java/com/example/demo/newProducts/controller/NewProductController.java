package com.example.demo.newProducts.controller;

import com.example.demo.newProducts.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewProductController {

    @RequestMapping("NewProducts_Vx0")
    public NewProductsOutput NewProducts_Vx0(@RequestBody NewProductsInput input) throws Exception {
        return new NewProducts_Vx0().test(input);
    }

    @RequestMapping("NewProducts_VxA")
    public NewProductsOutput NewProducts_VxA(@RequestBody NewProductsInput input) throws Exception {
        return new NewProducts_VxA().process(input);
    }
}