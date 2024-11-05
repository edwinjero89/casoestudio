package com.co.izyregister.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CreateCategoPage {

    public static final Target TXT_NAMECATEGORY = Target.the("Ingresar el nombre de la categoria").locatedBy("//input[@name='CategorieName']");
    public static final Target TXT_DESCRPTIONCATEGORY = Target.the("Ingresar descripción de la categoria").locatedBy("//input[@name='descriptionCategory']");
    public static final Target BTN_LEVELCATEGORY = Target.the("Seleccione el level de categoria").locatedBy("//input[@value='Medium']");
  //  public static final Target BTN_FILESELECT = Target.the("Oprimir el botón seleccionar archivo").locatedBy("//input[@type='file']");
    public static final Target BTN_CREARCATEGORY = Target.the("Oprimir el botón seleccionar archivo").locatedBy("//button[@type='submit']");
    public static final Target Compare = Target.the("Compara la información").locatedBy("//*[contains(@class,'fs-1 fw-bold')]");

}
