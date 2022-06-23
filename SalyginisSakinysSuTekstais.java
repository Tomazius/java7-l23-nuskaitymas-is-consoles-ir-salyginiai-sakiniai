import java.util.Scanner;

public class SalyginisSakinysSuTekstais {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite pirmą žodį = ");
        String zodis = skaitytuvas.nextLine();
        System.out.println("Įveskite antrą žodį = ");
        String tekstas = skaitytuvas.nextLine();

        System.out.println("zodis = " + zodis);
        System.out.println("tekstas = " + tekstas);

        boolean arVienodi = arZodziaiVienodi(zodis, tekstas);
        System.out.println("Ar žodžiai yra vienodi = " + arVienodi);

        System.out.println("----------------------------------");
        System.out.println("Lyginant du žodžius rezultatas: " + palygintiSkaicius(zodis.length(), tekstas.length()));

        System.out.println("----------------------------------");
        System.out.println("Lyginant du žodžius rezultatas: " + lyginimoZodinisRezultatas(palygintiSkaicius(zodis.length(), tekstas.length())));

        // paskutinis pavyzdys - ife negalima lyginti String su ==, o reikia lyginti su equals() arba equalsIgnoreCase();
        System.out.println("----------------------------------");
        String str1 = "namas";
        String str2 = "namras";
        if (str1.equals(str2)){
            System.out.println("Žodžiai vienodi");
        }
        else {
            System.out.println("Žodžiai skiriasi");
        }

    }

    public static boolean arZodziaiVienodi(String a, String b){
        boolean arYra;
        arYra = a.equalsIgnoreCase(b);
        return arYra;
    }

    /**
     * Funkcija palygina du skaicius
     * @param a pirmas skaicius
     * @param b antras skaicius
     * @return grazina 1 jei a>b, grazina -1, jei a<b; grazina 0 jei vienodi.
     */
    public static int palygintiSkaicius (int a, int b){
        if (a > b){
            return 1;
        }
        else if (b > a){
            return -1;
        }
        else {
            return 0;
        }
    }


    public static String lyginimoZodinisRezultatas(int rezultatas){
        if (rezultatas <= -1){
            return "Antras ilgesnis";
        }
        else if(rezultatas >= 1){
            return "Pirmas ilgesnis";
        }
        else return "Abu vienodi";
    }
}
