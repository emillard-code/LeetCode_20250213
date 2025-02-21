package com.project.attempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 =  {2,11,10,1,3};
        System.out.println(minimumOperationsToExceedThresholdValueII(nums1, 10));

        int[] nums2 =  {1,1,2,4,9};
        System.out.println(minimumOperationsToExceedThresholdValueII(nums2, 20));

    }

    // This method returns the minimum operations needed to exceed threshold int k.
    public static int minimumOperationsToExceedThresholdValueII(int[] nums, int k) {

        // First, we convert our array to an ArrayList to easier work with it.
        List<Integer> numsList = new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        // We sort the array so that earliest indexes have the smallest values.
        // int numberOfOperations will carry the number of operations needed to cross the threshold.
        Collections.sort(numsList);
        int numberOfOperations = 0;

        // We continue this loop as long as the minimum value is less than int k, and we have 2 or more values.
        while (numsList.get(0) < k && numsList.size() >= 2) {

            int x = numsList.get(0);
            int y = numsList.get(1);

            // We remove the two smallest values from the list.
            numsList.remove(0);
            numsList.remove(0);

            // We add in a new value as per challenge specifications.
            // Then sort the list to keep the smallest values in the
            // front and increment int numbersOfOperations.
            numsList.add(Math.min(x, y) * 2 + Math.max(x, y));
            Collections.sort(numsList);

            numberOfOperations++;

        }

        // We return int numberOfOperations once we exit the loop.
        return numberOfOperations;

    }

}
