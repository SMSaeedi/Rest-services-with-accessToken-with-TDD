package com.example.demo.doTitleSearch.webService;

import com.example.demo.doTitleSearch.model.Book;
import com.example.demo.newProducts.model.ShortBook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.doTitleSearch.demo.example.com/")
public interface DoTitleSearch {

    @WebMethod(operationName = "doTitleSearch_Vx0")
    public List<Book> doTitleSearch_Vx0(@WebParam(name = "search_key") String search_key);


    @WebMethod(operationName = "doTitleSearch_VxA")
    public List<Book> doTitleSearch_VxA(@WebParam(name = "search_key") String search_key);

}