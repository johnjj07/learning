import java.util.*;

/**
 * Created by slurmsy on 6/28/15.
 */
public class FindMode extends Average {

    public FindMode(int number) {
        super(number);
    }

    @Override
    public void findAverage() {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (counts.containsKey(numbers[i])) {
                int current = counts.get(numbers[i]);
                counts.put(numbers[i], current + 1);
            } else {
                counts.put(numbers[i], 1);
            }
        }
        int highestCount = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > highestCount) {
                highestCount = entry.getValue();
            }
        }
        if (highestCount <= 1) {
            System.out.println("No Mode");
        } else {
            Set<Integer> numbers = counts.keySet();
            ArrayList<Integer> maxes = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() == highestCount) {
                    maxes.add(entry.getKey());
                }
            }
            System.out.println("The mode is: " + printList(maxes));
        }
    }

    private String printList(ArrayList<Integer> list) {
        String str = "";
        for (int i = 0; i < list.size() - 1; i++) {
            str += list.get(i) + ", ";
        }
        str += list.get(list.size() - 1);
        return str;
    }

    @Override
    public void avgerageType() {
        System.out.println("Finding the mode...");
    }
}
