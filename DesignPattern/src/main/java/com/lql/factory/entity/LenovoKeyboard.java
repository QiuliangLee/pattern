package com.lql.factory.entity;

public class LenovoKeyboard implements Keyboard {
    @Override
    public void build() {
        System.out.println("生产联想键盘");
    }
}
