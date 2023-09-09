package com.lql.factory.factorymethod;


import com.lql.factory.entity.IBMMouse;
import com.lql.factory.entity.Mouse;

public class IBMMouseFactory extends LenovoMouseFactory {
    @Override
    public Mouse createMouse() {
        return new IBMMouse();
    }
}
