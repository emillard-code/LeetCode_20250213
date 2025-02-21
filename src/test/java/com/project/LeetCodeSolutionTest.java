package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void minOperationsTest() {

        int[] nums1 =  {2,11,10,1,3};
        assertEquals(2, LeetCodeSolution.minOperations(nums1, 10));

        int[] nums2 =  {1,1,2,4,9};
        assertEquals(4, LeetCodeSolution.minOperations(nums2, 20));

    }

}
