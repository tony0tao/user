package com.tony.user.demo.son;

import com.tony.user.demo.TestDemo;

public class DemoSon extends TestDemo {

    @Override
    public String eat(String food) {

        return "子类的重载的吃"+food;
    }
}
