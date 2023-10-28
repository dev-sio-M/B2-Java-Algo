package fr.gns.app;

import java.util.Comparator;

public class ComparateurNbVictoires implements Comparator<Joueur> {

	@Override
	public int compare(Joueur o1, Joueur o2) {
		// TODO Auto-generated method stub
        return Integer.compare(o1.getNbVictoires(), o2.getNbVictoires());
	}
}

