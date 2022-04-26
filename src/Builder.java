
public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYN, PRS, ANY;
	public String toString() {
		switch(this) {
			case FENDER : return "Fender";
			case MARTIN : return "Martin";
			case GIBSON : return "Gibson";
			case COLLINGS : return "Collings";
			case OLSON : return "Olson";
			case RYN : return "Ryn";
			case PRS : return "Prs";
			default : return "Any";
		}
	}
}
