package co.edu.uniandes.dse.parcial1.exceptions;

public final class ErrorMessage {
    public static final String DINOSAURIO_NOT_FOUND = "El dinosaurio con el id requerido no fue encontrado";
	public static final String CUIDADOR_NOT_FOUND = "El cuidador con el id requerido no fue encontrado";
    private ErrorMessage() {
		throw new IllegalStateException("Utility class");
	}
}
