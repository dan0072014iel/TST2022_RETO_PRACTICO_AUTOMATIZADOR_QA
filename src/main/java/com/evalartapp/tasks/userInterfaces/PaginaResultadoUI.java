package com.evalartapp.tasks.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultadoUI {

    public static final Target MSJ_HASH = Target.the("hash exitoso").locatedBy("//p[starts-with(text(), '<General>')]");
}
