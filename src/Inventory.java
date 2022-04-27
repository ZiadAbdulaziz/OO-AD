import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> inventory;
	public Inventory() {
		inventory = new LinkedList<Instrument>();
	}
	
	public void addInstrument(String serialNumber, double price, InstrumentSpec specs) {
		Instrument new_inst = null;
		if(specs instanceof GuitarSpecs) {
			new_inst = new Guitar(serialNumber, price, (GuitarSpecs)specs);
		}
		else if(specs instanceof MandolinSpec) {
			new_inst = new Mandolin(serialNumber, price, (MandolinSpec)specs);
		}
		inventory.add(new_inst);
	}
	
	public Instrument get(String serialNumber) {
		for(Iterator<Instrument> i = inventory.iterator();i.hasNext();) {
			Instrument inst = (Instrument) i.next();
			if(inst.getSerialNumber().equals(serialNumber)) {
				return inst;
			}
		}
		return null;
	}
	
	public List<Instrument> search(InstrumentSpec searchSpec) {
		List<Instrument> matcingInstruments = new LinkedList<Instrument>();
		for(Iterator<Instrument> i = inventory.iterator();i.hasNext();) {
			try {
				Instrument instrument = (Instrument)i.next();
				if(instrument.getInstrumnetSpecs().matches(searchSpec)) {
					matcingInstruments.add(instrument);
				}
			}
			catch(Exception e) {continue;}
			
		}
		return matcingInstruments;
	}

}
