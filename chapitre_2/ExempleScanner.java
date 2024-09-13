import java.util.Scanner;

public class ExempleScanner {
    public static void main(String[] args) {
        int entier1, entier2, somme;
        Scanner unScanner = new Scanner(System.in);

        System.out.print("Entrez un premier entier : ");
        entier1 = unScanner.nextInt();

        System.out.print("Entrez un deuxième entier : ");
        entier2 = unScanner.nextInt();

        somme = entier1 + entier2;

        System.out.println("La somme de " + entier1 + " et " + entier2 + " est " + somme);
    }
}