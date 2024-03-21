/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_8;

/**
 *
 * @author Erm
 */
public class Telephone {
    private String model;
    private String seriaNumber;
    private String color;
    private boolean isMobile;

    public Telephone(String model, String seriaNumber, String color, boolean isMobile) {
        this.model = model;
        this.seriaNumber = seriaNumber;
        this.color = color;
        this.isMobile = isMobile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsMobile() {
        return isMobile;
    }

    public void setIsMobile(boolean isMobile) {
        this.isMobile = isMobile;
    }
    @Override
    public String toString(){
        return model+","+seriaNumber+","+color+","+isMobile;
    }
}
