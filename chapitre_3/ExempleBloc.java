import javax.swing.JOptionPane;

public class ExempleBloc {
    public static void main(String[] args) {

        String chaine1, chaine2;
        int entier1, entier2, somme;

        {
            chaine1 = JOptionPane.showInputDialog("Entrez un premier entier : ");
            chaine2 = JOptionPane.showInputDialog("Entrez un second entier : ");
        }

        entier1 = Integer.parseInt(chaine1);
        entier2 = Integer.parseInt(chaine2);

        somme = entier1 + entier2;

        JOptionPane.showMessageDialog(null, chaine1, chaine2, somme);

        System.exit(0);
    }
}