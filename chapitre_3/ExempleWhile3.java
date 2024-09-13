import java.util.Scanner;

public class ExempleWhile3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int entier;
        int somme = 0;
        int compteur = 1;

        while(compteur <= 10) {
            System.out.print("Entrez un entier : ");
            entier = scanner.nextInt();

            somme += entier;
            compteur++;
        }

        System.out.println("La somme des 10 entiers est : " + somme);

        System.exit(0);
    }
}
