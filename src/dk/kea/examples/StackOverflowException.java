package dk.kea.examples;

import dk.kea.ExampleInterface;

public class StackOverflowException implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will use all of the available memory";
    }

    @Override
    public String getName()
    {
        return "Bad recursion (WARNING WILL DIE)";
    }

    @Override
    public void runExample()
    {
        try {
            recursing(1);
        } catch (StackOverflowError exception) {
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("The exception thrown is: " + exception.getClass());
        }
    }

    public static void recursing(int n)
    {
        System.out.print(n++);

        if ((n % 2) == 0) {
            System.out.println();
        }

        recursing(n);
    }
}
