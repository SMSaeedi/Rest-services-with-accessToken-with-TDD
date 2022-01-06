package com.example.demo.adminUpdate.controller;

import com.example.demo.adminUpdate.model.AdminUpdateInParams;
import com.example.demo.adminUpdate.model.AdminUpdateOutParams;
import com.example.demo.adminUpdate.model.AdminUpdate_Vx0;
import com.example.demo.adminUpdate.model.AdminUpdate_VxA;
import com.example.demo.adminUpdate.webService.impl.AdminUpdateImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminUpdateController {

    private AdminUpdateImpl adminUpdate = new AdminUpdateImpl();

    @RequestMapping("adminUpdate_Vx0")
    public void adminUpdate_Vx0(@RequestParam(name = "i_id") int i_id,
                                @RequestParam(name = "cost") double cost,
                                @RequestParam(name = "image") String image,
                                @RequestParam(name = "thumbnail") String thumbnail) {
        new AdminUpdate_Vx0().adminUpdate(i_id, cost, image, thumbnail);
    }

    @RequestMapping("adminUpdate_Vx0111")
    public AdminUpdateOutParams adminUpdate_Vx0111(@RequestBody AdminUpdateInParams inParams) {
        return adminUpdate.adminUpdate_Vx0111(inParams);
    }

    @RequestMapping("adminUpdate_VxA")
    public void adminUpdate_VxA(@RequestParam(name = "i_id") int i_id,
                                @RequestParam(name = "cost") double cost,
                                @RequestParam(name = "image") String image,
                                @RequestParam(name = "thumbnail") String thumbnail) {
        new AdminUpdate_VxA().adminUpdate(i_id, cost, image, thumbnail);
    }

}