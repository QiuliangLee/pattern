package com.lql.factory.entity;

public class LenovoMouse implements Mouse {
    @Override
    public void build() {
        System.out.println("生产联想鼠标");
    }
}
