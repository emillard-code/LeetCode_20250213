package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void minimumOperationsToExceedThresholdValueIITest() {

        int[] nums1 =  {2,11,10,1,3};
        assertEquals(2, LeetCodeAttempt.minimumOperationsToExceedThresholdValueII(nums1, 10));

        int[] nums2 =  {1,1,2,4,9};
        assertEquals(4, LeetCodeAttempt.minimumOperationsToExceedThresholdValueII(nums2, 20));

    }

}
