package com.example.demo.productDetail.controller;

import com.example.demo.productDetail.model.ProductDetailInput;
import com.example.demo.productDetail.model.ProductDetailOutput;
import com.example.demo.productDetail.model.ProductDetailPojo;
import com.example.demo.productDetail.webService.ProductDetail;
import com.example.demo.productDetail.webService.impl.ProductDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetailsController {

    private ProductDetailImpl productDetail=new ProductDetailImpl();

    @RequestMapping("productDetail_Vx0")
    public ProductDetailOutput productDetail_Vx0(@RequestBody ProductDetailPojo input) throws Exception {
        return productDetail.productDetail_Vx0_token(input);
    }

    @RequestMapping("productDetail_VxA")
    public ProductDetailOutput productDetail_VxA(@RequestBody ProductDetailInput input) throws Exception {
        return productDetail.productDetail_VxA(input);
    }
}