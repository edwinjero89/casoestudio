package com.co.izy.questions;

import com.co.izy.tasks.CreateCategoryTask;
import com.co.izyregister.userinterface.CreateCategoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareDate implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CreateCategoPage.Compare).viewedBy(actor).asString();
                }
    public static CompareDate compare(){
        return new CompareDate();

    }

}
