package com.co.izy.tasks;

import com.co.izy.models.CategoryCredentials;
import com.co.izyregister.userinterface.CreateCategoPage;
import com.co.izyregister.userinterface.IntoCreaCategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateCategoryTask implements Task {
CategoryCredentials categoryCredentials;

    public CreateCategoryTask(CategoryCredentials categoryCredentials) {
        this.categoryCredentials = categoryCredentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CreateCategoPage.TXT_NAMECATEGORY, isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(Enter.theValue(categoryCredentials.getNamecategory()).into(CreateCategoPage.TXT_NAMECATEGORY));
        actor.attemptsTo(Enter.theValue(categoryCredentials.getDescriptioncategory()).into(CreateCategoPage.TXT_DESCRPTIONCATEGORY));
        actor.attemptsTo(Click.on(CreateCategoPage.BTN_LEVELCATEGORY));
        actor.attemptsTo(Click.on(CreateCategoPage.BTN_CREARCATEGORY));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int datoAnterior= Integer.parseInt(actor.recall("Datoregistros"))+1;

        int datoActual = Integer.parseInt(IntoCreaCategoryPage.LBL_CATEGORYCOUNTS.resolveFor(actor).getText().trim());

       // System.out.println("Dato Anterior" +datoAnterior);
      //  System.out.println("Dato Actual" +datoActual);

        if (datoAnterior!=datoActual) {

            Assert.fail("Falla porque actual no sumo 1");
        }

    }

    public static CreateCategoryTask enterCategory(CategoryCredentials categoryCredentials) {
        return Tasks.instrumented(CreateCategoryTask.class, categoryCredentials);
    }
}
