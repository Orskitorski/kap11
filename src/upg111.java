import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        System.out.println("Skriv in max 1000st heltal");
        while (tgb.hasNextInt()) {
            int i = tgb.nextInt();
            System.out.println(i);
        }
    }
}