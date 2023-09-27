public class AnagramCreator {

    static int counter = 0;

    public static String[] fillAnagramArray(String givenWord, int start, int end, int givenNumber,
                                            String[] anagramArray) {
        if (start == end) {
            if (counter < givenNumber) {
                anagramArray[counter] = givenWord;
                counter = counter + 1;
            }
        } else {
            if (counter < givenNumber) {
                for (int i = start; i <= end; i++) {
                    givenWord = swap(givenWord, start, i);
                    fillAnagramArray(givenWord, start + 1, end, givenNumber, anagramArray);
                    givenWord = swap(givenWord, start, i);
                }
            }
        }
        return anagramArray;
    }

    public static void printAnagramArray(String[] anagramArray, int min) {
        System.out.println("Anagrammi:");
        for (int i = 0; i < min; i++) {
            System.out.println(anagramArray[i]);
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}