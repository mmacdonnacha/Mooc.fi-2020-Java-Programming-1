
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Int array unsorted: " + Arrays.toString(array));
        Main.sort(array);
        System.out.println("Int array sorted:   " + Arrays.toString(array));
        
        String[] strings = {"tuv", "cde", "ijk", "mno", "xyz", "abc"};
        System.out.println("String array unsorted: " + Arrays.toString(strings));
        Main.sort(strings);
        System.out.println("String array unsorted: " + Arrays.toString(strings));
        
        ArrayList<Integer> arrayInt = new ArrayList<>();
        arrayInt.add(3); 
        arrayInt.add(1);
        arrayInt.add(5); 
        arrayInt.add(99);
        arrayInt.add(3);
        arrayInt.add(12);
        System.out.println("Int list unsorted: " + arrayInt);
        Main.sortIntegers(arrayInt);
        System.out.println("Int list unsorted: " + arrayInt);
        
        
        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.add("tuv"); 
        arrayString.add("cde");
        arrayString.add("ijk"); 
        arrayString.add("mno");
        arrayString.add("xyz");
        arrayString.add("abc");
        System.out.println("String list unsorted: " + arrayString);
        Main.sortStrings(arrayString);
        System.out.println("String list unsorted: " + arrayString);
        
        
    }

    public static void sort(int[] array) {
        // that sorts an array of integers.
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        // that sorts an array of strings.
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        //that sorts a list of integers.
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        // that sorts a list of strings.
        Collections.sort(strings);
    }

}
