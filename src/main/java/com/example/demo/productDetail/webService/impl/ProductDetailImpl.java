package com.example.demo.productDetail.webService.impl;

import com.example.demo.productDetail.model.*;
import com.example.demo.productDetail.webService.ProductDetail;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;
import java.sql.Connection;

@WebService(serviceName = "ProductDetail")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class ProductDetailImpl implements ProductDetail {

    @Override
    public ProductDetailOutput productDetail_Vx0(ProductDetailInput input) throws Exception {
        Connection conn = null;
        return new ProductDetail_Vx0().getData(conn, input);
    }

    public ProductDetailOutput productDetail_Vx0_token(ProductDetailPojo input) throws Exception {
        return new ProductDetail_Vx0().getHardCodeData(input);
    }

    @Override
    public ProductDetailOutput productDetail_VxA(ProductDetailInput input) throws Exception {
        return new ProductDetail_VxA().process(input);
    }

}