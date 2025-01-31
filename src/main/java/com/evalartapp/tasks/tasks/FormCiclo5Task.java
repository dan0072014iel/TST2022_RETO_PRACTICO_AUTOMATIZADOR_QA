package com.evalartapp.tasks.tasks;

import com.evalartapp.tasks.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.evalartapp.tasks.userInterfaces.PaginaFormularioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormCiclo5Task implements Task {

    public static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("Data/DatosExcel.xlsx","DatosFormulario");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(leerExcel.get(0).get("numero5")).into(INPUT_NUMERO),
                Enter.theValue(leerExcel.get(0).get("caracteres5")).into(TEXTAREA_TEXTO),
                Click.on(BTN_ENVIAR)
        );
    }
    public static FormCiclo5Task formCiclo5Task() {
        return instrumented(FormCiclo5Task.class);
    }

}
