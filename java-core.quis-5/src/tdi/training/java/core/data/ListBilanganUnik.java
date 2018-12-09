package tdi.training.java.core.data;

import java.util.*;

public class ListBilanganUnik {
    public static void main(String[] args) {
        Set<Integer> nilai = new HashSet<>(Arrays.asList(1, 3, 5, 10, 1, 20, 10, 1, 20, 9, 1));
        Object[] bilUnik = nilai.toArray();
        System.out.println(String.format("Index ke 0 adalah %s, index ke 1 adalah %s, dan index ke 3 adalah %s",
                bilUnik[0], bilUnik[1], bilUnik[3]));

        List<Integer> nilGanjil = new ArrayList<>();
        Iterator<Integer> iter = nilai.iterator();

        Integer i = 0;
        while (iter.hasNext()) {
            Integer number = iter.next();
            if (i % 2 == 1) {
                System.out.println(i);
                nilGanjil.add(number);
            }
            i++;
        }
    }
}