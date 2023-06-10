import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double getAverage(int values[])
    {
        double average = 0;
        int x = 0;
        int sum = 0;

        for (x = 0; x < values.length; x++) {
            sum = values[x] + sum;
        }
        average = sum / values.length;

        return average;
    }
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        int x;
        int sum = 0;
        int avg = 0;
        Scanner pipe = new Scanner(System.in);

        for (x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for (x = 0; x < dataPoints.length; x++) {
            System.out.printf("%d", dataPoints[x]);
            System.out.printf(" | ");
        }
        for (x = 0; x < dataPoints.length; x++) {
            sum = dataPoints[x] + sum;
        }
        avg = sum / dataPoints.length;

        System.out.println("\n" + "The sum is " + sum + " and the average is " + avg);

        int number = SafeInput.getRangedInt(pipe, "Pick a number", 1, 100);
        int numberTimes = 0;

        for (x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == number)
            {
                numberTimes = numberTimes + 1;
            }
        }
        System.out.println("Your number was found " + numberTimes + " times");

        int numberTwo = SafeInput.getRangedInt(pipe, "Pick a number", 1, 100);
        boolean found = false;

        for (x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == numberTwo)
            {
                found = true;
                System.out.println("Your number was found at the " + x + " position");
                break;
            }
        }
        if (found == false)
        {
            System.out.println("Your number was not found");
        }

        int min = 0;
        int max = 0;

        min = dataPoints[0];
        max = dataPoints[0];
        for (x = 0; x < dataPoints.length; x++)
        {
            if (min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if (max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum is " + min + " and the maximum is " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
}