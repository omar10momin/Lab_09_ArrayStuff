import java.util.Random;

class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        // 1a. Declare an array of type int named dataPoints with a length of 100
        int[] dataPoints = new int[100];

        // 1b. Initialize each element in dataPoints array to a random value between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // 1c. Display the values of dataPoints array separated by " | "
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // For a new line after printing dataPoints

        // 1d. Calculate the sum and average of values in dataPoints array
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;

        // Output the sum and average with appropriate descriptions
        System.out.printf("The sum of the random array dataPoints is: %d%n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}
