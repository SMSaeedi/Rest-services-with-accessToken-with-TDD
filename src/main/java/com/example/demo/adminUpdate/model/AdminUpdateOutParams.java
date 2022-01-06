package com.example.demo.adminUpdate.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdminUpdateOutParams {

    List<AdminUpdateInParams> setList = new ArrayList();

    public List<AdminUpdateInParams> getSetList() {
        return setList;
    }

    public void setSetList(List<AdminUpdateInParams> setList) {
        this.setList = setList;
    }

    public AdminUpdateOutParams() {
    }

    @Override
    public String toString() {
        return "AdminUpdateOutParams{" +
                "setList=" + setList +
                '}';
    }
}