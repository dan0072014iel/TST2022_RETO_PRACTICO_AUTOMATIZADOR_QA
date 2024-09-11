package com.evalartapp.tasks.tasks;

import com.evalartapp.tasks.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.evalartapp.tasks.userInterfaces.PaginaInicioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    public static ArrayList<Map<String, String>> leerExcel = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("Data/DatosExcel.xlsx","DatosLogin");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(leerExcel.get(0).get("Usuario")).into(TXT_USUARIO),
                Enter.theValue(leerExcel.get(0).get("Clave")).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );

    }

    public static LoginTask inicioSesion () {
        return instrumented(LoginTask.class);
    }
}
