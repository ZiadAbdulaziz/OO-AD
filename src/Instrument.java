
public abstract class Instrument {
	protected String serialNumber;
	protected double price;
	protected InstrumentSpec spec;
	
	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price ;
	}
	public InstrumentSpec getInstrumnetSpecs() {
		return spec;
	}
}
