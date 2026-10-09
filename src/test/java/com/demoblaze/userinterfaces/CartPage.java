package com.demoblaze.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target BOTON_PLACE_ORDER = Target.the("Boton Place Order")
            .located(By.xpath("//button[text()='Place Order']"));

    // Campos del formulario modal
    public static final Target TXT_NAME = Target.the("Campo Nombre").located(By.id("name"));
    public static final Target TXT_COUNTRY = Target.the("Campo Pais").located(By.id("country"));
    public static final Target TXT_CITY = Target.the("Campo Ciudad").located(By.id("city"));
    public static final Target TXT_CARD = Target.the("Campo Tarjeta").located(By.id("card"));
    public static final Target TXT_MONTH = Target.the("Campo Mes").located(By.id("month"));
    public static final Target TXT_YEAR = Target.the("Campo Anio").located(By.id("year"));

    public static final Target BOTON_PURCHASE = Target.the("Boton Purchase")
            .located(By.xpath("//button[text()='Purchase']"));

    // Mensaje de éxito final
    public static final Target TITULO_CONFIRMACION = Target.the("Titulo de confirmacion")
            .located(By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]"));    
}
