package com.example.demo.newProducts.webService;

import com.example.demo.newProducts.model.NewProductsInput;
import com.example.demo.newProducts.model.NewProductsOutput;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.newProducts.demo.example.com/")
public interface NewProduct {

    @WebMethod(operationName = "newProducts_Vx0")
    public NewProductsOutput newProducts_Vx0(@WebParam(name = "input") NewProductsInput subject) throws Exception;

    @WebMethod(operationName = "newProducts_VxA")
    public NewProductsOutput newProducts_VxA(@WebParam(name = "input") NewProductsInput subject) throws Exception;

}