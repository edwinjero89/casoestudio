package com.co.izy.tasks;

import com.co.izyregister.userinterface.IntoCreaCategoryPage;
import com.co.izyregister.userinterface.PostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IntoCreaCategoryTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(IntoCreaCategoryPage.BTN_ACCIONREALIZAR, isVisible()).forNoMoreThan(30).seconds());
        String dato = IntoCreaCategoryPage.LBL_CATEGORYCOUNTS.resolveFor(actor).getText().trim();
        actor.remember("Datoregistros", dato);
        actor.attemptsTo(Click.on(IntoCreaCategoryPage.BTN_ACCIONREALIZAR));
        actor.attemptsTo(Click.on(IntoCreaCategoryPage.BTN_CREATECATEGORY));


       /* try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }*/
    }
    public static IntoCreaCategoryTask ingresoCreateCategory(){
        return Tasks.instrumented(IntoCreaCategoryTask.class);

    }



}
