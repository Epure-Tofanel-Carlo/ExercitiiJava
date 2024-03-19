import model.*;
import service.ServiceStorage;

import java.util.Scanner;


public class Application {



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Acum introdu comenzi(create, read, update, delete, quit):");
            String input = scanner.nextLine();

            switch (input) {
                case "create":
                    System.out.println("Ai introdus comanda: " + input);
                    ServiceStorage.create();

                    break;

                case "read":
                    System.out.println("Ai introdus comanda: " + input);
                    ServiceStorage.read();

                    break;

                case "update":

                    System.out.println("Ai introdus comanda: " + input);
                    ServiceStorage.update();
                    break;

                case "delete":

                    System.out.println("Ai introdus comanda: " + input);
                    ServiceStorage.delete();
                    break;

                case "quit":
                    System.out.println("Gata cu fotosinteza, la culcare toata lumea.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Comanda necunoscuta. Te rog sa introduci una dintre urmatoarele comenzi: create, read, update, delete, quit.");
            }
        }



    }
}