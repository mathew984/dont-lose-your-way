package Core.comparators;

import dao.Polaczenie;

import java.util.Comparator;


public class CzasComparator implements Comparator<Polaczenie>{

	public int compare(Polaczenie s1, Polaczenie s2) {
		if(s1.getCzasKoncowy().czyWiekszy(s2.getCzasKoncowy()))return 1;
		if(s2.getCzasKoncowy().czyWiekszy(s1.getCzasKoncowy()))return -1;
		return s1.getOpis().compareTo(s2.getOpis());
	}
}
