import java.util.Arrays;

public class BrownBear extends Animal implements Walkable, Swimmable {
	final protected String[] s = {"Alaskan", "Asiatic", "European", "Grizly", "Kodiak", "Siberian"};
	protected String subSpecies;
	
	public BrownBear() {
		super();
		setSubSpecies("Alaskan");
	}
	
	public BrownBear(int simID, Location location, String subSpecies) {
		super(simID, location);
		setSubSpecies("Alaskan");
	}
	
	public String getSubSpecies() {
		return subSpecies;
	}
	
	public void setSubSpecies(String subSpecies) {
		if(!Arrays.asList(s).contains(subSpecies)) {
			throw new InvalidSubspeciesException();
		}
			this.subSpecies = subSpecies;
	}
	
	@Override
	public void swim(int direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		
	}
	
}
