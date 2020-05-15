package com.practice.oops;
class Student implements  Cloneable{
    int id;
    String name;
    int rollNo;
    public Student(int id,String name,int rollNo){
        this.id=id;
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "[id:"+this.id+" name:"+this.name+" roll No:"+this.rollNo+"]";
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    @Override
    public boolean equals(Object obj) {
       boolean data= this.rollNo==(((Student)obj).rollNo);
        System.out.println("Is Equal::::"+data);
        return data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st=new Student(10,"Partha",101);
        Student st1=new Student(11,"Suman",102);
        Student st2= (Student) st.clone();
        System.out.println(st+" "+st1+" "+st2);
        System.out.println(st.equals(st2));
        System.out.println(st.hashCode()+" "+st2.hashCode());
        System.out.println(115&15);
    }
}
