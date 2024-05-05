package org.example;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNgProject2 {

    @Test
    public void assertionTest(){
        Assert.assertEquals(2+3, 4, "Addition not correct");
    }

    @AfterClass
    public void testAfterMethod(){
        System.out.println("@AfterClass - After Class");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }
    @Test
    public void test2_1(){
        System.out.println("test 2_1");
    }
    @Test
    public void test2_2(){
        System.out.println("test 2_2");
    }
    @Test
    public void test3(){
        System.out.println("test 3");
    }

    @BeforeSuite
    public void test4(){
        System.out.println("BeforeSuit - Runs once before the suit execution");
    }
    @AfterSuite
    public void test5(){
        System.out.println("AfterSuit - Runs once after the suit execution");
    }
    @BeforeClass
    public void testBeforeMethod(){
        System.out.println("@BeforeClass - Before the Class");
    }
}
