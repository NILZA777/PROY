package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://trello.com/es")
public class HomePage extends PageObject {

    public static final Target IMPUT_BUSCAR_OBJETO = Target.the("Imput donde se realiza la busqueda").located(By.id("search-key"));
    public static final Target SELECT_TIPO_CATEGORIA = Target.the("Select tipo de categoria").located(By.id("search-key"));
    public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton buscar articulo").located(By.className("search-key"));
    public static final Target BUTTON_CERRAR_VENTANA = Target.the("Boton cerrar ventana").located(By.className("search-key"));

}

