
public enum Wood {
	INDIAN_ROSEWOOD, BRAZLIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO,
	CEDAR, ADIRONDACK, ALDER, SITKA;
	public String toString() {
		switch(this) {
			case INDIAN_ROSEWOOD : return "Indian Rosewood";
			case BRAZLIAN_ROSEWOOD : return "Brazilian Rosewood";
			case MAHOGANY: return "Mahogany";
			case MAPLE: return "Maple";
			case COCOBOLO : return "Cocobolo";
			case CEDAR : return "Cedar";
			case ADIRONDACK : return "Adirondack";
			case ALDER : return "Alder";
			case SITKA : return "Stika" ;
			default : return "" ;
		}
	}
}
