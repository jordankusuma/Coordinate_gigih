package com.company.java;

public class Coordinates {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Coordinates(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double calculateX() {
        return this.x2 - this.x1;
    }
}
