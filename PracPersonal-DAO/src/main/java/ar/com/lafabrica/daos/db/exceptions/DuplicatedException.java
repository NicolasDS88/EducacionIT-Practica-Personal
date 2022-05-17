package ar.com.lafabrica.daos.db.exceptions;

public class DuplicatedException extends Exception {

	public DuplicatedException(String message, Throwable cause) {
		super(message, cause);
	}

}
