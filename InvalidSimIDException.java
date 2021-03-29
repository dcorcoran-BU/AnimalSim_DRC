
public class InvalidSimIDException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSimIDException() {
		System.out.println("Sim ID must be greater than 0!");
	}
}
