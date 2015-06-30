import java.util.Random;

/**
 * Created by slurmsy on 6/28/15.
 */
public abstract class Average {

    protected Integer[] numbers;

    public Average(int number) {
        numbers = new Integer[number];
        for (int i = 0; i < number; i++) {
            Random rand = new Random();
            numbers[i] = rand.nextInt(100);
        }
    }

    public abstract void findAverage();

    public abstract void avgerageType();

    public final void printNumbers() {
        String list = "";
        for (int i = 0; i < numbers.length-1; i++) {
            list += numbers[i] + ", ";
        }
        list += numbers[numbers.length - 1];
        System.out.println(list);
    }

    public final void calculateAverage() {
        printNumbers();
        sorted();
        avgerageType();
        findAverage();
    }

    public void sorted(){}

}
