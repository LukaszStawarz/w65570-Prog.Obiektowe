import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        //zadanie1();
        zadanie7();
    }

        public static void zadanie1() {
        double[]array=new double[10];
        double suma = 0, srednia;

            System.out.println(" elementy tablicy: ");
            for (int i = 0; i < array.length; i++) {
                array[i]=Losuj();
                suma+=array[i];
                System.out.println(array[i]+"\t");
            }
            System.out.println("Suma: "+suma+ ", średnia: "+suma/ array.length);

            System.out.println("\n wersja foreach");
            //foreach
            suma=0;
            for(double data:array){
                System.out.println(array+"\t");
                suma+=data;
            }
            System.out.println("Suma: "+suma+ ", średnia: "+suma/ array.length);
    }

        public static double Losuj(){
            Random rand = new Random();
            double Liczba = rand.nextDouble(26)-10; //-10 ,15
            return Liczba;
        }


    public static void zadanie7() {
            String [] pierwszaTablica;
            pierwszaTablica=new String[]{"Andrzeju"};
            String[] drugaTablica;
            drugaTablica=new String[]{"Andrzeju"};
                if  (pierwszaTablica == drugaTablica) {
                    System.out.println("Tablice sa takie same.");
                } else {
                    System.out.println("Tablice nie sa takie same.");
                }


        }
    }






}
