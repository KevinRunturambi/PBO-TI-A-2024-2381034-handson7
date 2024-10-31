package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount kevin = new BankAccount(100);

        kevin.withDraw(10);
        System.out.println("Current balance is: " + kevin.getBalance() );
    }
}