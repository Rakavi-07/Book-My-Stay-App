import java.util.Arrays;

public class UseCase17SortBogieNames {

    public static void main(String[] args) {

        System.out.println("Sort Bogie Names using Arrays.sort()\n");

        // array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "General",
                "AC",
                "FirstClass",
                "ChairCar"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // built-in sort
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}