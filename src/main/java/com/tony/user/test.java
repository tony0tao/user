package com.tony.user;

import com.tony.user.demo.TestDemo;
import com.tony.user.demo.son.DemoSon;

public class test {

    public static void main(String[] args) {
        TestDemo demo = new DemoSon();
        TestDemo demo1 = new TestDemo();
        System.out.println(demo1.eat("食物"));
        System.out.println(demo.eat("食物"));
    }
}
