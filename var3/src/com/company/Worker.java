package com.company;

public class Worker
{
    private String position ;
    private String name;

    public void setPosition(String position)
    {
        this.position=position;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getPosition()
    {
        return  this.position;
    }
    public  String getName()
    {
        return  this.name;
    }

    public double calculate_salary()
    {
        int salary=160*300;
        return salary;
    }
}
