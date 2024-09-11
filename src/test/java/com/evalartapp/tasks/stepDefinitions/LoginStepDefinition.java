package com.evalartapp.tasks.stepDefinitions;


import com.evalartapp.tasks.exceptions.ResultadoNoEsperado;
import com.evalartapp.tasks.interactions.AbrirNavegador;
import com.evalartapp.tasks.questions.ValidacionLogin;
import com.evalartapp.tasks.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {

    @Before
    public void configuracion(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentre en la pagina web del reto")
    public void queElUsuarioSeEncuentreEnLaPaginaWebDelReto() {
        theActorCalled("Daniel").wasAbleTo(AbrirNavegador.abrir());
    }

    @Cuando("ingrese el usuario con la clave")
    public void ingreseElUsuarioConLaClave()  {
        theActorInTheSpotlight().attemptsTo(LoginTask.inicioSesion());
    }

    @Entonces("el usuario visualizara el inicio del formulario")
    public void elUsuarioVisualizaralInicioDelFormulario() {
        theActorInTheSpotlight().should(seeThat(ValidacionLogin.validarLogin(),
                Matchers.equalTo(true)).orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.INICIO_SESION_FALLO));

    }
}
