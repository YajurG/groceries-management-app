package com.yajurgrover;

import java.util.*;

public class App 
{
    private Map<String, Integer> groceryQuantities;
    private Map<String, Double> groceryPrices; 
    private ArrayList<String> groceries;
    private Integer numOfPeople;

    public App(ArrayList<String> groceries, Map<String, Double> groceryPrices, Integer numPeople)
    {
        this.groceries = groceries;
        this.groceryPrices = groceryPrices;
        this.groceryQuantities = updateGroceryQuantities();
        this.numOfPeople = numPeople;
    }

    // updates groceryQuantities to show how many of each item was bought
    public Map<String, Integer> updateGroceryQuantities() {
        Map<String, Integer> result = new TreeMap<String, Integer>();
        for (String item : groceries){
            if (result.containsKey(item)){
                Integer q = result.get(item);
                q++;
                result.put(item, q);
            } else {
                result.put(item, 1);
            }
        }
        return result;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (String item : this.groceryQuantities.keySet()){
            double itemPrice = this.groceryPrices.get(item);
            Integer itemQuantity = this.groceryQuantities.get(item);
            totalPrice += itemPrice * itemQuantity;
        }
        return totalPrice;
    }

    public Integer getItemQuantity(String item){
        return this.groceryQuantities.get(item);
    }

    public double getItemPrice(String item){
        return this.groceryPrices.get(item);
    }


}
