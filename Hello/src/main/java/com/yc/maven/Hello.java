package com.yc.maven;

/**
 * Hello world!
 *
 */
public class Hello 
{
    public static void main( String[] args )
    {
       Hello hello=new Hello();
       String result=hello.sayHello("小刘");
       System.out.println("main==>"+result);
    }
    
    public String sayHello(String name){
    	String result="你好,"+name+"欢迎进入";
    	System.out.println(result);
		return result;
    }
}
