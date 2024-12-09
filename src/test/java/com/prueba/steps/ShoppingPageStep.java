package com.prueba.steps;

import com.prueba.interfaces.AddProductCartInterface;
import com.prueba.interfaces.CompleteShoppingInterface;
import com.prueba.interfaces.ViewCartInterface;
import com.prueba.tasks.CompleteCheckOut;
import com.prueba.tasks.DoLogin;
import com.prueba.tasks.ReadData;
import com.prueba.utils.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ShoppingPageStep {

    ReadData readData = new ReadData();
    private String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa al sitio web")
    public void openPage(String name) {
        this.name = name;
        theActorCalled(name).attemptsTo(OpenPage.openPage());
    }

    @When("Me autentico con el usuario: standard_user y password: secret_sauce")
    public void meAutenticarseConElUsuario_standard_userYpassword_secret_sauce() throws IOException {
        List<String[]> credentials = readData.readCsv("src/test/resources/data/dataUsers.csv");
        for (String[] credential : credentials) {
            String username = credential[0];
            String password = credential[1];

            theActorCalled(name).attemptsTo(
                    OpenPage.openPage(),
                    DoLogin.withCredentials(username, password)
            );
        }
    }

    @Then("Agregar dos productos al carrito")
    public void agregarDosProductosAlCarrito() {
        theActorCalled(name).attemptsTo(
                Click.on(AddProductCartInterface.btnLabsPack),
                Click.on(AddProductCartInterface.btnLabsBike)
        );
    }
    @And("Visualizar el carrito")
    public void visualizarElCarrito() {
        theActorCalled(name).attemptsTo(
                Click.on(ViewCartInterface.btnViewCart),
                Click.on(ViewCartInterface.btnCheckout)
        );
    }
    @When("Completar el formulario de compra")
    public void completarElFormularioDeCompra() throws IOException {
        List<String[]> dataClients = readData.readCsv("src/test/resources/data/dataUsers.csv");
        for (String[] dataClient : dataClients) {
            String firstName = dataClient[2];
            String lastName = dataClient[3];
            String codePostal = dataClient[4];

            theActorCalled(name).attemptsTo(
                    CompleteCheckOut.withDetails(firstName, lastName, codePostal)
            );
        }
    }
    @Then("Finalizar la compra hasta la confirmación:THANK YOU FOR YOUR ORDER")
    public void finalizarLaCompraHastaLaConfirmación_THANK_YOU_FOR_YOUR_ORDER() {
        theActorCalled(name).attemptsTo(
                Click.on(CompleteShoppingInterface.btnFinish)
        );
    }


}
