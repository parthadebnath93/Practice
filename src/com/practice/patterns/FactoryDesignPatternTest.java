package com.practice.patterns;
interface Light{
    public void switchOnLight();
}
class PhillipsLight implements Light{

    @Override
    public void switchOnLight() {
        System.out.println("Phillips light switched on:::::");
    }
}
class SyskaLight implements Light{

    @Override
    public void switchOnLight() {
        System.out.println("Syska Light Switched on:::::");
    }
}
class LightFactory{
    public static Light getInstance(String light){
        if(light.equalsIgnoreCase("Phillips")){
           return new PhillipsLight();
        }else if(light.equalsIgnoreCase("Syska")){
            return new SyskaLight();
        }
        else{
            return null;
        }
    }
}
public class FactoryDesignPatternTest {
    public static void main(String[] args) {
        Light lightObject=LightFactory.getInstance("wipro");
        if(lightObject!=null){
            lightObject.switchOnLight();
        }
        else {
            System.out.println("Invalid Input:::::");
        }
    }
}
