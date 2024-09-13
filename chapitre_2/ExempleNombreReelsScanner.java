import java.util.Scanner;

public class ExempleNombreReelsScanner {
    public static void main(String[] args){
        double reel1, reel2, somme;

        Scanner unScanner = new Scanner(System.in); // Création d'un objet Scanner

        System.out.println("Entrez un premier nombre réel : ");
        reel1 = unScanner.nextDouble(); // Lecture d'un nombre réel

        System.out.println("Entrez un deuxième nombre réel : ");
        reel2 = unScanner.nextDouble(); // Lecture d'un nombre réel

        somme = reel1 + reel2;

        System.out.println("La somme de " + reel1 + " et " + reel2 + " est " + somme);
    }
}
