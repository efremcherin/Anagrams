import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String givenWord = readWord();
        int givenNumber = readNumber();

        int size = givenWord.length();
        int factorial = calculateFactorial(size);
        int numberOfAnagramsToPrint = Math.min(factorial, givenNumber);
        String[] anagramArray = new String[givenNumber];
        anagramArray = AnagramCreator.fillAnagramArray(givenWord, 0, size - 1, givenNumber, anagramArray);
        AnagramCreator.printAnagramArray(anagramArray, numberOfAnagramsToPrint);
    }

    private static int calculateFactorial(int size) {
        int i, fact = 1;
        if (size < 12) {
            for (i = 1; i <= size; i++) {
                fact = fact * i;
            }
        } else {
            fact = Integer.MAX_VALUE;
        }
        return fact;
    }

    private static String readWord() {
        System.out.println("Inserire la parola:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        return s;
    }

    private static int readNumber() {
        System.out.println("Inserire il numero:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }
}
