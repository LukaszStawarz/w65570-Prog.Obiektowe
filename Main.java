import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());
        //zadanie2();
        //zadanie3();
        zadanie7();
        //zadanie5();
        //zadanie6();
    }




    //zadanie1
    public static String getName() {
        return "Jan";
    }

    public static int getAge() {
        return 23;
    }

    public static void zadanie2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a= ");
        int a = in.nextInt();
        System.out.println("Podaj b= ");
        int b = in.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }


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

    public static void zadanie5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = in.nextInt();
        int b = 3;
        double potega = Math.pow(a,b);
        System.out.println("Liczba " +a+ " podniesiona do potęgi " +b+ " wynosi = " +potega);
    }
    public static void zadanie6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = in.nextInt();
        double pierwiastek = Math.sqrt(a);
        System.out.println("Pierwiastek z liczby  " +a+ " wynosi = " +pierwiastek);
    }

    public static void zadanie7() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj początek przediału a: ");
        int a = in.nextInt();
        System.out.println("Podaj koniec przedziału b: ");
        int b = in.nextInt();
        int randomA = rand.nextInt(b-a+1)+a;
        int randomB = rand.nextInt(b-a+1)+a;
        int randomC = rand.nextInt(b-a+1)+a;

        sprawdzTrojkat(randomA, randomB , randomC);

    }

    public static boolean sprawdzTrojkat(int a, int b, int c) {
        int aKwadrat = a * a;
        int bKwadrat = b * b;
        int cKwadrat = c * c;
        if(aKwadrat + bKwadrat == cKwadrat || aKwadrat + cKwadrat == bKwadrat || cKwadrat + bKwadrat == aKwadrat) {
            System.out.println("Podane boki tworzą trójkąt prostokątny");
            return true;

        } else {
            System.out.println("Podane boki nie tworzą trójkąta prostokątnego");
            return false;
        }
    }
}