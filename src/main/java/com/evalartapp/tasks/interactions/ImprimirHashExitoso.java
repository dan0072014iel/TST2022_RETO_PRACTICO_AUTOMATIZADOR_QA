package com.evalartapp.tasks.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.evalartapp.tasks.userInterfaces.PaginaResultadoUI.MSJ_HASH;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ImprimirHashExitoso implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(WaitUntil.the(MSJ_HASH, isVisible()).forNoMoreThan(30).seconds());
            System.out.println("Hash exitoso: "+MSJ_HASH.resolveFor(actor).getText());
    }

    public static ImprimirHashExitoso imprimirHashExitosoExitoso() {
        return instrumented(ImprimirHashExitoso.class);
    }
}
