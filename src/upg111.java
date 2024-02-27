import java.util.Scanner;
public class upg111 {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        System.out.println("Skriv in max 1000st heltal avsluta med ctrl-d");
        int numberArray[] = new int[1000];
        int length = 0;
        int removedNumbers = 0;
        for (int i = 0; i < 1000; i++){
            if (tgb.hasNextInt()) {
                numberArray[i] = tgb.nextInt();
                length++;
            }
        }

        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < length; i1++) {
                if (i1 == i) {
                    i1++;
                }
                if (numberArray[i1] == numberArray[i]) {
                    for(int j = i1; j < length; j++)
                    {
                        numberArray[j] = numberArray[j+1];
                    }
                    length--;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(numberArray[i]);
        }
    }
}