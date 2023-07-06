package ui;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemDetails extends PageObject {

    public static final Target ABOUT_THIS_ITEM_TEXT = Target.the("About this item - all information")
            .located(By.id("feature-bullets"));

    public static final Target ABOUT_THIS_ITEM_TITLE = Target.the("About this item Title")
            .located(By.xpath("//*[contains(text(),' About this item ')]"));

}
