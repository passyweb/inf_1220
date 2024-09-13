import javax.swing.JOptionPane;

public class ExempleCreationObjetString {
    public static void main(String args[]) {
        String s1 = new String("Bonjour");
        String s2 = s1;
        String s3 = new String("Bonjour");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println(s1.equals(s3));
    }
}
