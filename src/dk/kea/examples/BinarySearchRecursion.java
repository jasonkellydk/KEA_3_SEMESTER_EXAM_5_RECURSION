package dk.kea.examples;

import dk.kea.ExampleInterface;

public class BinarySearchRecursion implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "In this example we are going to use recursion to search a sorted array";
    }

    @Override
    public String getName()
    {
        return "Binary search using recursion";
    }

    @Override
    public void runExample()
    {
        int[] arr1 = {2,45,234,567,876,900,976,999};

        int index = recursiveBinarySearch(arr1,0,arr1.length,45);

        System.out.println("Found 45 at " + index + " index");

        index = recursiveBinarySearch(arr1,0,arr1.length,999);

        System.out.println("Found 999 at " + index + " index");

        index = recursiveBinarySearch(arr1,0,arr1.length,876);

        System.out.println("Found 876 at " + index + " index");
    }

    /**
     * @param sortedArray
     * @param start
     * @param end
     * @param key
     * @return
     */
    private int recursiveBinarySearch(int[] sortedArray, int start, int end, int key)
    {
        if (start < end) {
            int mid = start + (end - start) / 2;

            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);
            }

            if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);
            }

            return mid;
        }

        return -(start + 1);
    }
}
