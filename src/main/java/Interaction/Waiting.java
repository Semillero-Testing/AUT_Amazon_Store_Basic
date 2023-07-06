package Interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static utils.FitTime.succefull;


public class Waiting implements Interaction {
    private int seconds;

    public Waiting(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Awaitility.await().forever().pollInterval(seconds, TimeUnit.SECONDS).until(succefull());

    }

    public static Waiting toSecond(int seconds) {
        return Tasks.instrumented(Waiting.class, seconds);
    }

}
