package Model.Product;

import Model.Person.Customer;
import View.MainMenu.LoginMenu;

import java.util.ArrayList;

public class Product {
    String name;
    String productDescription;
    Double price;

    int inventory;

    Enum Category;

    public static ArrayList<Product> allProducts = new ArrayList<>();

    public Product(String name,Double price,String productDescription)
    {
        this.name = name;
        this.price = price;
        this.productDescription = productDescription;
        allProducts.add(this);
        this.inventory = 1;
    }

    public static boolean isThereAnyProduct(String name)
    {
        for (int i=0;i< allProducts.size();i++)
        {
            if(allProducts.get(i).name.equals(name))
            {
                return true;
            }
        }
        return false;
    }


    public static boolean productExist(String name)
    {
        for (int i=0;i< allProducts.size();i++)
        {
            if(allProducts.get(i).name.equals(name))
            {
                if(allProducts.get(i).inventory==0) {
                    return false;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void showProducts()
    {
        for (int i=0;i< allProducts.size();i++)
        {
            System.out.println("PRODUCT NUMBER: "+ (i+1));
            System.out.println("PRODUCT NAME: " + allProducts.get(i).name);
            System.out.println("PRODUCT PRICE : " + allProducts.get(i).price + "$");
            System.out.println("PRODUCT INVENTORY : " + allProducts.get(i).inventory);
            System.out.println("PRODUCT DESCRIPTION : " + allProducts.get(i).productDescription);
            System.out.println("***************************************************************");
        }
    }

    public static void increaseInventory(String name)
    {

        for (int i=0;i< allProducts.size();i++)
        {
            if(allProducts.get(i).name.equals(name))
            {
                allProducts.get(i).inventory+=1;
            }
        }

    }

    public static void decreaseInventory(String name)
    {

        for (int i=0;i< allProducts.size();i++)
        {
            if(allProducts.get(i).name.equals(name))
            {
                if (allProducts.get(i).inventory > 0) {
                    allProducts.get(i).inventory -= 1;
                }
                else {
                    System.out.println("this product inventory is 0!!!");

                }
            }
        }

    }

    public static void removeProduct(String name)
    {

        for (int i=0;i< allProducts.size();i++)
        {
            if(allProducts.get(i).name.equals(name))
            {
                allProducts.remove(i);
            }
        }

    }


    public static double getPrice(String name)
    {

        for (int i=0;i< allProducts.size();i++)
        {
            if(allProducts.get(i).name.equals(name))
            {
               return allProducts.get(i).price;
            }
        }

        return 0;

    }

}
