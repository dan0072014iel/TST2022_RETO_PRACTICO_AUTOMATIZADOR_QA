package com.evalartapp.tasks.exceptions;

public class ResultadoNoEsperado extends AssertionError{

    public static final String INICIO_SESION_FALLO = "Verificar las credenciales ingresadas";
    public static final String HASH_FALLIDO = "El ciclo 10 no fue completado con exito";


    public ResultadoNoEsperado(String message) {
        super(message);
    }

    public ResultadoNoEsperado(String message, Throwable cause) {
        super(message, cause);
    }
}
