package com.lql.factory.entity;

public class DellKeyboard implements Keyboard {
    @Override
    public void build() {
        System.out.println("生产戴尔键盘");
    }
}
