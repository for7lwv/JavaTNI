import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop");
        System.out.println("-----------------------------");
        System.out.println("Press [1] to buy Pen");
        System.out.println("Press [2] to buy Notebook");
        System.out.print("Enter a number : ");


        int choice = sc.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.print("Invalid number! Enter a number, again : ");
            choice = sc.nextInt();
        }

        if (choice == 1) {
            product1.showInfo();
            System.out.print("How many Pens do you want to buy: ");
            int amt = sc.nextInt();
            product1.sell(amt);
            product1.showInfo();
        } else {
            product2.showInfo();
            System.out.print("How many Notebooks do you want to buy: ");
            int amt = sc.nextInt();
            product2.sell(amt);
            product2.showInfo();
        }

    }
}
