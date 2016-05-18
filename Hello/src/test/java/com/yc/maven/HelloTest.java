package com.yc.maven;

import static org.junit.Assert.*;

import org.junit.Test;




/**
 * Unit test for simple App.
 */
public class HelloTest 
{
    @Test
    public void testSayHello()
    {
       Hello hello=new Hello();
       String result=hello.sayHello("小红");
       System.out.println("testSayHello==>"+result);
       assertEquals("你好,小红欢迎进入",result);
    }
}
