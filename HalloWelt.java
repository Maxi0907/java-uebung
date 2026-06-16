import java.time.LocalDate;

public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo GitHub!");
        System.out.println("Name: " + System.getProperty("user.name"));
        System.out.println("Datum: " + LocalDate.now());
    }
}

