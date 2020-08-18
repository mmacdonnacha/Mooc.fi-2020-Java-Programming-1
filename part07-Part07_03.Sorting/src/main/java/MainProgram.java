
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));

        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        // indices:         0  1  2  3  4
        // int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers2);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int num : array) {
            if (smallest > num) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(Arrays.toString(array));
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);

        }
    }
}
