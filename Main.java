import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        System.out.println("Hello my Dear friend! It's your pocket calculator!");

        Scanner sc = new Scanner (System.in);

        boolean running = true;

        while (running) {

            System.out.println("Choose what you want to do with these numbers" +
                    "\n1 - (a+b)" +
                    "\n2 - (a-b)" +
                    "\n3 - (a*b)" +
                    "\n4 - (a/b)" +
                    "\n5 - (a%b)" +
                    "\n6 - (sqrt(x)" +
                    "\n7 - (pow(x,y))");

            int knopka = sc.nextInt();

            switch (knopka) {
                case 1:

                    System.out.println("Input first number: ");
                    int a1 = sc.nextInt();

                    System.out.println("Input second number: ");
                    int a2 = sc.nextInt();

                    summa(a1, a2);
                    break;
                case 2:

                    System.out.println("Input first number: ");
                    int b1 = sc.nextInt();

                    System.out.println("Input second number: ");
                    int b2 = sc.nextInt();

                    raznost(b1, b2);
                    break;
                case 3:

                    System.out.println("Input first number: ");
                    int c1 = sc.nextInt();

                    System.out.println("Input second number: ");
                    int c2 = sc.nextInt();

                    umnogenie(c1, c2);
                    break;
                case 4:

                    System.out.println("Input first number: ");
                    int d1 = sc.nextInt();

                    System.out.println("Input second number: ");
                    int d2 = sc.nextInt();

                    delenie(d1, d2);
                    break;
                case 5:

                    System.out.println("Input first number: ");
                    int d4 = sc.nextInt();

                    System.out.println("Input second number: ");
                    int d5 = sc.nextInt();

                    ostatok(d4, d5);
                    break;
                case 6:

                    System.out.println("Input your number: ");
                    int e = sc.nextInt();

                    koren(e);
                    break;
                case 7:

                    System.out.println("Input first number: ");
                    int f1 = sc.nextInt();

                    System.out.println("Input second number: ");
                    int f2 = sc.nextInt();

                    stepen(f1, f2);
                    continue;
            }

            System.out.println("Would you like to continue? (y/n)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("n")) {
                running = false;
            }

        }
        sc.close();

        System.out.println("Thank you for taking advantage of my opportunities! " +
                "You can help the development of the project here:\n https://github.com/PersianFlacc/Calculator");

    }

    static void summa(int a1, int a2) {
        System.out.println("Your answer: " + (a1 + a2));
    }

    static void raznost(int b1, int b2) {
        System.out.println("Your answer: " + (b1 - b2));
    }

    static void umnogenie(int c1, int c2) {
        System.out.println("Your answer: " + (c1 * c2));
    }

    static void delenie(int d1, int d2) {
        if (d2 == 0) {
            System.out.println("ERROR! You can't divide by 0!");
        } else {
            System.out.println("Your answer: " + (d1 / d2));
        }
    }

    static void ostatok(int d4, int d5) {
        System.out.println("Your answer: " + (d4 % d5));
    }

    static void koren(int e) {
        System.out.println("Your answer: " + Math.sqrt(e));
    }

    static void stepen(int f1, int f2) {
        System.out.println("Your answer: " + Math.pow(f1, f2));
    }
}