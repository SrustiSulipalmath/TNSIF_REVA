package com.tnsif.CoreJavaPrograms.Polymorphism;

class RBI{
    int rateofinterest(){
        return 5;
    }

    void drink(){

    }
}

class SBI extends RBI{
    int rateofinterest(){
        return 8;
    }
}
public record methodoverriding() {

    public static void main(String[] args) {
       SBI s = new SBI();
       s.rateofinterest(); 
    }
    
}
