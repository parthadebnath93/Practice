package com.practice.oops;

public class ClonableExam implements Cloneable{
    private int id;
    private String name;
    public ClonableExam(int data,String name){
        this.id=data;
        this.name=name;
    }
    public void setId(int data){
        this.id=data;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (ClonableExam)super.clone();
    }

    @Override
    public String toString() {
        return "["+this.id+" "+this.name+"]";
    }
}
