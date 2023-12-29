import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci nome operazione");
        String operation = scanner.nextLine();
        switch (operation) {
            case("somma"):
                System.out.println("inserisci addendo 1");
                int add1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("inserisci il secondo addendo");
                int add2 = scanner.nextInt();
                scanner.nextLine();
                int sum = add1 + add2;
                System.out.println("la somma è " + sum);
                break;
            case("moltiplicazione"):
                System.out.println("inserisci fattore 1");
                int fact1= scanner.nextInt();
                scanner.nextLine();
                System.out.println("insersci fattore 2");
                int fact2 = scanner.nextInt();
                scanner.nextLine();
                int molt= fact1 * fact2;
                System.out.println("il risultato è " + molt);
                break;
            case("divisione"):
                System.out.println("inserisci dividendo");
                double div1= scanner.nextInt();
                scanner.nextLine();
                System.out.println("inserisci divisore");
                double div2= scanner.nextInt();
                scanner.nextLine();
                double quo= div1 / div2;
                System.out.println("il risultato è " + quo);
                break;
            case("sottrazione"):
                System.out.println("inserisci minuendo");
                int min= scanner.nextInt();
                scanner.nextLine();
                System.out.println("inserisci sottraendo");
                int sot= scanner.nextInt();
                scanner.nextLine();
                int ris= min - sot;
                System.out.println("il risultato è " + ris);
                break;
            case("potenza"):
                System.out.println("inserisci base");
                double base2= scanner.nextInt();
                scanner.nextLine();
                System.out.println("inserisci esponente");
                double esp= scanner.nextInt();
                scanner.nextLine();
                double pow= Math.pow(base2, esp);
                System.out.println("il risultato è " + pow);
                break;
            case("radice quadrata"):
                System.out.println("inserisci base");
                int base= scanner.nextInt();
                scanner.nextLine();
                double radq= Math.sqrt(base);
                System.out.println("il risultato è " + radq);
                break;
            case("radice cubica"):
                System.out.println("inserisci base");
                double base1= scanner.nextInt();
                scanner.nextLine();
                double cbrt= Math.cbrt(base1);
                System.out.println("il risultato è " + cbrt);
                break;

        }


    }


}


