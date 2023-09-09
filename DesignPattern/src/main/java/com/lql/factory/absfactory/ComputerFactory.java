package com.lql.factory.absfactory;


import com.lql.factory.entity.Keyboard;
import com.lql.factory.entity.Mouse;

public interface ComputerFactory {
    Mouse createMouse();

    Keyboard createKeyboard();
}
