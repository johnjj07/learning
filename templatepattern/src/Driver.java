/**
 * Created by slurmsy on 6/28/15.
 */
public class Driver {

    public static void main(String[] args) {
        int sizeToMake = Integer.valueOf(args[0]);

        System.out.println("MEAN:");
        Average newMean = new FindMean(sizeToMake);
        newMean.calculateAverage();

        System.out.println("\nMEDIAN:");
        Average newMedian = new FindMedian(sizeToMake);
        newMedian.calculateAverage();

        System.out.println("\nMODE:");
        Average newMode = new FindMode(sizeToMake);
        newMode.calculateAverage();
    }
}
