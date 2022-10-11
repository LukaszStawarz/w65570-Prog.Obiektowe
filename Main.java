import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a= ");
        int a = in.nextInt();
        System.out.println("Podaj b= ");
        int b = in.nextInt();

        obliczenia(a, b);
        zadanie3();
        zadanie7();
    }




    //metody
    public static String getName() {
        return "Jan";
    }

    public static int getAge() {
        return 23;
    }

    public static void obliczenia(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    //zadanie 3
    public static void zadanie3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Ta liczba jest parzysta:");
        } else {
            System.out.println("ta liczba jest nie parzysta");
        }
    }

    public static void zadanie4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = in.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("ta liczba jest podzielna przez 3 i 5.");
        } else {
            System.out.println("ta liczba nie jest podzielna przez 3 i 5");
        }
    }

    public static void zadanie7() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int wylosowana= rand.nextInt(bound:b-a+1)+a;
        System.out.println(wylosowana);
    }
}


