package com.demoblaze.tasks;

import java.util.Map;

import com.demoblaze.userinterfaces.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class CompleteOrder implements Task{

    private final Map<String, String> datos;

    public CompleteOrder(Map<String, String> datos){
        this.datos = datos;
    }

    public static CompleteOrder conDatos(Map<String, String> datos){
        return Tasks.instrumented(CompleteOrder.class, datos);
    }

    @Override 
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(CartPage.BOTON_PLACE_ORDER),
            Enter.theValue(datos.get("nombre")).into(CartPage.TXT_NAME),
            Enter.theValue(datos.get("pais")).into(CartPage.TXT_COUNTRY),
            Enter.theValue(datos.get("ciudad")).into(CartPage.TXT_CITY),
            Enter.theValue(datos.get("tarjeta")).into(CartPage.TXT_CARD),
            Enter.theValue(datos.get("mes")).into(CartPage.TXT_MONTH),
            Enter.theValue(datos.get("anio")).into(CartPage.TXT_YEAR),
            Click.on(CartPage.BOTON_PURCHASE)
        );
    }
    
}
