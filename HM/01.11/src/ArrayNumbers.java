import java.util.Arrays;

public class ArrayNumbers {
    public static void main(String[] args) {
        int[] basicarray = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        int[] anotherone = new int[basicarray.length];
        int index = 0;

        for (int i = 0; i < basicarray.length; i++) {
            if (basicarray[i] % 2 != 0) {
                anotherone[index++] = basicarray[i];
            } //Деление с остачей, запись нового массива
        }

        if (anotherone.length != 0) {
            anotherone = Arrays.copyOf(anotherone, index);
        }//Подчистить пустые секции в массиве

        System.out.println(Arrays.toString(anotherone));

        Arrays.sort(anotherone);
        int maxNum = anotherone[anotherone.length - 1];

        System.out.println("Самое большое число = "+maxNum);
    }
}

