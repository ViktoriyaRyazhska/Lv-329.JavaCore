import java.util.*;

public class Homework7 {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> variable = new HashSet<>();
        variable.addAll(set1);
        variable.addAll(set2);
        return variable;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> variable = new HashSet<>();
        variable.addAll(set1);
        variable.retainAll(set2);
        return variable;
    }

    public static void main(String[] args) {
        // Task No.1
        Set<Integer> variable11 = new HashSet<>();
        variable11.add(0);
        variable11.add(1);
        Set<Integer> variable12 = new HashSet<>();
        variable12.add(0);
        variable12.add(2);
        System.out.println("The values of the set #1:\n" + variable11);
        System.out.println("The values of the set #2:\n" + variable12);
        System.out.println("The result of the 'union' method:\n" + union(variable11, variable12));
        System.out.println("The result of the 'intersect' method:\n" + intersect(variable11, variable12));

        // Task No.2
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Last Name #1", "First Name #1");
        personMap.put("Last Name #2", "First Name #2");
        personMap.put("Last Name #3", "First Name #3");
        personMap.put("Last Name #4", "First Name #4");
        personMap.put("Last Name #5", "First Name #5");
        personMap.put("Last Name #6", "First Name #6");
        personMap.put("Last Name #7", "First Name #7");
        personMap.put("Last Name #8", "First Name #8");
        personMap.put("Last Name #9", "First Name #9");
        personMap.put("Last Name #10", "First Name #10");
        for (Map.Entry<String, String> variable2 : personMap.entrySet()) {
            System.out.println(variable2.getKey() + " " + variable2.getValue());
        }
        Integer variable20 = 0;
        for (Map.Entry<String, String> variable21 : personMap.entrySet()) {
            for (Map.Entry<String, String> variable22 : personMap.entrySet()) {
                if (variable21.getValue().equals(variable22.getValue())) {
                    ++variable20;
                }
            }
        }
        if (variable20 > personMap.size()) {
            System.out.println("\nThere are at least two persons with the same First Name.\n");
        } else {
            System.out.println("\nThere are no at least two persons with the same First Name.\n");
        }
        if (personMap.containsValue("First Name #0")) {
            personMap.remove("Last Name #0");
        }
        for (Map.Entry<String, String> variable2 : personMap.entrySet()) {
            System.out.println(variable2.getKey() + " " + variable2.getValue());
        }

        // Task No.3
        List<Student> variable3 = new ArrayList<>();
        variable3.add(new Student("Name #1", 5));
        variable3.add(new Student("Name #2", 4));
        variable3.add(new Student("Name #3", 3));
        variable3.add(new Student("Name #4", 2));
        variable3.add(new Student("Name #5", 1));
        variable3.sort(new NameComparator());
        System.out.println("The list of the students sorted by the name:");
        for (Student variable : variable3) {
            System.out.println(variable);
        }
        variable3.sort(new CourseComparator());
        System.out.println("\nThe list of the students sorted by the number of the course:");
        for (Student variable : variable3) {
            System.out.println(variable);
        }
    }
}