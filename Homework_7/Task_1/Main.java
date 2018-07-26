package Task_1;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        union(hashSet1, hashSet2);
        intersect(hashSet1, hashSet2);
    }

    private static void union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        System.out.println(set1);
    }

    private static void intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>();
        List<Integer> arr1 = new ArrayList<>(set1);
        List<Integer> arr2 = new ArrayList<>(set2);   /*Як можна витягнути елемент сета без перетворення в ліст?*/
        for (Integer anArr1 : arr1) {
            for (Integer anArr2 : arr2) {
                if (anArr1.equals(anArr2)) {
                    intersectSet.add(anArr1);
                }
            }
        }
        System.out.println(intersectSet);
    }
}
