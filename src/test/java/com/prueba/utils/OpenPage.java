package com.prueba.utils;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage {

    /* Clase que se comparte para que sea utilizada en lo métodos o funciones creadas posteriormente*/
    public static Performable openPage() {
        return Task.where("{0} Abrir la pagina SauceDemo", Open.browserOn().the(LoginSauceDemoPage.class));
    }
}
