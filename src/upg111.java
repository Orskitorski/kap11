import java.util.Scanner;
public class upg111 {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        System.out.println("Skriv in max 1000st heltal avsluta med ctrl-d");
        int [] numberArray = new int[1000]; //skapar en ny array med storleken 1000
        int length = 0; //skapar en int för att hålla koll på längden senare
        for (int i = 0; i < 1000; i++){ //for loop som läser in användarens svar
            if (tgb.hasNextInt()) { //avslutar så fort användaren skriver in någonting annat förutom en int
                numberArray[i] = tgb.nextInt(); //sätter varje position i arrayen till ett värde användaren skrivit in
                length++;
            }
        }

        //går igenom arrayen med två olika positioner som jämförs med varandra för att se om svaren är kopior av varandra
        for (int firstArrayPosition = 0; firstArrayPosition < length; firstArrayPosition++) {
            for (int secondArrayPosition = 0; secondArrayPosition < length; secondArrayPosition++) {
                if (secondArrayPosition == firstArrayPosition) {
                    secondArrayPosition++;
                }
                if (numberArray[secondArrayPosition] == numberArray[firstArrayPosition]) {
                    for(int j = secondArrayPosition; j < length; j++) {
                        numberArray[j] = numberArray[j+1]; //ersätter kopian och flyttar fram alla tal efter kopian ett steg
                    }
                    length--; //längden på utskriften minskar varje gång man tar bort ett tal
                }
            }
        }

        for (int i = 0; i < length; i++) { //for loop som skriver ut den färdiga arrayen, begränsat till längden
            System.out.println(numberArray[i]);
        }
    }
}