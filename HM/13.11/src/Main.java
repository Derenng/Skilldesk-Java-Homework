import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWords("one two one three one"));
        System.out.println(countUniqueWords("one two one three one"));
    }
    public static int countWords(String text) {
        int count = 0;
        String[] arraysText = text.split(" ");
        count = arraysText.length;
        return count;
    }
    public static int countUniqueWords(String text) {
        int count = 0;
        String[] arrays = text.split(" "); // ["one", "two", "one"]
        for (int index = 0; index < arrays.length; index++) {
            String elementOfArray = arrays[index]; // one
            for (int innerIndex = index + 1; innerIndex < arrays.length; innerIndex++) {
                // index == 1 arrays[0] == arrays[1]
                if (arrays[innerIndex] == null || elementOfArray == null) {
                    continue;
                }
                if (elementOfArray.equals(arrays[innerIndex])) {
                    arrays[index] = null;
                    arrays[innerIndex] = null;
                }
            }
        }
        count = arrays.length;
        return count;
    }
}