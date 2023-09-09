package com.lql.factory.entity;


public class HpMouse implements Mouse {
    @Override
    public void build() {
        System.out.println("生产惠普鼠标");
    }
}
