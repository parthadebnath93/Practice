package com.practice.oops;
final class TestImmutable implements Cloneable{
    final int rollNo;
    final String name;
    final Address address;
    public TestImmutable(int rollNo,String name,Address address) throws CloneNotSupportedException {
        this.rollNo=rollNo;
        this.name=name;
        this.address= (Address) address.clone();
        System.out.println(this.address.hashCode()+" "+address.hashCode());
    }
    public int getRollNo(){
        return this.rollNo;
    }
    public String getName(){
        return this.name;
    }
    public Address getAddress(){
        return this.address;
    }
}
class Address implements Cloneable{
    int pincode;
    int houseNo;
    String state;
    public Address(int pincode,int houseNo,String state){
        this.pincode=pincode;
        this.houseNo=houseNo;
        this.state=state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[pincode:"+this.pincode+" houseNo:"+this.pincode+" state:"+this.state+"]";
    }
}
public class ImmutableClassExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address ad=new Address(799211,221,"Tripura");
        TestImmutable im=new TestImmutable(101,"Partha",ad);
        ad.state="West Bengal";
        System.out.println(ad.toString()+"   "+im.getAddress().toString());
        System.out.println(ad.hashCode()+" "+im.getAddress().hashCode());
    }
}
