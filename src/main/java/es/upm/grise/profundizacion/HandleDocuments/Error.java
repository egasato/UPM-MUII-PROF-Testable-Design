package es.upm.grise.profundizacion.HandleDocuments;

/**
 * Conjunto de errores de la aplicación.
 */
public enum Error {

	UNDEFINED_ENVIRON	  (1,  "Environment variable APP_HOME undefined"),
	NON_EXISTING_FILE	  (2,  "Non-existing file"),
	CANNOT_READ_FILE	  (3,  "Cannot read file"),
	CANNOT_FIND_DRIVER	  (4,  "Cannot find database driver"),
	CANNOT_INSTANTIATE_DRIVER (5,  "Unknown problem with the DB driver"),
	CANNOT_CONNECT_DATABASE	  (6,  "Cannot connect to database"),
	CANNOT_RUN_QUERY	  (7,  "When trying to get the documentId value, a DB error ocurred"),
	CONNECTION_LOST		  (8,  "The connection to the database has been lost"),
	INCORRECT_COUNTER	  (9,  "COUNTER table does not contain documentID field"),
	CORRUPTED_COUNTER	  (10, "Corrupted COUNTER table"),
	CANNOT_UPDATE_COUNTER	  (11, "Unknown problem with the COUNTER table"),
	INCOMPLETE_DOCUMENT	  (12, "Some document parameter (template/title/author/body) has not been defined");

	/** El código de error único. */
	private int errorCode;

	/** El mensaje de error único. */
	private String message;

	/**
	 * Constructor simple que guarda los parámetros.
	 * 
	 * @param code    El código de error.
	 * @param message El mensaje de error.
	 */
	Error(int code, String message) {
		this.errorCode = code;
		this.message = message;
	}

	/**
	 * Devuelve el código de error.
	 * 
	 * @return El código de error.
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * Devuelve el mensaje de error.
	 * 
	 * @return El mensaje de error.
	 */
	public String getMessage() {
		return "Error code " + errorCode + ": " + message;
	}

}
