/**
 * Created by slurmsy on 6/28/15.
 */
public class FindMean extends Average{

    public FindMean(int number) {
        super(number);
    }

    @Override
    public void findAverage() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The mean average is: " + sum/numbers.length);
    }

    @Override
    public void avgerageType() {
        System.out.println("Finding the mean average...");
    }


}
