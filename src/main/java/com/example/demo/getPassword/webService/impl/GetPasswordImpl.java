package com.example.demo.getPassword.webService.impl;

import com.example.demo.getPassword.model.GetPassword_Vx0;
import com.example.demo.getPassword.model.GetPassword_VxA;
import com.example.demo.getPassword.webService.GetPassword;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(serviceName = "GetPassword")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class GetPasswordImpl implements GetPassword {

    @Override
    public String getPassword_Vx0(String C_UNAME) {
        return new GetPassword_Vx0().getPassword(C_UNAME);
    }

    @Override
    public String getPassword_Vx0Test(String C_UNAME) {
        return new GetPassword_Vx0().getPasswordTest(C_UNAME);
    }

    @Override
    public String getPassword_VxA(String C_UNAME) {
        return new GetPassword_VxA().getPassword(C_UNAME);
    }

}