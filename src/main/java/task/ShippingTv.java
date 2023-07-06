package task;


import Interaction.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import ui.AmazonElectronicsPage;
import ui.AmazonHomePage;
import utils.GenerateFile;


import static ui.ItemDetails.ABOUT_THIS_ITEM_TEXT;


public class ShippingTv implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(AmazonHomePage.MENU));
        actor.attemptsTo(Waiting.toSecond(1));
        actor.attemptsTo(Click.on(AmazonHomePage.TV_APPPLIANCES_ELECTRONICS_OPTION));
        actor.attemptsTo(Wait.until(WebElementQuestion.the(AmazonHomePage.TELEVISIONS_OPTION),
                WebElementStateMatchers.isClickable()).forNoLongerThan(5).seconds());
        actor.attemptsTo(Click.on(AmazonHomePage.TELEVISIONS_OPTION));
        actor.attemptsTo(Waiting.toSecond(2));
        actor.attemptsTo(Scroll.to(AmazonElectronicsPage.BRANDS_SAMSUNG_CB));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.BRANDS_SAMSUNG_CB));
        actor.attemptsTo(Waiting.toSecond(2));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.SORT_BY_LIST));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.HIGH_TO_LOW_OPTION));
        actor.attemptsTo(Waiting.toSecond(1));
        actor.attemptsTo(Click.on(AmazonElectronicsPage.TV_SECOND_OPTION));
        actor.attemptsTo(Waiting.toSecond(2));
        actor.attemptsTo(SwitchToNewWindow.switchToNewTab());
        actor.attemptsTo(Waiting.toSecond(3));
        actor.attemptsTo(Scroll.to(ABOUT_THIS_ITEM_TEXT));
        String txt = Text.of(ABOUT_THIS_ITEM_TEXT).viewedBy(actor).resolve();
        System.out.println("-----------------------------------------------------");
        System.out.println(txt);
        System.out.println("-----------------------------------------------------");

    //    actor.attemptsTo(GenerateFile.file(txt));


    }
    public static ShippingTv user(){
        return new ShippingTv();
    }

}
