
public class GuitarSpecs extends InstrumentSpec {
	private int numStrings;
	
	public GuitarSpecs(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
	}
	
	public boolean matches(InstrumentSpec otherSpecs) {
		if(!(super.matches(otherSpecs))) {
			return false;
		}
		if(!(otherSpecs instanceof GuitarSpecs)) {
			return false;
		}
		GuitarSpecs spec = (GuitarSpecs)otherSpecs ;
		if(numStrings != spec.getNumStrings()) {
			return false;
		}
		return true;
	}
}