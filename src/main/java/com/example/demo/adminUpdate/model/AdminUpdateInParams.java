package com.example.demo.adminUpdate.model;

import jdk.nashorn.internal.objects.annotations.Setter;

public class AdminUpdateInParams {

    private int i_id;
    private double cost;
    private String image;
    private String thumbnail;

    public AdminUpdateInParams() {
    }

    public AdminUpdateInParams(int i_id, double cost, String image, String thumbnail) {
        this.i_id = i_id;
        this.cost = cost;
        this.image = image;
        this.thumbnail = thumbnail;
    }

    public int getI_id() {
        return i_id;
    }

    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "AdminUpdateInParams{" +
                "i_id=" + i_id +
                ", cost=" + cost +
                ", image='" + image + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}