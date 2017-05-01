package nl.lkeijzer;

/**
 * Class to show that multiplying by 1+p and multiplying by 1-p after each other do not result in the same starting
 * number, where p is a float representing a percentage.
 *
 * @author L. Keijzer
 * @version 1.0
 */

public class Main {

    /**
     * Main method that shows {@code number} after each occurence of {@code number = \old number * (1 + percentage)
     * (1 - percentage)}
     * @param number the number to do the calculations on
     * @param percentage the percentage with which to multiply {@code number}
     * @throws InterruptedException if Thread.sleep() throws an InterruptedException
     */
    public Main(float number, float percentage) throws InterruptedException {
        float startingNumber = number;
        System.out.println("Start: " + number);
        float p = (1 + percentage) * (1 - percentage);
        while (number > 1 && number < 20 * startingNumber) {
            number *= p ;
            System.out.println(number);
            Thread.sleep(10);
        }
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                new Main(Float.parseFloat(args[0]), 0.05f);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (args.length == 2) {
            try {
                new Main(Float.parseFloat(args[0]), Float.parseFloat(args[1]));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
