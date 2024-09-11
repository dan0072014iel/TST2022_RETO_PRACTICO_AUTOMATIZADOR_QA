package com.evalartapp.tasks.stepDefinitions;

import com.evalartapp.tasks.exceptions.ResultadoNoEsperado;
import com.evalartapp.tasks.questions.ValidacionHashExitoso;
import com.evalartapp.tasks.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormsStepDefinitions {

    @Before
    public void configuracion(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario diligencie el primer ciclo de formularios")
    public void queElUsuarioDiligencieElPrimerCicloDeFormularios() {
        theActorInTheSpotlight().attemptsTo(FormCiclo1Task.formCiclo1Task());
    }
    @Cuando("vaya avanzando cada uno de ellos hasta completar los diez ciclos")
    public void vayaAvanzandoCadaUnoDeEllosHastaCompletarLosDiezCiclos() {
        theActorInTheSpotlight().attemptsTo(
                FormCiclo2Task.formCiclo2Task(),
                FormCiclo3Task.formCiclo3Task(),
                FormCiclo4Task.formCiclo4Task(),
                FormCiclo5Task.formCiclo5Task(),
                FormCiclo6Task.formCiclo6Task(),
                FormCiclo7Task.formCiclo7Task(),
                FormCiclo8Task.formCiclo8Task(),
                FormCiclo9Task.formCiclo9Task(),
                FormCiclo10Task.formCiclo10Task()
        );
    }
    @Entonces("el usuario visualizara un hash de éxito")
    public void elUsuarioVisualizaraUnHashDeÉxito() {
        theActorInTheSpotlight().should(seeThat(ValidacionHashExitoso.validacionHashExitoso(),
                Matchers.equalTo(true)).orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.HASH_FALLIDO));
    }
}
