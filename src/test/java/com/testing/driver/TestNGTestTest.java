package com.testing.driver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestNGTestTest {

    @Test(dataProvider = "dp")
    public void testJiSuan(int x , int y ) {
        TestNGTest t = new TestNGTest();
        t.jiSuan(x,y);
    }
    @DataProvider
    public static Object[][] dp(){
       return new Object[][] {
               {1,3},
               {6,9},
               {10,8}
       };
    }
    @Test(dataProvider = "dp")
    public void testJiSuan1(int i,int j){
        TestNGTest t = new TestNGTest();
        t.jiSuan(-i,j);
    }
}