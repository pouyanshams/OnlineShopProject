package Model.Person;

import java.util.ArrayList;

public class CreditCard {
    double balance;
    public static ArrayList<CreditCard> allCreditCard = new ArrayList<>();

    public CreditCard()
    {
        this.balance = 0;
        allCreditCard.add(this);
    }

    public boolean drawMoney(Double money)
    {
        if(this.balance >= money)
        {
            this.balance -= money;
            return true;
        }
        else{
            System.out.println("you dont have enough money");
            return false;
        }
    }

    public void depositMoney(Double money)
    {
      this.balance+=money;
    }


}

