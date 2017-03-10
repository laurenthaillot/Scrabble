package co.simplon.poleEmploi.scrabble;


import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;



public class Scrabble {
	
	
		
	public Map<String,Integer> valeurLettre;

	public Scrabble() {
		super();
		valeurLettre = new Hashtable<String, Integer>();
	
		valeurLettre.put("A",1);
		valeurLettre.put("B",3);
		valeurLettre.put("C",3);
		valeurLettre.put("D",2);
		valeurLettre.put("E",1);
		valeurLettre.put("F",4);
		valeurLettre.put("G",2);
		valeurLettre.put("H",4);
		valeurLettre.put("I",1);
		valeurLettre.put("J",8);
		valeurLettre.put("K",10);
		valeurLettre.put("L",1);
		valeurLettre.put("M",2);
		valeurLettre.put("N",1);
		valeurLettre.put("O",1);
		valeurLettre.put("P",3);
		valeurLettre.put("Q",8);
		valeurLettre.put("R",1);
		valeurLettre.put("S",1);
		valeurLettre.put("T",1);
		valeurLettre.put("U",1);
		valeurLettre.put("V",4);
		valeurLettre.put("W",4);
		valeurLettre.put("X",8);
		valeurLettre.put("Y",4);
		valeurLettre.put("Z",10);
	
	}

	
	public int getValeur(char c) {
		 Integer Q = valeurLettre.get(String.valueOf(c));
		System.out.println(Q);
				
		return Q;
	}

	public int getValeur(String string) {
		
		return 0;
	}

	public String getLettresDeValeur(int i) {
		
		String chaine = "";
        
        for (Entry<String, Integer> meslettres: valeurLettre.entrySet()) {
            if (meslettres.getValue() == i) {
                chaine += meslettres.getKey();
            }
            if (i == 0) {
                return null;
            }
        }
        return chaine;
		
	}

}

