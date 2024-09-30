package com.stjean.operation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOperationMathematique {
	
	 @Test
	    public void testEstPositif() {
	        assertEquals(true, OperationMathematique.estPositif(3));
	        assertEquals(false, OperationMathematique.estPositif(-5));
	        assertEquals(true, OperationMathematique.estPositif(2));
	    }

	    @Test
	    public void testFactoriel() {
	        assertEquals(24, OperationMathematique.factoriel(4));
	        assertEquals(2, OperationMathematique.factoriel(2));
	        assertEquals(6, OperationMathematique.factoriel(3));
	    }

	    @Test
	    public void testTrier() {
	       
	        int[] input1 = {5, 3, 8, 1, 2};
	        Integer[] expected1 = {8, 5, 3, 2, 1};
	        assertArrayEquals(expected1, OperationMathematique.trier(input1));

	       
	        int[] input2 = {10, 9, 8, 7, 6};
	        Integer[] expected2 = {10, 9, 8, 7, 6};
	        assertArrayEquals(expected2, OperationMathematique.trier(input2));

	        
	        int[] input3 = {1, 2, 3, 4, 5};
	        Integer[] expected3 = {5, 4, 3, 2, 1};
	        assertArrayEquals(expected3, OperationMathematique.trier(input3));

	       
	        int[] input4 = {-1, -3, -2, -5, -4};
	        Integer[] expected4 = {-1, -2, -3, -4, -5};
	        assertArrayEquals(expected4, OperationMathematique.trier(input4));

	       
	        int[] input5 = {};
	        Integer[] expected5 = {};
	        assertArrayEquals(expected5, OperationMathematique.trier(input5));
	    }
	    
}
