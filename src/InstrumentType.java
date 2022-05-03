
public enum InstrumentType {
	GUITAR, MANDOLIN, FIDDLE, BASE, BANJO, DABRO;
	public String toString() {
		switch(this) {
			case GUITAR:
				return "Guitar";
			case MANDOLIN:
				return "Mandolin";
			case FIDDLE:
				return "Fiddle";
			case BASE:
				return "Base";
			case BANJO:
				return "Banjo";
			case DABRO:
				return "Darbo";
			default :
				return "Unspcified" ;
		}
	}
}
