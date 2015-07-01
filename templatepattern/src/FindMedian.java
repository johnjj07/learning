import java.util.Arrays;

/**
 * Created by slurmsy on 6/28/15.
 */
public class FindMedian extends Average {

    public FindMedian(int number) {
        super(number);
    }

    @Override
    public void findAverage() {
        if (numbers.length % 2 != 0) {
            System.out.println("The median is: " + numbers[numbers.length / 2]);
        } else {
            System.out.println("The median is: " + (numbers[(numbers.length / 2) - 1] + numbers[numbers.length / 2]) / 2);
        }

    }

    @Override
    public void avgerageType() {
        System.out.println("Finding the median...");
    }

    @Override
    public void sorted() {
        System.out.println("Sorted array:");
        Arrays.sort(numbers);
        String sorted = "";
        for (int i = 0; i < numbers.length-1; i++) {
            sorted += numbers[i] + ", ";
        }
        sorted += numbers[numbers.length - 1];
        System.out.println(sorted);
    }
}
