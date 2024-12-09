package com.prueba.tasks;

import com.prueba.interfaces.AddProductCartInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddProductCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddProductCartInterface.btnLabsPack),
                Click.on(AddProductCartInterface.btnLabsBike)
        );

    }
}
