package com.co.izy.tasks;

import com.co.izy.models.CredentialsRegister;
import com.co.izyregister.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterTask implements Task {
    CredentialsRegister credentialsRegister;

    public RegisterTask(CredentialsRegister credentialsRegister) {
        this.credentialsRegister = credentialsRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(credentialsRegister.getName()).into(RegisterPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getUsername()).into(RegisterPage.TXT_USERNAME));
        actor.attemptsTo(SelectFromOptions.byVisibleText(credentialsRegister.getCountry()).from(RegisterPage.SELECT_COUNTRY));
        //actor.attemptsTo(SelectFromOptions.byVisibleText("Honduras").from(RegisterPage.SELECT_COUNTRY));
        //actor.attemptsTo(Click.on(RegisterPage.LIST_COUNTRYRESIDES));
        //actor.attemptsTo(Click.on(RegisterPage.OPC_COUNTRY));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getCity()).into(RegisterPage.TXT_CITY));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getIdentification()).into(RegisterPage.TXT_IDENTIFICATIONNUMBER));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getPhone()).into(RegisterPage.TXT_PHONE));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getPass()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(credentialsRegister.getVerypassword()).into(RegisterPage.TXT_VERIFYPASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));

    }

    public static RegisterTask enterCredentiasls(CredentialsRegister credentialsRegister) {
        return Tasks.instrumented(RegisterTask.class, credentialsRegister);


    }

}
