package com.practice.patterns;
class Student{
    private int roll;
    private String name;
    private String address;

    public Student(Builder std){
        this.roll=std.roll;
        this.name=std.name;
        this.address=std.address;
    }
    static class Builder{
        private int roll;
        private String name;
        private String address;
        private Builder(){

        }
        public static  Builder newInstance(){
            return new Builder();
        }
        public  Builder setRoll(int roll){
            this.roll=roll;
            return this;
        }
        public Builder setAddress(String address){
            this.address=address;
            return this;
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
    @Override
    public String toString()
    {
        return "id = " + this.roll + ", name = " + this.name +
                ", address = " + this.address;
    }
}
    class StudentReceiver{
    private volatile Student student;
        public StudentReceiver(){
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    student=Student.Builder.newInstance().setRoll(10).setName("Partha").setAddress("Agartala").build();
                }
            });
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    student=Student.Builder.newInstance().setRoll(11).setName("Suman").setAddress("Tripura").build();
                }
            });
            t1.start();
            t2.start();
        }
        public Student getStudent(){
            return student;
        }
    }


public class BuilderPatternTest {

    public static void main(String[] args) {

    }
}
