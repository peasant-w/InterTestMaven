package com.testing.driver;

/**
 * @author wong
 * @date 2019-10-13
 */
public class TestNGTest {
    public static int jiSuan(int x, int y) {
        int z = 0;
        z = x * y;
        System.out.println(z);
        return z;
    }
    public static void main(String[] args){
        int a = jiSuan(1,2);
    }
}

