/**
 * Exemple1.java
 * Ce programme saisit deux entiers et en affiche la somme
**/
import javax.swing.JOptionPane;

public class Exemple1 {
    public static void main(String args[]) {
        String chaine1, chaine2;
        int entier1, entier2, somme;
    
        chaine1 = JOptionPane.showInputDialog("Entrez un premier nombre entier");
        chaine2 = JOptionPane.showInputDialog("Entrez un second nombre entier");
    
        entier1 = Integer.parseInt(chaine1);
        entier2 = Integer.parseInt(chaine2);
    
        somme = entier1 + entier2;
    
        JOptionPane.showMessageDialog(null, "La somme des deux entiers est " + somme);
    
        System.exit(0);
    }
}