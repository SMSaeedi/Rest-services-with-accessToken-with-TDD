package com.example.demo.getUserName.controller;

import com.example.demo.getUserName.model.*;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

@RestController
public class GetUserNameController {

    @RequestMapping("getUserName_Vx0")
    public String getUserName_Vx0(@RequestParam(name = "C_ID") int C_ID) throws Exception {
        return new GetUsername_Vx0().getUserName(C_ID);
    }

    @RequestMapping("getUserName_Vx0Test")
    public String getUserName_Vx0Test(@RequestBody String C_ID) {
        return new GetUsername_Vx0().getUserNameTest(C_ID);
    }

    @RequestMapping("getUserName_VxA")
    public String getUserName_VxA(@RequestParam(name = "C_ID") int C_ID) throws Exception {
        return new GetUsername_VxA().getUserName(C_ID);
    }
}