package com.tnsif.abstraction;

abstract class payment{
    abstract void pay(double amount);

    void transactioninfo(){
        System.out.println("payment processing");
    }
}

class creditcard extends payment{
    @Override
    void pay(double amount){
        System.out.println("paid "+amount +" using credit card");
    }
}

class upi extends payment{
    @Override
    void pay(double amount){
        System.out.println("paid "+amount +" using upi");
    }
}

public class abstractionexample {
    public static void main(String[] args) {
        payment p1 = new creditcard();
        p1.pay(500);
        p1.transactioninfo();

        payment p2 = new upi();
        p2.pay(500);
        p2.transactioninfo();
    }
}
