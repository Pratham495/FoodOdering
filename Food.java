package Project;

import java.util.Scanner;

public class Food {

    // first lets declare our variables for prices of food items
    int frenchfries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldcoffee = 100;
    int colddrinks = 80;
    int icetea = 80;
    int ch;
    int quantity;
    static int total;
    String again;

    Scanner sc = new Scanner(System.in);

    // lets create a method for displaying a food items
    public void displayMenu() {
        System.out.println("***************Welcome to our Food Zone***************");
        System.out.println("******************************************************");
        System.out.println("            1.frenchfries         100/- ");
        System.out.println("            2.Burger              120/- ");
        System.out.println("            3.Pastry              100/- ");
        System.out.println("            4.Pizza               200/- ");
        System.out.println("            5.Cold Coffee         100/- ");
        System.out.println("            6.Cold Drink           80/- ");
        System.out.println("            7.Ice Tea              80/- ");
        System.out.println("            8.Exit                      ");
        System.out.println("******************************************************");
        System.out.println("                What do you want to order Today??");
    }// our food menu is ready

    // Lets create a method to order a food items
    // using switch case

    public void generateBill() {
        System.out.println();
        System.out.println("******************Thank you for ordering******************");
        System.out.println("***********************Your Bill is :" + total + "**********************");
    }

    public void order() {
        while (true) {
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1: // frenchb fries
                    System.out.println("you have selected french fries");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + frenchfries;

                    break;

                case 2: // Burger
                    System.out.println("you have selected Burger");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + burger;

                    break;

                case 3: // Pastry
                    System.out.println("you have selected Pastry");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + pastry;

                    break;

                case 4: // pizza
                    System.out.println("you have selected pizza");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + pizza;

                    break;

                case 5: // cold coffee
                    System.out.println("you have selected cold coffee");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + coldcoffee;

                    break;

                case 6: // cold drinks
                    System.out.println("you have selected cold drinks");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + colddrinks;

                    break;

                case 7: // Ice tea
                    System.out.println("you have selected Ice tea");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity + icetea;

                    break;

                case 8:
                    System.exit(1);
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if (again.equalsIgnoreCase("y")) {
                order();
            } else if (again.equalsIgnoreCase("N")) {
                generateBill();
                System.exit(1);
            } else {
                System.out.println("Invalid choice");
            }

        }
    }
}
