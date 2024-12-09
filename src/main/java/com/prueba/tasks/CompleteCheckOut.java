package com.prueba.tasks;

import com.prueba.interfaces.CompleteCheckoutInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CompleteCheckOut implements Task {

    private String firstName;
    private String lastName;
    private String codePostal;

    public CompleteCheckOut(String firstName, String lastName, String codePostal){
        this.firstName = firstName;
        this.lastName = lastName;
        this.codePostal = codePostal;
    }

    public static CompleteCheckOut withDetails(String firstName, String lastName, String codePostal){
        return Tasks.instrumented(CompleteCheckOut.class, firstName, lastName, codePostal);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(CompleteCheckoutInterfaces.txtFirstName),
                Enter.theValue(lastName).into(CompleteCheckoutInterfaces.txtLastName),
                Enter.theValue(codePostal).into(CompleteCheckoutInterfaces.txtCodePostal),
                Click.on(CompleteCheckoutInterfaces.btnContinue)
        );

    }
}
