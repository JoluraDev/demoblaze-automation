package com.demoblaze.stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoblaze.tasks.CompleteOrder;
import com.demoblaze.userinterfaces.CartPage;
import com.demoblaze.userinterfaces.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.core.Serenity.getDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class PurchaseStepDefinitions {

    @Given("que el usuario ingresa a la pagina de compras")
    public void queElUsuarioIngresaALaPaginaDeCompras() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").attemptsTo(
            Open.url("https://www.demoblaze.com")
        );
    }
    @When("agrega el producto {string} al carrito")
    public void agregaElProductoAlCarrito(String nombreProducto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Click.on(HomePage.PRODUCTO.of(nombreProducto)),
            Click.on(HomePage.BOTON_AGREGAR_CARRITO)
        );

        //Mensaje de alerta
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        // Ir al carrito
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.BOTON_IR_A_CARRITO)
        );
    }

    @And ("completa el formulario de pago con los datos:")
    public void completaElFormularioDePagoConLosDatos(DataTable dataTable) {
        List<Map<String, String>> filas = dataTable.asMaps(String.class, String.class);
        Map<String, String> datos = filas.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(
            CompleteOrder.conDatos(datos)
        );

    }
    @Then("deberia ver el mensaje de confirmacion {string}")
    public void deberiaVerElMensajeDeConfirmacion(String mensajeEsperado) {
        OnStage.theActorInTheSpotlight().attemptsTo(
            Ensure.that(CartPage.TITULO_CONFIRMACION).text().containsIgnoringCase(mensajeEsperado)
        );
    }

}
