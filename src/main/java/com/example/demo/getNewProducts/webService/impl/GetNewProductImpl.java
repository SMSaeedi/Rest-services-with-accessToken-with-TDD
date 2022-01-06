package com.example.demo.getNewProducts.webService.impl;

import com.example.demo.getNewProducts.model.GetNewProducts_Vx0;
import com.example.demo.getNewProducts.model.GetNewProducts_VxA;
import com.example.demo.getNewProducts.model.ShortBook;
import com.example.demo.getNewProducts.webService.GetNewProduct;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "GetNewProduct")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GetNewProductImpl implements GetNewProduct {

    @Override
    public List<ShortBook> getNewProducts_Vx0(String subject) {
            return new GetNewProducts_Vx0().getNewProducts(subject);
    }

    @Override
    public List<ShortBook> getNewProducts_Vx0Test(String subject) {
            return new GetNewProducts_Vx0().getNewProductsTest(subject);
    }

    @Override
    public List<ShortBook> getNewProducts_VxA(String subject) {
        return new GetNewProducts_VxA().getNewProducts(subject);
    }
}