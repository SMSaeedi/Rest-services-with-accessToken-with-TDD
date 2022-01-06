package com.example.demo.doAuthorSearch.webService;

import com.example.demo.doTitleSearch.model.Book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://impl.webService.doAuthorSearch.demo.example.com/")
public interface DoAuthorSearch {

    @WebMethod(operationName = "doAuthorSearch_Vx0")
    public List<Book> doAuthorSearch_Vx0(@WebParam(name = "search_key") String search_key);

    @WebMethod(operationName = "doAuthorSearch_Vx0Test")
    public List<Book> doAuthorSearch_Vx0Test(@WebParam(name = "search_key") Book search_key);

    @WebMethod(operationName = "doAuthorSearch_VxA")
    public List<Book> doAuthorSearch_VxA(@WebParam(name = "search_key") String search_key);

}