import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        System.out.println("Hello my Dear friend! It's your pocket calculator!");

        Scanner sc = new Scanner (System.in);

        boolean running = true;

        while (running) {

            System.out.println("Input first number: ");
            int a1 = sc.nextInt();

            System.out.println("Input second number: ");
            int a2 = sc.nextInt();

            System.out.println("Choose what you want to do with these numbers" +
                    "\n1 - (a+b)" +
                    "\n2 - (a-b)" +
                    "\n3 - (a*b)" +
                    "\n4 - (a/b)");

            int knopka = sc.nextInt();

            switch (knopka) {
                case 1:

                    summa(a1, a2);
                    break;
                case 2:

                    raznost(a1, a2);
                    break;
                case 3:

                    umnogenie(a1, a2);
                    break;
                case 4:

                    delenie(a1, a2);
                    break;
                default:
                    System.out.println("ERROR! Please repeat!");
            }

            System.out.println("Would you like to continue? (y/n)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("y")) {
                running = true;
            }else if (answer.equalsIgnoreCase("n")) {
                running = false;
            }else{
                System.out.println("ERROR! Please repeat!");
                continue;
            }

        }
        sc.close();

        System.out.println("Thank you for taking advantage of my opportunities! " +
                "You can help the development of the project here:\n https://github.com/PersianFlacc/Calculator");

    }

    static void summa(int a1, int a2) {
        System.out.println("Your answer: " + (a1 + a2));
    }

    static void raznost(int a1, int a2) {
        System.out.println("Your answer: " + (a1 - a2));
    }

    static void umnogenie(int a1, int a2) {
        System.out.println("Your answer: " + (a1 * a2));
    }

    static void delenie(double a1, double a2) {
        if (a2 == 0) {
            System.out.println("ERROR! You can't divide by 0!");
        } else {
            System.out.println("Your answer: " + a1/a2);
        }
    }
}