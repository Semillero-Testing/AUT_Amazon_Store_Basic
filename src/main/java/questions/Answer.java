package questions;

import Interaction.Waiting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class Answer implements Question<String> {

    private Target target;

    public Answer(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(Waiting.toSecond(2));
        return Text.of(target).viewedBy(actor).asString();


    }

    public static Answer message(Target target){
        return new Answer(target);
    }


}
