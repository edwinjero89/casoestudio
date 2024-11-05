package com.co.izyregister.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target TXT_NAME = Target.the("Ingresar nombre").locatedBy("//input[@name='name']");
    public static final Target TXT_USERNAME = Target.the("Ingresar usuario").locatedBy("//input[@name='username']");
    public static final Target SELECT_COUNTRY =Target.the("Seleccionar country").locatedBy("//select[@name='pais']");
    //public static final Target LIST_COUNTRYRESIDES = Target.the("Abrir la lista Pais").locatedBy("//*[text()='Country of residence']");
    //public static final Target OPC_COUNTRY = Target.the("Seleccionar lista de pais").locatedBy("//*[text()='Honduras']");
    public static final Target TXT_CITY = Target.the("Ingresar ciudad").locatedBy("//input[@name='city']");
    public static final Target TXT_IDENTIFICATIONNUMBER = Target.the("Ingresar número de identificación").locatedBy("//input[@name='numberidentification']");
    public static final Target TXT_PHONE = Target.the("Ingresar número de identificación").locatedBy("//input[@name='phone']");
    public static final Target TXT_EMAIL = Target.the("Ingresar número de identificación").locatedBy("//input[@name='email']");
    public static final Target TXT_PASSWORD = Target.the("Ingresar número de identificación").locatedBy("//input[@name='password']");
    public static final Target TXT_VERIFYPASSWORD = Target.the("Ingresar número de identificación").locatedBy("//input[@name='password_confirmation']");
    public static final Target BTN_REGISTER = Target.the("Ingresar número de identificación").locatedBy("//button[@id='effect-button']");

}
