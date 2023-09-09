package com.lql.factory.entity;

public class IBMMouse implements Mouse {
    @Override
    public void build() {
        System.out.println("生产联想旗下的IBM鼠标");
    }
}
