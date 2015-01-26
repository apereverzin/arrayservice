package com.alertme.quiz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * @author andreypereverzin
 */
public class ArrayServiceTest {
    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowExceptionIfArrayIsNull() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] subarray = new Integer[] {4, 5};
        
        arrayService.getSubarrayIndex(null, subarray);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowExceptionIfASubarrayIsNull() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {2, 3, 4, 5};
        
        arrayService.getSubarrayIndex(array, null);
    }
    
    @Test
    public void shouldReturnSubarrayIndexForIntegers() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {2, 3, 4, 5};
        Integer[] subarray = new Integer[] {4, 5};
        
        assertEquals(2, arrayService.getSubarrayIndex(array, subarray));
    }
    
    @Test
    public void shouldNotFindSubarrayIfArrayDoesNotContainIt() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {2, 3, 4, 5};
        Integer[] subarray = new Integer[] {4, 6};
        
        assertEquals(-1, arrayService.getSubarrayIndex(array, subarray));
    }
    
    @Test
    public void shouldFindEqualSubarray() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {2, 3, 4, 5};
        Integer[] subarray = new Integer[] {2, 3, 4, 5,};
        
        assertEquals(0, arrayService.getSubarrayIndex(array, subarray));
    }
    
    @Test
    public void shouldNotFindLongerSubarray() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {2, 3, 4, 5};
        Integer[] subarray = new Integer[] {2, 3, 4, 5, 6};
        
        assertEquals(-1, arrayService.getSubarrayIndex(array, subarray));
    }
    
    @Test
    public void shouldFindEmptySubarray() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {2, 3, 4, 5};
        Integer[] subarray = new Integer[] {};
        
        assertEquals(0, arrayService.getSubarrayIndex(array, subarray));
    }
    
    @Test
    public void shouldFindEmptySubarrayForEmptyArray() {
        ArrayService<Integer> arrayService = new ArrayService<>();
        Integer[] array = new Integer[] {};
        Integer[] subarray = new Integer[] {};
        
        assertEquals(0, arrayService.getSubarrayIndex(array, subarray));
    }
    
    @Test
    public void shouldReturnSubarrayIndexForStrings() {
        ArrayService<String> arrayService = new ArrayService<>();
        String[] array = new String[] {"a", "b", "c", "d"};
        String[] subarray = new String[] {"c", "d"};
        
        assertEquals(2, arrayService.getSubarrayIndex(array, subarray));
    }
}
