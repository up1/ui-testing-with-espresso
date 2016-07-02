package com.example.somkiat.demohelloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {

    @BeforeClass
    public static void start() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void finish() {
        System.out.println("AfterClass");
    }

    @Before
    public void init() {
        System.out.println("Before");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }


    @After
    public void xxx() {
        System.out.println("After");
    }

}