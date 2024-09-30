package com.stjean.operation;

public class OperationMathematique {
	public static boolean estPositif(int nombre) {
        return nombre > 0;
    }
	
	 public static int factoriel(int nombre) {
	        if (nombre < 0) {
	            throw new IllegalArgumentException("Le nombre doit être positif ou zéro.");
	        }
	        int resultat = 1;
	        for (int i = 1; i <= nombre; i++) {
	            resultat *= i;
	        }
	        return resultat;
	    }

}
