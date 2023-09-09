package com.lql.factory.entity;

public class DellMouse implements Mouse {
    @Override
    public void build() {
        System.out.println("生产戴尔鼠标");
    }
}
