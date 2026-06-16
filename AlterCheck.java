import javax.swing.JOptionPane;

public class AlterCheck {
    public static void main(String[] args) {
        // TODO 1: Frage per Popup nach dem Alter und merke dir die Eingabe
        String eingabe = JOptionPane.showInputDialog("Wie alt bist du?");

        // TODO 2: Wandle die Eingabe in eine ganze Zahl um
        int alter = Integer.parseInt(eingabe);

        // TODO 3: Bedingung -> ab 18 'volljaehrig', sonst 'minderjaehrig'
        if (alter >= 18) {
            JOptionPane.showMessageDialog(null, "Du bist volljaehrig!");
        } else {
            JOptionPane.showMessageDialog(null, "Du bist noch minderjaehrig.");
        }
    }
}
