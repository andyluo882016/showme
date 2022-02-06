package com.demo.show;

public class MyTest {

    String id;
    String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public MyTest(String id, String name) {
        this.id =id;
        this.name=name;
    }
    public static void main(String[] args) {
        System.out.println("Test me");
    }
}
