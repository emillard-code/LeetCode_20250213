package com.project.solution;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 =  {2,11,10,1,3};
        System.out.println(minOperations(nums1, 10));

        int[] nums2 =  {1,1,2,4,9};
        System.out.println(minOperations(nums2, 20));

    }

    public static int minOperations(int[] nums, int k) {

        PriorityQueue<Long> minHeap = new PriorityQueue<Long>(Arrays.stream(nums)
                        .mapToLong(i -> (long) i).boxed().collect(Collectors.toList()));

        int numOperations = 0;

        while (minHeap.peek() < k) {

            long x = minHeap.remove();
            long y = minHeap.remove();
            minHeap.add(Math.min(x, y) * 2 + Math.max(x, y));

            numOperations++;

        }

        return numOperations;

    }

}
