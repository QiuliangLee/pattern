package com.lql.factory.factorymethod;


import com.lql.factory.entity.Mouse;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        MouseFactory mf = new HpMouseFactory();
        Mouse mouse = mf.createMouse();
        mouse.build();
    }
}
