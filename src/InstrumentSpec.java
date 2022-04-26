
public abstract class InstrumentSpec {
	protected Builder builder;
	protected String model;
	protected Type type;
	protected Wood backWood;
	protected Wood topWood;
	
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	
	public boolean matches(InstrumentSpec otherSpecs) {
		String model = otherSpecs.getModel().toLowerCase();
		if(builder != otherSpecs.getBuilder())
			return false;
		if((model!=null)&&(model!="")&&((!model.equals(otherSpecs.getModel().toLowerCase() )))) {
			return false;
		}
		if(!type.equals(otherSpecs.getType()))
		{
			return false;
		}
		if(!topWood.equals(otherSpecs.getTopWood())) {
			return false;
		}
		if(!backWood.equals(otherSpecs.getBackWood())){
			return false;
		}
		return true;
	}
	
}
