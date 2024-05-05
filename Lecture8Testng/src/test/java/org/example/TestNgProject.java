package org.example;

import org.testng.annotations.*;


public class TestNgProject {
    @AfterClass
    public void testAfterMethod(){
        System.out.println("@AfterClass - After Class");
    }
    @Test(priority = 3)
    public void test1(){
        System.out.println("test 1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("test 2");
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("test 3");
    }
    @BeforeClass
    public void testBeforeMethod(){
        System.out.println("@BeforeClass - Before the Class");
    }
}
