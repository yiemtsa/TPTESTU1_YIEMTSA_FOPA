package com.stjean.operation;

import java.util.Arrays;
import java.util.Collections;

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
	 
	 public static Integer[] trier(int[] listes) {
	        // Convertir le tableau d'int en tableau d'Integer
	        Integer[] listeInteger = Arrays.stream(listes).boxed().toArray(Integer[]::new);
	        
	        // Trier le tableau par ordre décroissant
	        Arrays.sort(listeInteger, Collections.reverseOrder());
	        
	        return listeInteger;
	    }

}
