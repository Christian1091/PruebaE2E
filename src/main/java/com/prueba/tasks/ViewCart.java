package com.prueba.tasks;

import com.prueba.interfaces.ViewCartInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ViewCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ViewCartInterface.btnViewCart),
                Click.on(ViewCartInterface.btnCheckout)
        );
    }
}
