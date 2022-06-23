import java.util.Scanner;

public class uzduotys0623DuomenuNuskaitymasConsolej {
    public static void main(String[] args) {
        int x;
        double kaina;
        Scanner skaitytuvas = new Scanner(System.in);


        //Paprasto int nuskaitymas
        System.out.println("Įveskite x: ");
        x = skaitytuvas.nextInt();
        System.out.println("x = " + x);

        //Double nuskaitymas
        System.out.println("Įveskite kainą: ");
        kaina = skaitytuvas.nextDouble();
        System.out.println("kaina = " + kaina);

        //Teksto nuskaitymas (kartais reikia peršokti per vieną eilutę (22), kad galėtų nuskaityti)
        skaitytuvas.nextLine();
        System.out.println("Įveskite tekstą: ");
        String tekstas = skaitytuvas.nextLine();
        System.out.println("tekstas = " + tekstas);
        
        
        // Kitas pvz, pirmą nuskaitome tokstą, tada einame į skaičius;

        System.out.println("--------------");
        int plotis;
        String adresas;

        System.out.println("Įveskite adresą: ");
        adresas = skaitytuvas.nextLine();
        System.out.println("adresas = " + adresas);

        System.out.println("Pavyzdys");
        plotis = skaitytuvas.nextInt();
        System.out.println("plotis = " + plotis);
    }




}
