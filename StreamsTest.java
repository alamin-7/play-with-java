import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String args []){

        List<Integer> nums = Arrays.asList(4,1,5,2,3);

        nums.stream().
        filter(n -> n % 2 == 0).
        forEach(n-> System.out.println(n));
    }
}
