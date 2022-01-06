package com.example.demo.getBestSellers.controller;

import com.example.demo.getBestSellers.model.GetBestSellers_Vx0;
import com.example.demo.getBestSellers.model.GetBestSellers_VxA;
import com.example.demo.newProducts.model.ShortBook;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@RestController
public class GetBestSellersController {

    @RequestMapping("getBestSellers_Vx0")
    public List<ShortBook> getBestSellers_Vx0(@RequestParam(name = "subject") String subject) {
        return new GetBestSellers_Vx0().getBestSellers(subject);
    }

    @RequestMapping("getBestSellers_Vx0Test")
    public List<ShortBook> getBestSellers_Vx0Test(@RequestBody ShortBook subject) {
        return new GetBestSellers_Vx0().getBestSellersTest(subject);
    }

    @RequestMapping("getBestSellers_VxA")
    public List<ShortBook> getBestSellers_VxA(@RequestParam(name = "subject") String subject) {
        return new GetBestSellers_VxA().getBestSellers(subject);
    }

}