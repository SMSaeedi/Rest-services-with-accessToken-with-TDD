package com.example.demo.productDetail.webService;

import com.example.demo.productDetail.model.ProductDetailInput;
import com.example.demo.productDetail.model.ProductDetailOutput;
import com.example.demo.productDetail.model.ProductDetailPojo;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.productDetail.demo.example.com/")
public interface ProductDetail {

    @WebMethod(operationName = "productDetail_Vx0")
    public ProductDetailOutput productDetail_Vx0(
            @WebParam(name = "input") ProductDetailInput input) throws Exception;

    @WebMethod(operationName = "productDetail_Vx0_token")
    public ProductDetailOutput productDetail_Vx0_token(
            @WebParam(name = "input") ProductDetailPojo input) throws Exception;

    @WebMethod(operationName = "productDetail_VxA")
    public ProductDetailOutput productDetail_VxA(
            @WebParam(name = "input") ProductDetailInput input) throws Exception;
}