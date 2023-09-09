package com.lql.factory.entity;

public class HpKeyboard implements Keyboard {
    @Override
    public void build() {
        System.out.println("生产惠普键盘");
    }
}
