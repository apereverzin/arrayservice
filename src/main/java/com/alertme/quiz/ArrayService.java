package com.alertme.quiz;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author andreypereverzin
 */
public class ArrayService <T> {
    public int getSubarrayIndex(T[] array, T[] subarray) {
        if (array == null || subarray == null) {
            throw new IllegalArgumentException("No argument should be null");
        }
        
        return Collections.indexOfSubList(Arrays.asList(array), Arrays.asList(subarray));
    }
}
