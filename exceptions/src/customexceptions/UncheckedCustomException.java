package customexceptions;

public class UncheckedCustomException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UncheckedCustomException(String message) {
		super(message);
	}
}
