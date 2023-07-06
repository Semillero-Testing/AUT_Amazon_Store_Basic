package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AmazonElectronicsPage extends PageObject {


    public static final Target BRANDS_SAMSUNG_CB = Target.the("samsung check box")
            .located(By.xpath("//span/a/span[contains(text(),'Samsung')]"));

    public static final Target SORT_BY_LIST = Target.the("sort by options list")
            .located(By.id("a-autoid-0-announce"));

    public static final Target HIGH_TO_LOW_OPTION = Target.the("Price: High to Low option")
            .located(By.xpath("//a[contains(text(),'Price: High to Low')]"));

    public static final Target TV_SECOND_OPTION = Target.the("selecting the tv position 2")
            .located(By.xpath("//*/div[3]/div[@class='sg-col-inner']//span[@class='a-size-base-plus a-color-base a-text-normal']"));

    public static final Target TV_SECOND_OPTION1 = Target.the("selecting the tv position 2.2")
            .located(By.xpath("//*/div[3]/div[@class='sg-col-inner']//span[@data-component-type='s-product-image']"));


}
