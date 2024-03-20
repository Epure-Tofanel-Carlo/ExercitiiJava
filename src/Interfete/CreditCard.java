package Interfete;

public record CreditCard(String utilizator) implements BankCard {
    private static int spentAmount=0;
    @Override
    public void doTransaction(double amount){
        System.out.println("Utilizator " + utilizator + " a cheltuit " + amount);
        spentAmount += amount;
        System.out.println("Suma totala cheltuita cu carduri de credit este " + spentAmount);


    }

}
