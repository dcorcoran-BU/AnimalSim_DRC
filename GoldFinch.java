public class GoldFinch extends Animal implements Flyable, Walkable {
	double wingSpan;
	
	public GoldFinch() {
		super();
		setWingSpan(9.0);
	}
	
	public GoldFinch(int simID, Location location, double wingSpan) {
		super(simID, location);
		setWingSpan(wingSpan);
	}
	
	public double getWingSpan() {
		return this.wingSpan;
		
	}
	
	public void setWingSpan(double wingSpan) {
		if(wingSpan < 5.0 || wingSpan > 11.0) {
			throw new InvalidWingSpanException();
		}else {
			this.wingSpan = wingSpan;
		}
	}
		
	
	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		int currentX = super.location.getCoordinates()[0];
		int currentY = super.location.getCoordinates()[1];
		if(direction %2 == 0) {
			currentX += 1;
		}else {
			currentY += 1;
		}
			super.getLocation().update(currentX, currentY);
	}

	@Override
	public void fly(Location location) {
		// TODO Auto-generated method stub
		super.setLocation(location);
	}
	
	
}