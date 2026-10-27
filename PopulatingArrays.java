import java.util.Arrays;

/**
 * Generates arrays of random integers, sorts them, and displays their averages.
 */
public final class PopulatingArrays {

    /** Number of values in each generated array. */
    private static final int ARRAY_SIZE = 10;

    /** Largest random integer generated, inclusive. */
    private static final int MAX_RANDOM_NUMBER = 100;

    /** Number of arrays displayed by the main method. */
    private static final int NUMBER_OF_RUNS = 5;

    /**
     * Prevents this utility class from being instantiated.
     */
    private PopulatingArrays() {
    }

    /**
     * Creates an array containing ten random numbers from 0 to 100.
     *
     * @return the array of random numbers
     */
    public static int[] populateArray() {
        int[] arrayOfNum = new int[ARRAY_SIZE];

        for (int i = 0; i < arrayOfNum.length; i++) {
            // Math.random() is from 0.0 up to (but not including) 1.0.
            // Multiplying by max + 1 gives integers from 0 through the max.
            arrayOfNum[i] = (int) (Math.random() * (MAX_RANDOM_NUMBER + 1));
        }

        return arrayOfNum;
    }

    /**
     * Sorts the array, prints its numbers, and calculates the average.
     *
     * @param arrayOfNum the numbers to sort and display
     */
    public static void calculateAverage(final int[] arrayOfNum) {
        Arrays.sort(arrayOfNum);

        int sum = 0;
        for (int number : arrayOfNum) {
            System.out.print(number + " ");
            sum += number;
        }

        double average = (double) sum / arrayOfNum.length;
        System.out.printf("  Average: %.1f%n", average);
    }

    /**
     * Generates and displays five arrays and their averages.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        for (int i = 0; i < NUMBER_OF_RUNS; i++) {
            int[] arrayOfNum = populateArray();

            for (int
                number : arrayOfNum) {
                System.out.print(number + " ");
            }
            System.out.println();

            calculateAverage(arrayOfNum);

            System.out.println();
        }
    }
}
