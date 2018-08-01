import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        Random r = new Random();
        r.ints(0, 10).limit(10).sorted().forEach(System.out::println);

        int[] arr =r.ints().limit(8).toArray();
        System.out.println(Arrays.stream(arr).average());
        Integer[] l =arr.f
        List list= Arrays.asList(arr);
        list.stream().mapToInt(x -> x).filter(x -> x >3).count();

    }
}
