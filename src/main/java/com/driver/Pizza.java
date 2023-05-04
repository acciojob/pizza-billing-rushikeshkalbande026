package com.driver;

public class Pizza {

    private Boolean isVeg;
    private String bill;

    private int topping = 0, cheese = 0, paper = 0, price=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
        }
        else
            price = 400;
        bill = "";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void addExtraCheese(){
        cheese = cheese + 80;
        // your code goes here
    }

    public void addExtraToppings(){
        topping = topping + 70;
        // your code goes here
    }

    public void addTakeaway(){
        paper = paper + 20;
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + price + "\n";
        if(cheese != 0)
            bill = bill + "Extra Cheese Added: " + cheese + "\n";
        if(topping != 0)
            bill = bill + "Extra Toppings Added: " + topping + "\n";
        if(paper != 0)
            bill = bill + "Paperbag Added: " + paper + "\n";
        price = price + cheese + topping + paper;
        bill = bill + "Total Price: " + price + "";
        return this.bill;
    }
}

