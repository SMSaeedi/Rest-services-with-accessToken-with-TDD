package com.example.demo.doSubjectSearch.controller;

import com.example.demo.doSubjectSearch.model.DoSubjectSearch_Vx0;
import com.example.demo.doSubjectSearch.model.DoSubjectSearch_VxA;
import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.newProducts.model.ShortBook;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@RestController
public class DoSubjectSearchController {

    @RequestMapping("doSubjectSearch_Vx0")
    public List<Book> doSubjectSearch_Vx0(@RequestBody String search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearch(search_key);
    }

    @RequestMapping("doSubjectSearch_Vx0Test")
    public List<Book> doSubjectSearch_Vx0Test(@RequestBody Book search_key) {
        return new DoSubjectSearch_Vx0().doSubjectSearchTest(search_key);
    }

    @RequestMapping("doSubjectSearch_VxA")
    public List<Book> doSubjectSearch_VxA(@RequestParam(name = "search_key") String search_key) {
        return new DoSubjectSearch_VxA().doSubjectSearch(search_key);
    }

}