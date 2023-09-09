package com.lql.factory.absfactory;

import com.lql.factory.entity.Keyboard;
import com.lql.factory.entity.Mouse;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory cf = new HpComputerFactory();
        Mouse mouse = cf.createMouse();
        Keyboard keyboard = cf.createKeyboard();
        mouse.build();
        keyboard.build();
    }
}
