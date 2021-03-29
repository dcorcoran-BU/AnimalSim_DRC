
public class Location {
	protected int xCoord;
	protected int yCoord;
	
	public Location(int i, int j) {
		xCoord = 0;
		yCoord = 0;
	}	



	public void update(int xCoord, int yCoord) throws InvalidCoordinateException {
		if(xCoord < 0 || yCoord < 0) {
			throw new InvalidCoordinateException();
		}
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
	}
	public int[] getCoordinates() {
		int[] newarr = {xCoord, yCoord};
		return newarr;
	}
	
	
}
