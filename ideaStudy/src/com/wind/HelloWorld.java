package com.wind;

public class HelloWorld {

   /**
    *姓名
    */
   private String name;
   /**
    *年龄
    */
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.testGood();

    }
    public void testGood(){
        System.out.println("good");
    }
}
