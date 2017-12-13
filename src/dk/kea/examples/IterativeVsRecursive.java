package dk.kea.examples;

import dk.kea.ExampleInterface;

public class IterativeVsRecursive implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will run a loop and recursion given the same results, but the execution time will defer";
    }

    @Override
    public String getName()
    {
        return "Iteration vs Recursion";
    }

    @Override
    public void runExample()
    {
        // Use 4 to get 24.
        int number = 50;
        int result = 0;
        long start = 0;
        long end = 0;
        long elapsed = 0;

        start = System.nanoTime();

        result = iterate(number);

        end = System.nanoTime();

        elapsed = end - start;

        System.out.println("Iteration result: " + result + ". Execution time: " + elapsed);

        start = System.nanoTime();

        result = recursion(number);

        end = System.nanoTime();

        elapsed = end - start;

        System.out.println("Recursion result: " + result + ". Execution time: " + elapsed);
    }

    /**
     * Iterate calculating factorial
     * @param number
     * @return
     */
    private int iterate(int number)
    {
        int result = 1;

        if (number <= 1) {
            return result;
        }

        while (number > 1) {
            result *= number;
            number--;
        }

        return result;
    }

    /**
     * Recursion calculating factorial
     * @param number
     * @return
     */
    private int recursion(int number)
    {
        if (number <= 1) {
            return 1;
        }

        return number * recursion(number - 1);
    }
}
