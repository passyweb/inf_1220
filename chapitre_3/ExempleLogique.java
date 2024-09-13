import javax.swing.JOptionPane;

public class ExempleLogique {
    public static void main(String args[]) {
        String unString = JOptionPane.showInputDialog("Entrez un nombre entier");
        int unEntier = Integer.parseInt(unString);

        if (unEntier > 10 & unEntier < 20) {
            JOptionPane.showMessageDialog(null, unEntier + " est entre 10 et 20");
        } 

        if (unEntier == 100 | unEntier == 200) {
            JOptionPane.showMessageDialog(null, unEntier + "e nombre est 100 ou 200");
        }

        if (!(unEntier > 30)) {
            JOptionPane.showMessageDialog(null, unEntier + " est plus petit que 30");
        }

        System.exit(0);
    }
}
