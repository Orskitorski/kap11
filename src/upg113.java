import java.util.Scanner;

public class upg113 {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        System.out.println("Skriv in ett antal tal, avlsuta med ctrl-d");
        double[] numberArray = new double[1000];
        int length = 0;
        for (int i = 0; i < 1000; i++){
            if (tgb.hasNextDouble()) {
                //numberArray[i] = doubleScannerAnswer();
                numberArray[i] = tgb.nextDouble();
                length++;
            }
        }
        System.out.println(ärSorterat(numberArray, length));
    }

    public static boolean ärSorterat(double[] numberArray, int length) {
        boolean sorterat = false;
        for (int firstArrayPosition = 1; firstArrayPosition < length; firstArrayPosition++) {
                int secondArrayPosition = firstArrayPosition-1;
                if (numberArray[secondArrayPosition] < numberArray[firstArrayPosition]) {
                    sorterat = true;
                }
                else {
                    sorterat = false;
                    return sorterat;
                }
        }
        return sorterat;
    }

    /*
    public static double doubleScannerAnswer(){
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            try {
                return Double.parseDouble(input.nextLine());
            }

            catch (Exception E) {
                System.out.println ("Only input a DOUBLE. Re-type your answer");
            }
        }
    }
    */
}


