package com.co.izyregister.stepdefinitions;

import com.co.izy.exceptions.MessageException;
import com.co.izy.models.CategoryCredentials;
import com.co.izy.models.CredentialsRegister;
import com.co.izy.questions.CompareDate;
import com.co.izy.tasks.CreateCategoryTask;
import com.co.izy.tasks.IntoCreaCategoryTask;
import com.co.izy.tasks.PostTask;
import com.co.izy.tasks.RegisterTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));


    }

    @Given("^el usuario abre la pagina web$")
    public void elUsuarioAbreLaPaginaWeb() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://campusvirtual.izyacademy.com:8000/register"));
    }

    @When("^el usuario ingresa los datos$")
    public void elUsuarioIngresaLosDatos(List<CredentialsRegister>credentialsRegisterList) {
      CredentialsRegister credentialsRegister;

      credentialsRegister = credentialsRegisterList.get(0);

    OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.enterCredentiasls(credentialsRegister));

    }

    @When("^ingresar al menu post$")
    public void ingresarAlMenuPost() {
        OnStage.theActorInTheSpotlight().attemptsTo(PostTask.selectionProducts());


    }

    @When("^ingresar a crear una categoria$")
    public void ingresarACrearUnaCategoria() {
        OnStage.theActorInTheSpotlight().attemptsTo(IntoCreaCategoryTask.ingresoCreateCategory());
    }

    @When("^crear una categoria$")
    public void crearUnaCategoria(List<CategoryCredentials> categoryCredentialsList ) {
        CategoryCredentials categoryCredentials;
        categoryCredentials = categoryCredentialsList.get(0);
    OnStage.theActorInTheSpotlight().attemptsTo(CreateCategoryTask.enterCategory(categoryCredentials));



    }

    @Then("^el usuario observa la categoria creada$")
    public void elUsuarioObservaLaCategoriaCreada() {

    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareDate.compare(), Matchers.is("Nuestras Categorías de Cursos")).orComplainWith(MessageException.class,"El mensaje no es el correcto"));
    }
}
