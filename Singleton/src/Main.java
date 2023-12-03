// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account h1 = new Account ("hj", 100000);
        Account h2 = new Account("mh", 200000);
        h1.deposit(20000);
        h2.withdraw(5000);
        User[] users;
        users = new User[10];
        for (int i=0; i < 10; i++){
            users[i] = new User("hj" + i);
            users[i].start();
        }
        /*Printer p1 = Printer.getInstance();
        System.out.println(p1.nn());
        Printer p2 = Printer.getInstance();
        System.out.println(p2.nn());
        p1.up();
        System.out.println(p2.nn());
        System.out.println(p1.nn());*/


    }
}