package com.evalartapp.tasks.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaFormularioUI {

    public static final Target INPUT_NUMERO = Target.the("ingresar clave").located(By.name("number"));
    public static final Target TEXTAREA_TEXTO = Target.the("ingresar clave").located(By.name("text"));
    public static final Target BTN_ENVIAR = Target.the("boton ingresar").locatedBy("//button[@type='submit']");
}
