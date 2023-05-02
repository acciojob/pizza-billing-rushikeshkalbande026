package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePizzaPrice;
    private int extraCheesePrice= 80;
    private int extraToppingPrice= 70;
    private int paperbagPrice= 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isExtraCheeseAdded = true;
       // System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppingsAdded = true;
        //System.out.println("Extra toppings added");
        this.price += extraToppingPrice;
    }

    public void addTakeaway(){
        // your code goes here
        isOptedForTakeAway = true;
       // System.out.println("Take away opted");
        this.price += paperbagPrice;

    }

    public String getBill(){
        // your code goes here
        String bill = "";
        System.out.println("Base Price Of The Pizza: " +basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: " +extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings Added: " +extraToppingPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill += "Paperbag Added: " +paperbagPrice+ "\n";
        }
        bill += "Total Price: " +this.price +"\n";
        System.out.println(bill);
        return this.bill;
    }
}
