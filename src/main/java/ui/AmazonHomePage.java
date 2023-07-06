package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonHomePage extends PageObject {



    public static final Target MENU = Target.the("hamburguer menu")
            .located(By.id("nav-hamburger-menu"));

    public static final Target TV_APPPLIANCES_ELECTRONICS_OPTION = Target.the("TV, Appliances, Electronics option")
            .located(By.xpath("//*[contains(text(),'TV, Appliances, Electronics')]"));

    public static final Target TELEVISIONS_OPTION = Target.the("Televisions option")
            .located(By.xpath("//*[contains(text(),'Televisions')]"));


}
