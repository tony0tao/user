package com.tony.user;

import com.tony.user.demo.TestDemo;
import com.tony.user.demo.son.DemoSon;

import java.math.BigDecimal;

public class test {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();

    }

    public static void test1() {
        TestDemo demo = new DemoSon();
        TestDemo demo1 = new TestDemo();
        System.out.println(demo1.eat("食物"));
        System.out.println(demo.eat("食物"));
    }

    public static void test2() {
        int[] arr = {1, 4, 1, 4, 2, 5, 4, 5, 8, 7, 8, 77, 88, 5, 4, 9, 6, 2, 4, 1, 5};
        int[] brr = new int[120];
        for (int i = 0; i < arr.length; i++) {
            brr[arr[i]] = brr[arr[i]] + 1;
        }

        for (int i = 0; i < brr.length; i++) {
            if (brr[i] > 0) {
                System.out.println("数组" + i + "出现的次数：" + brr[i]);
            }
        }
    }

    public static void test3() {

        int i = 1;
        int n = 1;
        int a = ++i;
        int b = n++;
        System.out.println("a=" + a + "__b=" + b + "__i=" + i + "__n=" + n);
    }

    public static void test4() {
        String str1 = "aceaa";
        String str2 = "aceaagasga";
        String str3 = "abc";
        System.out.println("str1=" + str1.compareTo(str1));
        System.out.println("str2=" + str1.compareTo(str2));
        System.out.println("str3=" + str1.compareTo(str3));
    }


    public static void test5() {
        BigDecimal bdc1 = new BigDecimal("0.05");
        BigDecimal bdc2 = new BigDecimal("1.3");
        BigDecimal bdc3 = new BigDecimal("5.12");

        float f1 = 0.05f;
        float f2 = 1.3f;
        float f3 = 5.12f;

        double d1 = 0.05D;
        double d2 = 1.4D;
        double d3 = 5.12D;

        System.out.println(f1 * f2);
        System.out.println(f1 * f3);
        System.out.println(f2 * f3);

        System.out.println(d1 * d2);
        System.out.println(d1 * f3);
        System.out.println(d2 * d3);

        System.out.println(bdc1.multiply(bdc2));
        System.out.println(bdc1.multiply(bdc3));
        System.out.println(bdc2.multiply(bdc3));

    }
}
