package BasicJava.POO.Module01;

public class App3 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000);

        Account b = new Account();
        b.deposit(100);

        a.transfer(200, b);

        a.printBalance();
        b.printBalance();
    }
}
