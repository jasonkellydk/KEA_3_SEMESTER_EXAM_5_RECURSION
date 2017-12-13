package dk.kea.examples;

import dk.kea.ExampleInterface;
import java.util.Arrays;

public class QuicksortRecursion implements ExampleInterface
{
    @Override
    public String getDescription() {
        return "In this example we are going to use recursion to sort an array";
    }

    @Override
    public String getName() {
        return "Quicksort using recursion";
    }

    @Override
    public void runExample() {
        int[] input = { 23, 31, 1, 21, 36, 72};

        System.out.println("Before sorting : " + Arrays.toString(input));

        recursiveQuickSort(input, 0, input.length - 1);

        // sort the integer array using quick sort algorithm
        System.out.println("After sorting : " + Arrays.toString(input));
    }

    /**
     * @param array
     * @param startIdx
     * @param endIdx
     */
    private static void recursiveQuickSort(int[] array, int startIdx, int endIdx)
    {
        int idx = partition(array, startIdx, endIdx);

        // Recursively call quicksort with left part of the partitioned array
        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }

        // Recursively call quick sort with right part of the partitioned array
        if (endIdx > idx) {
            recursiveQuickSort(array, idx, endIdx);
        }
    }

    /**
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int partition(int[] array, int left, int right)
    {
        int pivot = array[left];

        // taking first element as pivot
        while (left <= right) {

            //searching number which is greater than pivot, bottom up
            while (array[left] < pivot) {
                left++;
            }

            //searching number which is less than pivot, top down
            while (array[right] > pivot) {
                right--;
            }

            // swap the values
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                //increment left index and decrement right index
                left++;
                right--;
            }
        }

        return left;
    }
}
