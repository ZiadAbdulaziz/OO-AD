import java.util.*;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInvetntory(inventory);
		GuitarSpecs whatErinLikes = new GuitarSpecs(Builder.FENDER, "DonKnow", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,12);
		MandolinSpec whatFareedLikes = new MandolinSpec(Builder.GIBSON, "Ez", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, Style.Double_D);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			for(Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpecs spec = (GuitarSpecs) guitar.getInstrumnetSpecs();
				System.out.println("We have a "+ spec.getNumStrings()+" strings "+
				spec.getBuilder()+ " "+ spec.getModel()+" "+
				spec.getType()+	" guitar:\n"+
				spec.getBackWood()+"back and sides,\n"+
				spec.getTopWood()+"top.\n"+
				guitar.getPrice()+ "$ !!\n ----");
			}
		}
		else {
			System.out.println("Sorry, Erin. We have nothing for u");
		}
		List<Mandolin> matchingMandolins = inventory.search(whatFareedLikes);
		if(!matchingMandolins.isEmpty()) {
			for(Iterator i = matchingMandolins.iterator(); i.hasNext();) {
				Mandolin mandolin = (Mandolin) i.next();
				MandolinSpec spec = (MandolinSpec) mandolin.getInstrumnetSpecs();
				System.out.println("We have a "+ spec.getStyle()+ " "+
				spec.getBuilder()+ " "+ spec.getModel()+" "+
				spec.getType()+	" Mandolin:\n"+
				spec.getBackWood()+"back and sides,\n"+
				spec.getTopWood()+"top.\n"+
				mandolin.getPrice()+ "$ !!\n ----");
			}
		}
		else {
			System.out.println("Sorry, Erin. We have nothing for u");
		}
		
	}
	private static void initializeInvetntory(Inventory inventory) {
		inventory.addInstrument("1", 1500.0, new GuitarSpecs(Builder.ANY, "Gez", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 15));
		inventory.addInstrument("15", 1800, new GuitarSpecs(Builder.FENDER, "DonKnow", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
		inventory.addInstrument("155", 2000.0, new GuitarSpecs(Builder.MARTIN, "Gez", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, 20));
		inventory.addInstrument("15A", 2580, new MandolinSpec(Builder.GIBSON, "Ez", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER, Style.Double_D));
	}
}

