package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        // public DeluxePizza(Boolean isVeg){
            super(isVeg);
            // your code goes here
            if(isVeg) {
                super.setPrice(super.getPrice() + 150);
            }
            else{
                super.setPrice(super.getPrice() + 200);
            }
        }

}
