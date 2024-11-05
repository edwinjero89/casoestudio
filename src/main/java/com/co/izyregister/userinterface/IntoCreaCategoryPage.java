package com.co.izyregister.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class IntoCreaCategoryPage {

    public static final Target BTN_ACCIONREALIZAR = Target.the("Seleccionar que acción desea realizar?").locatedBy("//*[contains(@class,'accordion-button')]");
    public static final Target BTN_CREATECATEGORY = Target.the("Seleccionar crear categoria").locatedBy("//a[@href='http://campusvirtual.izyacademy.com:8000/createcategory']");
    public static final Target LBL_CATEGORYCOUNTS = Target.the("Cantidad de categorias creadas").locatedBy("//*[contains(@class,'container-counter')]/span");

}
