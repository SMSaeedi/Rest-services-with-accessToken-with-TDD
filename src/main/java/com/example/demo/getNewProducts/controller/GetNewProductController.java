package com.example.demo.getNewProducts.controller;

import com.example.demo.getNewProducts.model.GetNewProducts_Vx0;
import com.example.demo.getNewProducts.model.ShortBook;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetNewProductController {

    @RequestMapping("getNewProducts_Vx0")
    public List<ShortBook> getNewProducts_Vx0(@RequestBody String subject) throws Exception {
        return new GetNewProducts_Vx0().getNewProducts(subject);
    }

    @RequestMapping("getNewProducts_Vx0Test")
    public List<ShortBook> getNewProducts_Vx0Test(@RequestBody String subject) throws Exception {
        return new GetNewProducts_Vx0().getNewProductsTest(subject);
    }

    @RequestMapping("getNewProducts_VxA")
    public List<ShortBook> getNewProducts_VxA(@RequestBody String subject) throws Exception {
        return new GetNewProducts_Vx0().getNewProducts(subject);
    }
}