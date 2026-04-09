import java.util.*;
import java.util.stream.Collectors;

public class UseCase13PerformanceComparison {

    public static void main(String[] args) {

        System.out.println("Performance Comparison: Loop vs Stream\n");

        // Create sample data (bogies / rooms / numbers)
        List<Integer> data = new ArrayList<>();

        for (int i = 1; i <= 1000000; i++) {
            data.add(i);
        }

        // -------- LOOP APPROACH --------
        long startLoop = System.nanoTime();

        List<Integer> loopResult = new ArrayList<>();
        for (int num : data) {
            if (num % 2 == 0) {   // filtering condition
                loopResult.add(num);
            }
        }

        long endLoop = System.nanoTime();

        long loopTime = endLoop - startLoop;

        // -------- STREAM APPROACH --------
        long startStream = System.nanoTime();

        List<Integer> streamResult = data.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();

        long streamTime = endStream - startStream;

        // -------- OUTPUT --------
        System.out.println("Loop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}