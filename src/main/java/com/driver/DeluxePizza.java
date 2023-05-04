package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        // public DeluxePizza(Boolean isVeg){
            super(isVeg);
            // your code goes here
           /* if(isVeg) {
                super.setprice(super.getPrice() + 150);
            }
            else{
                super.setprice(super.getPrice() + 200);
            }*/
       /* if(isVeg)
            super.setPrice(super.getPrice()+ 150);
        else super.setPrice(super.getPrice() + 200);*/
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }

    @Override
    public void addTakeaway() {


        }

}
