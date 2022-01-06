package com.example.demo.getBestSellers.webService.impl;

import com.example.demo.getBestSellers.model.GetBestSellers_Vx0;
import com.example.demo.getBestSellers.model.GetBestSellers_VxA;
import com.example.demo.getBestSellers.webService.GetBestSellers;
import com.example.demo.newProducts.model.ShortBook;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "GetBestSellers")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GetBestSellersImpl implements GetBestSellers {

   @Override
   public List<ShortBook> getBestSellers_Vx0(String subject) {
       return new GetBestSellers_Vx0().getBestSellers(subject);
   }

   @Override
   public List<ShortBook> getBestSellers_Vx0Test(ShortBook subject) {
       return new GetBestSellers_Vx0().getBestSellersTest(subject);
   }

    @Override
    public List<ShortBook> getBestSellers_VxA(String subject) {
        return new GetBestSellers_VxA().getBestSellers(subject);
    }

}