package ru.skypro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int n: nums) {
            if (n % 2 == 1) {
                System.out.print(" " + n);
            }
        }
        System.out.println();
        for (int n: nums) {
            if (n % 2 != 1) {
                System.out.print(" " + n);
            }
        }
        System.out.println();

        List<String> words = new ArrayList<>(List.of("park", "sea", "park", "beach", "town", "sea"));
        Set<String> duble = new HashSet<>(words);
        System.out.println("без дублей" + duble);
        
    }

}
