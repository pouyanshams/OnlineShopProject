package Model.Person;

import Model.Product.Product;
import View.MainMenu.LoginMenu;

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


    public static boolean isProductInshoppinglist(int number,String name)
    {
        for (int i=0;i< allShoppinglist.get(number).purchasedItems.size();i++)
        {
            if(allShoppinglist.get(number).purchasedItems.get(i).equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public static void removeFromList(int number,String name)
    {
        for (int i=0;i< allShoppinglist.get(number).purchasedItems.size();i++)
        {
            if(allShoppinglist.get(number).purchasedItems.get(i).equals(name))
            {
                allShoppinglist.get(number).purchasedItems.remove(i);
                System.out.println("The Product Removed");
                Customer.Depositmoney(LoginMenu.currentUsername,Product.getPrice(name));
                Product.increaseInventory(name);
            }
        }

    }








}
