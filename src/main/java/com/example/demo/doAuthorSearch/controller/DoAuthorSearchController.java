package com.example.demo.doAuthorSearch.controller;

import com.example.demo.doAuthorSearch.model.DoAuthorSearch_Vx0;
import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.tokenConfig.Authentication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@RestController
public class DoAuthorSearchController {

    @RequestMapping("doAuthorSearch_Vx0")
    public List<Book> doAuthorSearch_Vx0(@RequestBody String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }

    @RequestMapping("doAuthorSearch_Vx0Test")
    public List<Book> doAuthorSearch_Vx0Test(@RequestBody Book search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearchTest(search_key);
    }

    @RequestMapping("doAuthorSearch_VxA")
    public List<Book> doAuthorSearch_VxA( @RequestParam(name = "search_key") String search_key) {
        return new DoAuthorSearch_Vx0().doAuthorSearch(search_key);
    }
}