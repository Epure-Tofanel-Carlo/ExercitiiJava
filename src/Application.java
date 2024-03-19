import CalculArii.*;

import java.util.Scanner;

public class Application {
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

    }
}