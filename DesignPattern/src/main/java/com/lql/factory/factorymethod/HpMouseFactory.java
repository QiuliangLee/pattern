package com.lql.factory.factorymethod;


import com.lql.factory.entity.HpMouse;
import com.lql.factory.entity.Mouse;

public class HpMouseFactory implements MouseFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
}
