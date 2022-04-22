package com.company;

public class Main {

    public static void main(String[] args)
    {
        Worker junior_dev=new Worker();
        junior_dev.setName("Ivan");
        junior_dev.setPosition("Junior wev developer");
        System.out.println("This is "+junior_dev.getName()+"'s salary:"+ junior_dev.calculate_salary());
    }
}
