package com.tnsif.Interfaces;

interface SmartDevice{
    void turnon();
    void turnoff();
    void getstatus();
}

class Smartlight implements SmartDevice{
    @Override
    public void turnon(){
        System.out.println("smart light on");
    }

    @Override 
    public void turnoff(){
        System.out.println("smart light off");
    }

    @Override 
    public void getstatus(){
        System.out.println("smart light is in standby machine");
    }
}

public interface interfacedemo{
    public static void main(String[] args) {
        SmartDevice s = new Smartlight();
        s.getstatus();
        s.turnoff();
        s.turnon();
    }
}