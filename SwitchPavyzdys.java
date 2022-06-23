public class SwitchPavyzdys {
    public static void main(String[] args) {

        System.out.println("Diena = " + dienaTekstuSuIFU(1));
        System.out.println("Diena = " + dienaTekstuSuIFU(4));
        System.out.println("Diena = " + dienaTekstuSuIFU(7));
        System.out.println("Diena = " + dienaTekstuSuIFU(8));

        System.out.println("pavyzdziai su switchu");
        System.out.println("Diena = " + dienaTekstuSuSwitchu(4));
        System.out.println("Diena = " + dienaTekstuSuSwitchu(7));
        System.out.println("Diena = " + dienaTekstuSuSwitchu(8));

        System.out.println("pavyzdziai su masyvu");
        System.out.println("Diena = " + dienaTekstuSuMasyvu(4));
        System.out.println("Diena = " + dienaTekstuSuMasyvu(7));
        System.out.println("Diena = " + dienaTekstuSuMasyvu(8));

        System.out.println("pavyzdziai su masyvu2");
        System.out.println("Diena = " + dienaTekstuSuMasyvu2(4));
        System.out.println("Diena = " + dienaTekstuSuMasyvu2(7));
        System.out.println("Diena = " + dienaTekstuSuMasyvu2(8));
    }

    /**
     * Funkcija konvertuoja dienos skaičių į tekstą
     *
     * @param diena dienos skaičius nuo 1 iki 7
     * @return dienos pavadinimą į pirmad, antrad ....
     */
    public static String dienaTekstuSuIFU(int diena) {
        if (diena == 1) {
            return "Pirmadienis";
        } else if (diena == 2) {
            return "Antradienis";
        } else if (diena == 3) {
            return "Trečiadienis";
        } else if (diena == 4) {
            return "Ketvirtadienis";
        } else if (diena == 5) {
            return "Penktadienis";
        } else if (diena == 6) {
            return "Šeštadienis";
        } else if (diena == 7) {
            return "Sekmadienis";
        } else {
            return "Netinkama diena";
        }
    }

    /**
     * Funkcija konvertuoja
     *
     * @param diena
     * @return
     */
    public static String dienaTekstuSuSwitchu(int diena) {
        switch (diena) {
            case 1:
                return "Pirmadienis";
            //break; jei nebūtų return, po kiekvienu case reikia breakinti - sustabdyti funkciją, kad ji bereikalo netikrintų kitų funkcijų;
            case 2:
                return "Antradienis";
            case 3:
                return "Trečiadienis";
            case 4:
                return "Ketvirtadienis";
            case 5:
                return "Penktadienis";
            case 6:
                return "Šeštadienis";
            case 7:
                return "Sekmadienis";
            default:
                return "Tokios dienos nėra";


        }
    }

    public static String dienaTekstuSuMasyvu(int diena) {
        final String[] dienos = {"Pirmadienis", "Antradienis", "Trečiadienis", "Ketvirtadienis", "Penktadienis", "Šeštadienis", "Sekmadienis"};
        if ((diena <= 7) && (diena > 0)) {
            return dienos[diena - 1];
        } else {
            return "Netinkama diena";
        }
    }
    //dar kitaip su nuliniu masyvu
    public static String dienaTekstuSuMasyvu2(int diena) {
        final String[] dienos = {"Netinkama diena", "Pirmadienis", "Antradienis", "Trečiadienis", "Ketvirtadienis", "Penktadienis", "Šeštadienis", "Sekmadienis"};
        if ((diena <= 7) && (diena > 0)) {
            return dienos[diena];
        } else {
            return dienos[0];
        }
    }
}
