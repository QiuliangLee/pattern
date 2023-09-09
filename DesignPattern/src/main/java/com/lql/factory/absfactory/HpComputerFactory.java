package com.lql.factory.absfactory;


import com.lql.factory.entity.HpKeyboard;
import com.lql.factory.entity.HpMouse;
import com.lql.factory.entity.Keyboard;
import com.lql.factory.entity.Mouse;

public class HpComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
