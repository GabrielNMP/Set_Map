package ru.skypro;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("park", "sea", "park", "beach", "town", "sea"));



    public static void main(String[] args) {
        for (int n: nums) {
            if (n % 2 == 1) {
                System.out.print(" " + n);
            }
        }
        System.out.println();
        Collections.sort(nums);
        int min = Integer.MIN_VALUE;
        for (int num : nums){
           if (num %2 == 0 && num != min) {
               System.out.print(" " + num);
               min = num;

           }
        }
        System.out.println();

        Set<String> duble = new HashSet<>(words);
        System.out.println("без дублей" + duble);

        System.out.println(words.size()- duble.size());
    }

}
