package app;

import java.util.Arrays;

import static app.ArrayUtils.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {56, 79, 1, 12, 1987, 356, 43, 88, 88};
        int target = 12;

        System.out.println("Array before sort - " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("Array after sort - " + Arrays.toString(array));
        System.out.println();

        int index = ArrayUtils.binarySearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found by index " + index + "!");
        } else {
            System.out.println("Element " + target + " not found in array!");
        }
    }
}
