import	java.util.Map;
import  java.util.HashMap;
import  java.util.Iterator;

public class InstrumentSpec {
	private Map properties;
	
	public InstrumentSpec(Map properties) {
		if(properties == null) {
			properties = new HashMap();
		}
		else {
			this.properties = (HashMap)properties;
		}
	}
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}
	
	public Map getProperties() {
		return properties ;
	}
	
	public boolean matches(InstrumentSpec otherSpecs) {
		for(Iterator i = otherSpecs.properties.keySet().iterator();i.hasNext();) {
			String propertyName = (String) i.next();
			if(!properties.get(propertyName).equals(otherSpecs.getProperty(propertyName))) {
				return false;
			}
		}
		return true;
	}
	
}
