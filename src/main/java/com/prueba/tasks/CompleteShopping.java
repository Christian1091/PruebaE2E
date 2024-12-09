package com.prueba.tasks;

import com.prueba.interfaces.CompleteShoppingInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CompleteShopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompleteShoppingInterface.btnFinish)
        );
    }
}
