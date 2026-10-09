package com.demoblaze.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target PRODUCTO = Target.the("Producto {0}")
            .locatedBy("//a[contains(@class, 'hrefch') and contains(text(), '{0}')]");

    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Boton agregar al carrito")
            .located(By.xpath("//a[contains(text(), 'Add to cart')]"));

    public static final Target BOTON_IR_A_CARRITO = Target.the("Boton ver carrito")
            .located(By.id("cartur"));
}
