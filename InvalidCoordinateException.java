
public class InvalidCoordinateException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCoordinateException() {
		System.out.println("x and y must be greater than 0!");
	}
}
