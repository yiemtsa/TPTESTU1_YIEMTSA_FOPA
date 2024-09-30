package com.stjean.operation;

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
	    
}
