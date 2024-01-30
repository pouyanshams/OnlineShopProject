package Model.Person;

import Model.Product.Product;
import View.MainMenu.LoginMenu;

import java.util.ArrayList;

public class Customer {
    private String username;
    private String password;

    CreditCard cart ;
    ShoppingList shoppingList;
    public static ArrayList<Customer> allCustomers = new ArrayList<>();

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new CreditCard();
        this.shoppingList = new ShoppingList();
        allCustomers.add(this);
    }


    public static boolean isThereAnyCustomer(String username,String password)
    {
        for (int i=0;i< allCustomers.size();i++)
        {
            if(allCustomers.get(i).username.equals(username) && allCustomers.get(i).password.equals(password))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isThereAnyCustomerUsername(String username)
    {
        for (int i=0;i< allCustomers.size();i++)
        {
            if(allCustomers.get(i).username.equals(username))
            {
                return true;
            }
        }
        return false;
    }

    public static void customerInfo(String username) {


        for (int i = 0; i < allCustomers.size(); i++) {
            if (allCustomers.get(i).username.equals(username)) {


                System.out.println("Your username is " + allCustomers.get(i).username);
                System.out.println("your password is " + allCustomers.get(i).password);
                System.out.println("your balance is : " + allCustomers.get(i).cart.balance + "$");
                System.out.println("Your Purchased Goods :");
                for (int k=0;k<ShoppingList.allShoppinglist.get(i).purchasedItems.size();k++)
                {
                    System.out.print( ShoppingList.allShoppinglist.get(i).purchasedItems.get(k) + "  ");
                }
                System.out.println();

            }
        }
    }

    public static void Depositmoney(String username,double money)
    {

        for (int i=0;i< allCustomers.size();i++)
        {
            if(allCustomers.get(i).username.equals(username))
            {
                allCustomers.get(i).cart.depositMoney(money);
                System.out.println("Done");
                break;
            }
        }
    }

    public static boolean DrawMoney(String username,double money)
    {

        for (int i=0;i< allCustomers.size();i++)
        {
            if(allCustomers.get(i).username.equals(username))
            {
                if(allCustomers.get(i).cart.drawMoney(money));
                {
                    break;
                }
            }
        }

        return false;
    }

    public static boolean haveEnoughMoney(String username,double money)
    {

        for (int i=0;i< allCustomers.size();i++)
        {
            if(allCustomers.get(i).username.equals(username))
            {
                if(allCustomers.get(i).cart.balance>money)
                {
                    return true;
                }
                else return false;
            }
        }
        return false;

    }

    public static int customerNumber(String username)
    {

        for (int i=0;i< allCustomers.size();i++)
        {
            if(allCustomers.get(i).username.equals(username))
            {
                return i;
            }
        }

       return 0;
    }


}
