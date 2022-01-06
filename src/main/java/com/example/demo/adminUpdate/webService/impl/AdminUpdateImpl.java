package com.example.demo.adminUpdate.webService.impl;

import com.example.demo.adminUpdate.model.AdminUpdateInParams;
import com.example.demo.adminUpdate.model.AdminUpdateOutParams;
import com.example.demo.adminUpdate.model.AdminUpdate_Vx0;
import com.example.demo.adminUpdate.model.AdminUpdate_VxA;
import com.example.demo.adminUpdate.webService.AdminUpdate;
import com.example.demo.tokenConfig.Authentication;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "AdminUpdate")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class AdminUpdateImpl implements AdminUpdate {

    @Override
    public void adminUpdate_Vx0(int i_id, double cost, String image, String thumbnail) {
        new AdminUpdate_Vx0().adminUpdate(i_id, cost, image, thumbnail);
    }

    @Override
    public AdminUpdateOutParams adminUpdate_Vx0111(AdminUpdateInParams input) {
        return new AdminUpdate_Vx0().hardCodeData(input);
    }

    @Override
    public void adminUpdate_VxA(int i_id, double cost, String image, String thumbnail) {
        new AdminUpdate_VxA().adminUpdate(i_id, cost, image, thumbnail);
    }
}