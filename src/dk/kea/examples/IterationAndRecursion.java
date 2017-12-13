package dk.kea.examples;

import dk.kea.ExampleInterface;

public class IterationAndRecursion implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show how iterations and recursion can basicly do the same";
    }

    @Override
    public String getName()
    {
        return "Iteration and Recursion";
    }

    @Override
    public void runExample()
    {
        System.out.println("The iteration will run 1000 times and add to itself.");

        int result = 0;
        int numberOfIterations = 1000;

        result = iteration(numberOfIterations);
        System.out.println(result);

        System.out.println();

        System.out.println("The recursion will run 1000 times and add to itself");

        result = recursion(numberOfIterations, 0);
        System.out.println(result);

        System.out.println();
    }

    /**
     * Iteration example
     * @return
     */
    private int iteration(int numberOfIterations)
    {
        int result = 0;

        for (int i = 0; i < numberOfIterations; i++) {
            result += numberOfIterations;
        }

        return result;
    }

    /**
     * Recursion eksempel
     * @param numberOfIterations
     * @return
     */
    private int recursion(int numberOfIterations, int result)
    {
        if (result == (numberOfIterations * numberOfIterations)) {
            return result;
        }

        result = recursion(numberOfIterations, numberOfIterations + result);

        return result;
    }
}
