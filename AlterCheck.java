import javax.swing.JOptionPane;

public class AlterCheck {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Wie heißt du?");
        String eingabe = JOptionPane.showInputDialog("Wie alt bist du?");

        try {
            int alter = Integer.parseInt(eingabe);
            String nachricht;

            if (alter < 13) {
                nachricht = "Hallo " + name + ", du bist ein Kind.";
            } else if (alter < 18) {
                nachricht = "Hallo " + name + ", du bist ein Jugendlicher.";
            } else {
                nachricht = "Hallo " + name + ", du bist volljaehrig!";
            }

            JOptionPane.showMessageDialog(null, nachricht);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bitte gib eine ganze Zahl für dein Alter ein.");
        }
    }
}
