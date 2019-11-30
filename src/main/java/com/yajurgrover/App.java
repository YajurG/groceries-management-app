package com.yajurgrover;

import java.util.ArrayList;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    private Map<String, Integer> groceryQuantities;
    private Map<String, Float> groceryPrices; 
    private ArrayList<String> groceries;

    public App(ArrayList<String> groceries, Map<String, Float> groceryPrices)
    {
        this.groceries = groceries;
        this.groceryPrices = groceryPrices;
    }

    // updates groceryQuantities to show how many of each item was bought
    public void getGroceryQuantities() {
        for (String item : groceries){
            if (this.groceryQuantities.containsKey(item)){
                Integer q = this.groceryQuantities.get(item);
                q++;
                this.groceryQuantities.put(item, q);
            } else {
                this.groceryQuantities.put(item, 1);
            }
        }
    }

    
}
