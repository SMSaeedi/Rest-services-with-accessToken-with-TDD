package com.example.demo.stockLevel.webService.impl;

import com.example.demo.stockLevel.model.StockLevel_Vx0;
import com.example.demo.stockLevel.model.StockLevel_Vx033;
import com.example.demo.stockLevel.model.StockLevel_Vx057;
import com.example.demo.stockLevel.model.StockLevel_VxA;
import com.example.demo.delivery.object.PaymentResult;
import com.example.demo.stockLevel.webService.StockLevel;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "StockLevel")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class StockLevelImpl implements StockLevel {

    @Override
    public long stockLevelTransaction_Vx0(PaymentResult input, long threshold) {
        return new StockLevel_Vx0().stockLevelTransaction(input.getW_id(), input.getD_id(), threshold);
    }

    @Override
    public long stockLevelTransaction_Vx0Test(PaymentResult input, long threshold) {
        return new StockLevel_Vx0().stockLevelTransactionTest(input.getW_id(), input.getD_id(), threshold);
    }

    @Override
    public long stockLevelTransaction_Vx033(
            PaymentResult input, long threshold) {
        return new StockLevel_Vx033().stockLevelTransaction(input.getW_id(), input.getD_id(), threshold);
    }

    @Override
    public long stockLevelTransaction_Vx057(
            PaymentResult input, long threshold) {
        return new StockLevel_Vx057().stockLevelTransaction(input.getW_id(), input.getD_id(), threshold);
    }

    @Override
    public long stockLevelTransaction_VxA(
            PaymentResult input, long threshold) {
        return new StockLevel_VxA().stockLevelTransaction(input.getW_id(), input.getD_id(), threshold);
    }
}
