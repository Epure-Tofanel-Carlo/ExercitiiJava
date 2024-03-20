import CalculArii.*;
import Interfete.*;

import java.util.Scanner;

public class Application {
    public static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int raza,lungime,latime;

        System.out.println("Raza:");
        raza = cin.nextInt();

        System.out.println("Lungime:");
        lungime = cin.nextInt();

        System.out.println("Latime:");
        latime = cin.nextInt();

        Cerc cerc = new Cerc(raza);
        Patrat patrat = new Patrat(lungime,latime);
        System.out.println(cerc.calculPerimetru());
        System.out.println(patrat.calculPerimetru());

        shop();

    }

    public static void shop(){
        CreditCard creditCard = new CreditCard("Carlo");
        DebitCard debitCard = new DebitCard("Carlo",1234);
        ShoppingMall mall = new ShoppingMall();
        System.out.println("Cat costa produsul?");
        int valoare = cin.nextInt();
        cin.nextLine();
        System.out.println("Care card doriti sa il folositi? (debit sau credit)");

        String tip_card = cin.nextLine();
        tip_card = tip_card.toLowerCase();
        if(tip_card.equals( "credit")){
            mall.setCard(creditCard);
        }else{
            mall.setCard(debitCard);
        }

        mall.achizitie(valoare);

    }
}