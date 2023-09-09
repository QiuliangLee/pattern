package com.lql.factory.absfactory;


import com.lql.factory.entity.Keyboard;
import com.lql.factory.entity.LenovoKeyboard;
import com.lql.factory.entity.LenovoMouse;
import com.lql.factory.entity.Mouse;

public class LenovoComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LenovoKeyboard();
    }
}
