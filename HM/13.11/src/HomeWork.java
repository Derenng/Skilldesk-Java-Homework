import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(inString7("Это предложение содержит какие-то слова с большой длиной"));
        System.out.println(reverseString("Привет этот дивный мир"));
    }
    public static String inString7 (String txt){
        String[] arraysText = txt.split(" ");
        for (int index = 0; index < arraysText.length; index++) {
            String elementOfArray = arraysText[index]; // for index
            for (int innerIndex = index; innerIndex < arraysText.length; innerIndex++) {
                if (arraysText[innerIndex] == null || elementOfArray == null) {
                    continue;
                }
                if (elementOfArray.length() < 7) {
                    arraysText[index] = "";
                    continue;
                }
                if (elementOfArray.length() >= 7){
                    arraysText[index] = firstUpperCase(elementOfArray);
                }
            }
        }
        return Arrays.toString(arraysText);
    }
    public static String reverseString (String txt) {
        return new StringBuilder(txt).reverse().toString();
    }
    public static String firstUpperCase (String elementOfArray){
        if(elementOfArray == null || elementOfArray.isEmpty()) return "";
        int stringLength = elementOfArray.length();
        String firstletter = elementOfArray.substring (0,1);
        String lastletter = elementOfArray.substring ((stringLength-1),(stringLength));
        String newWord = firstletter.toUpperCase() + elementOfArray.substring(1,stringLength-1) +  lastletter.toUpperCase();
        return newWord;
    }
}
