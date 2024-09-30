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
	       
	        Integer[] listeInteger = Arrays.stream(listes).boxed().toArray(Integer[]::new);
	        
	        Arrays.sort(listeInteger, Collections.reverseOrder());
	        
	        return listeInteger;
	    }
	 public static int factorielNegatif(int nombre) {
	        if (nombre < 0) {
	            throw new IllegalParamISIException("Le factoriel n'est pas défini pour les nombres négatifs.");
	        }
	        int resultat = 1;
	        for (int i = 1; i <= nombre; i++) {
	            resultat *= i;
	        }
	        return resultat;
	    }

}
