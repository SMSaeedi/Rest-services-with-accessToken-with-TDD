package com.example.demo.stockLevel.webService;

import com.example.demo.delivery.object.PaymentResult;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://impl.webService.stockLevel.demo.example.com/")
public interface StockLevel {

    @WebMethod(operationName = "stockLevelTransaction_Vx0")
    public long stockLevelTransaction_Vx0(@WebParam(name = "input") PaymentResult input, long threshold) throws Exception;

    @WebMethod(operationName = "stockLevelTransaction_Vx0Test")
    public long stockLevelTransaction_Vx0Test(@WebParam(name = "input") PaymentResult input, long threshold) throws Exception;

    @WebMethod(operationName = "stockLevelTransaction_Vx033")
    public long stockLevelTransaction_Vx033(@WebParam(name = "input") PaymentResult input, long threshold) throws Exception;

    @WebMethod(operationName = "stockLevelTransaction_Vx057")
    public long stockLevelTransaction_Vx057(@WebParam(name = "input") PaymentResult input, long threshold) throws Exception;

    @WebMethod(operationName = "stockLevelTransaction_VxA")
    public long stockLevelTransaction_VxA(@WebParam(name = "input") PaymentResult input, long threshold) throws Exception;
}