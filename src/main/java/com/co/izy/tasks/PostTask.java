package com.co.izy.tasks;

import com.co.izyregister.userinterface.PostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PostTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PostPage.BTN_EXHAUST));
        actor.attemptsTo(Click.on(PostPage.BTN_PRODUCTS));

      /*  try {
            Thread.sleep(10000);
       } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static PostTask selectionProducts() {
        return Tasks.instrumented(PostTask.class);

    }
}
