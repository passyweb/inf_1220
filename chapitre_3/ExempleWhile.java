import javax.swing.JOptionPane;

public class ExempleWhile {
    
    public static void main(String[] args) {
        int compteur = 1;

        while(compteur < 5) {
            JOptionPane.showMessageDialog(null, "Compteur = " + compteur);
            compteur++;
        }

        System.exit(0);
    }
}
