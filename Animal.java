
public abstract class Animal {
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;

	public Animal() {
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	}
	
	public Animal(int simID, Location location) {
		this.simID = simID;
		this.location = location;
		full = false;
		rested = true;
	}
	
	public boolean eat() {
		double rand = Math.random();
			if(rand < 0.5) {
				this.full = false;
			}else {
				this.full = true;
			}
			return this.full;
	}

	public boolean sleep() {
		double r = Math.random();
		if(r > 0.5) {
			this.rested = true;
		}else {
			this.rested = false;
		}
		return this.rested;
	}

	public void setSimID(int simID) {
		if(simID < 0) {
			throw new InvalidSimIDException();
		}
			this.simID = simID;
	}
	
	public int getSimID() {
		return this.simID;
	}

	public Location getLocation() {
		return this.location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isFull() {
		return this.full;
	}
	
	public void setFull(boolean full) {
		this.full = full;
	}
	
	public boolean isRested() {
		return this.rested;
	}
	
	public void setRested(boolean rested) {
		this.rested = rested;
	}


}
