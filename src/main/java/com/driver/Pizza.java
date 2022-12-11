package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int extracheese=80;
    private int extrtoppings;
    private int takeAway=20;

    private  boolean addcheese=false;
    private boolean addtopping=false;
    private  boolean addtakeAway=false;
    private boolean billgenerated=false;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price=300;
            extrtoppings=70;
        }else{
            price=400;
            extrtoppings=120;
        }
        bill="base price of the pizze : "+price+"\n";
        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addcheese==false){
            price=price+extracheese;
            addcheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addtopping==false){
            price=price+extrtoppings;
            addtopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addtakeAway==false){
            price=price+takeAway;
            addtakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(billgenerated==false){
            billgenerated=true;
            if(addcheese==true){
                bill=bill+"Extra Cheese :"+extracheese+"\n";
            }
            if(addtopping==true){
                bill=bill+"Extra Topping :"+extrtoppings+"\n";
            }
            if (addtakeAway==true){
                bill=bill+"TakeAway :"+takeAway+"\n";
            }
            bill=bill+"total price: "+price+"\n";
        }
        return this.bill;
    }
}
