import java.time.Duration;
import java.time.Instant;

public class PerformanceTests {
    public static void main (String[] args){
        int factor = 20;
        testMaxHeapNlogN(factor);
        testMaxHeapN(factor);
    }
    public static void testMaxHeapNlogN(int factor){
        //Performance test
        int size = 500000 * factor;
        MaxHeap testHeap = new MaxHeap(size);
        Integer[] testData = new Integer[size];
        for(int i = 0; i < size; i++){
            testData[i] = i;
        }
        Instant startTime = Instant.now();
        testHeap.MaxHeapNLogN(testData);
        Instant endTime = Instant.now();
        long duration = Duration.between(startTime,endTime).toMillis();
        System.out.println("NlogN maxHeap : " + duration);

        //Got execution time from :                 https://howtodoinjava.com/java/date-time/execution-elapsed-time/
    }
    public static void testMaxHeapN(int factor){
        //Performance test
        int size = 500000 * factor;
        MaxHeap testHeap = new MaxHeap(size);
        Integer[] testData = new Integer[size];
        for(int i = 0; i < size; i++){
            testData[i] = i;
        }
        Instant startTime = Instant.now();
        testHeap.MaxHeapN(testData);
        Instant endTime = Instant.now();
        long duration = Duration.between(startTime,endTime).toMillis();
        System.out.println("N maxHeap : " + duration);

        //Got execution time from :                 https://howtodoinjava.com/java/date-time/execution-elapsed-time/
    }
}
