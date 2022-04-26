
public class MandolinSpec extends InstrumentSpec {
	private Style style;
	public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}
	
	public Style getStyle() {
		return style;
	}
	
	public boolean matches(InstrumentSpec otherSpecs) {
		if(!(super.matches(otherSpecs))) {
			return false;
		}
		if(!(otherSpecs instanceof MandolinSpec)) {
			return false;
		}
		MandolinSpec spec = (MandolinSpec)otherSpecs ;
		if(!style.equals(spec.getStyle())) {
			return false;
		}
		return true;
	}


}
