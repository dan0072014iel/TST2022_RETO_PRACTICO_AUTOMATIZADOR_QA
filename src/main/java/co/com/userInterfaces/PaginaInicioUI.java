package co.com.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioUI {

    public static final Target TXT_USUARIO = Target.the("usuario").located(By.name("userName"));
    public static final Target TXT_CLAVE = Target.the("ingresar clave").located(By.name("password"));
    public static final Target BTN_INGRESAR = Target.the("boton ingresar").located(By.name("submit"));
}
