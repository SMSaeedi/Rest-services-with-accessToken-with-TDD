package com.example.demo.newProducts.webService.impl;

import com.example.demo.newProducts.model.*;
import com.example.demo.newProducts.webService.NewProduct;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "NewProduct")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class NewProductImpl implements NewProduct {

    @Override
    public NewProductsOutput newProducts_Vx0(NewProductsInput input) throws Exception {
            return new NewProducts_Vx0().test(input);
    }

    @Override
    public NewProductsOutput newProducts_VxA(NewProductsInput input) throws Exception {
        return new NewProducts_VxA().process(input);
    }

}