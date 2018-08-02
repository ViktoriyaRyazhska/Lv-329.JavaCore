
import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.firstInMonth;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        Random r = new Random();
        r.ints(0, 9).limit(10).sorted().forEach(System.out::print);
        System.out.println();

        int[] arr = r.ints(0, 9).limit(8).toArray();
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();

        Integer[] arr1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.stream(arr1).forEach(System.out::print);
        System.out.println();

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list.stream().filter(x -> x > 8).count());

        IntSummaryStatistics statistics = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max - " + statistics.getMax());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());
        System.out.println(localDate1);
    }
}
