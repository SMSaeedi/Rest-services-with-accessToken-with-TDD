package com.example.demo.getUserName.webService.impl;

import com.example.demo.getUserName.model.GetUsername_Vx0;
import com.example.demo.getUserName.model.GetUsername_VxA;
import com.example.demo.getUserName.webService.GetUserName;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "GetUserName")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GetUserNameImpl implements GetUserName {

    @Override
    public String getUserName_Vx0(int C_ID) {
            return new GetUsername_Vx0().getUserName(C_ID);
    }

    @Override
    public String getUserName_Vx0Test(String C_ID) {
            return new GetUsername_Vx0().getUserNameTest(C_ID);
    }

    @Override
    public String getUserName_VxA(int C_ID) {
            return new GetUsername_VxA().getUserName(C_ID);
    }

}