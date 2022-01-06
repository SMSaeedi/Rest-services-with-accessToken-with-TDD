package com.example.demo.getPassword.controller;

import com.example.demo.getPassword.model.GetPassword_Vx0;
import com.example.demo.getPassword.model.GetPassword_VxA;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

@RestController
public class GetPasswordController {

    @RequestMapping("getPassword_Vx0")
    public String getPassword_Vx0(@RequestParam(name = "C_UNAME") String C_UNAME) {
        return new GetPassword_Vx0().getPassword(C_UNAME);
    }

    @RequestMapping("getPassword_Vx0Test")
    public String getPassword_Vx0Test(@RequestBody String C_UNAME) {
        return new GetPassword_Vx0().getPasswordTest(C_UNAME);
    }

    @RequestMapping("getPassword_VxA")
    public String getPassword_VxA(@RequestParam(name = "C_UNAME") String C_UNAME) {
        return new GetPassword_VxA().getPassword(C_UNAME);
    }
}