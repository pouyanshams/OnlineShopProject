package Model.Person;

import Model.Product.Product;

import java.util.ArrayList;

public class ShoppingList {

    public static ArrayList<ShoppingList> allShoppinglist = new ArrayList<>();
    public ArrayList<String> purchasedItems;


    public ShoppingList()
    {
        this.purchasedItems = new ArrayList<>();
        allShoppinglist.add(this);

    }



    public static void add(int x,String productName)
    {
        allShoppinglist.get(x).purchasedItems.add(productName);

    }






}
