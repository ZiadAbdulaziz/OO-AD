import java.util.*;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInvetntory(inventory);
		Map clientNeeds = new HashMap();
		clientNeeds.put("builder", Builder.GIBSON);
		clientNeeds.put("backWood", Wood.MAPLE);
		InstrumentSpec whatclientLikes = new InstrumentSpec(clientNeeds);
		List<Instrument> matchingInstruments = inventory.search(whatclientLikes);
		if(!matchingInstruments.isEmpty()) {
			for(Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getInstrumnetSpecs();
				System.out.println("We have  a "+spec.getProperty("instrumentType")+" with the following "
						+ "properties :");
				for(Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if(propertyName.equals("instrumentType")) {
						continue;
					}
					System.out.println("    "+propertyName+" :"+ spec.getProperty(propertyName));
				}
				System.out.println("You have "+spec.getProperty("instrumentType")+" for $"+instrument.getPrice());
				System.out.println("------------------------------------------------");
			}
		}
		else {
			System.out.println("Sorry, Erin. We have nothing for u");
		}
	}
	
	private static void initializeInvetntory(Inventory inventory) {
		Map properties = new HashMap() {{
			put("instrumentType", InstrumentType.GUITAR);
			put("builder",Builder.COLLINGS);
			put("model","CJ");
			put("type",Type.ACOUSTIC);
			put("numOfStrings",6);
			put("topWood", Wood.INDIAN_ROSEWOOD);
			put("backWood",Wood.SITKA);
			}};
			inventory.addInstrument("12345", 12345, new InstrumentSpec(properties));
		properties = new HashMap() {{
			put("instrumentType", InstrumentType.GUITAR);
			put("builder",Builder.GIBSON);
			put("model","les Paul");
			put("type",Type.ELECTRIC);
			put("numOfStrings",6);
			put("topWood", Wood.MAPLE);
			put("sideWood", Wood.MAPLE);
			put("backWood",Wood.MAPLE);
			}};
			inventory.addInstrument("70108276", 2295.99, new InstrumentSpec(properties));
		properties = new HashMap() {{
			put("instrumentType", InstrumentType.MANDOLIN);
			put("builder",Builder.GIBSON);
			put("style",Style.F);
			put("type",Type.ACOUSTIC);
			put("topWood", Wood.MAPLE);
			put("backWood",Wood.MAPLE);
			}};
			inventory.addInstrument("9019920", 5800, new InstrumentSpec(properties));
		properties = new HashMap() {{
			put("instrumentType", InstrumentType.BANJO);
			put("builder",Builder.GIBSON);
			put("model","RB-5");
			put("numOfStrings",5);
			put("type",Type.ACOUSTIC);
			put("sideWood", Wood.MAPLE);
			put("backWood",Wood.MAPLE);
			}};
			inventory.addInstrument("809000", 2945.95, new InstrumentSpec(properties));
	}
}

