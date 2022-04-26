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
	
	public List<Mandolin> search(MandolinSpec searchSpec) {
		List<Mandolin> matcingMandolins = new LinkedList<Mandolin>();
		for(Iterator<Instrument> i = inventory.iterator();i.hasNext();) {
			try {
				Mandolin mandolin = (Mandolin)i.next();
				if(mandolin.getInstrumnetSpecs().matches(searchSpec)) {
					matcingMandolins.add(mandolin);
				}
			}
			catch(Exception e) {continue;}
			
		}
		return matcingMandolins;
	}
	
	public List<Guitar> search(GuitarSpecs searchSpec) {
		List<Guitar> matcingGuitars = new LinkedList<Guitar>();
		for(Iterator<Instrument> i = inventory.iterator();i.hasNext();) {
			try {
				Guitar guitar = (Guitar)i.next();
				if(guitar.getInstrumnetSpecs().matches(searchSpec)) {
					matcingGuitars.add(guitar);
				}
			}
			catch(Exception e) {continue;}
		}
		return matcingGuitars;
	}
}
