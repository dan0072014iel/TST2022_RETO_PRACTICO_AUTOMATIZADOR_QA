package com.evalartapp.tasks.questions;

import com.evalartapp.tasks.interactions.ImprimirHashExitoso;
import com.evalartapp.tasks.userInterfaces.PaginaResultadoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionHashExitoso implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        ImprimirHashExitoso imprimirHashExitoso = ImprimirHashExitoso.imprimirHashExitosoExitoso();
        imprimirHashExitoso.performAs(actor);
        return PaginaResultadoUI.MSJ_HASH.resolveFor(actor).isVisible();
    }

    public static Question validacionHashExitoso(){
        return new ValidacionHashExitoso();
    }
}
