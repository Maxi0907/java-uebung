public class Rechner {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        if (args.length >= 2) {
            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Ungültige Zahlen; benutze Standardwerte.");
            }
        }
        double sum = a + b;
        System.out.println("Ergebnis: " + sum);
    }
}
