package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SwitchToNewWindow implements Task {

    public <T extends Actor> void performAs(T actor) {
        for (String pages : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(pages);}	}


    public static SwitchToNewWindow switchToNewTab() {
        return Tasks.instrumented(SwitchToNewWindow.class);}

}
