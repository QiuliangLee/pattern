package com.lql.factory.absfactory;


import com.lql.factory.entity.DellKeyboard;
import com.lql.factory.entity.DellMouse;
import com.lql.factory.entity.Keyboard;
import com.lql.factory.entity.Mouse;

public class DellComputerFactory implements ComputerFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
