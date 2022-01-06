package com.example.demo.doTitleSearch.controller;

import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.doTitleSearch.model.DoTitleSearch_Vx0;
import com.example.demo.doTitleSearch.model.DoTitleSearch_VxA;
import com.example.demo.newProducts.model.ShortBook;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

@RestController
public class DoTitleSearchController {

    @RequestMapping("doTitleSearch_Vx0")
    public List<Book> doTitleSearch_Vx0(@RequestParam(name = "search_key") String search_key) {
        return new DoTitleSearch_Vx0().doTitleSearch(search_key);
    }

    @RequestMapping("doTitleSearch_Vx0Test")
    public List<Book> doTitleSearch_Vx0Test(@RequestParam(name = "search_key") Book search_key) {
        return new DoTitleSearch_Vx0().doTitleSearchTest(search_key);
    }

    @RequestMapping("doTitleSearch_VxA")
    public  List<Book> doTitleSearch_VxA(@RequestParam(name = "search_key") String search_key) {
        return new DoTitleSearch_VxA().doTitleSearch(search_key);
    }

}