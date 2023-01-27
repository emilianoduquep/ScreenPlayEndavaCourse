package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private String userName;
    private String userPassword;

    public DoLogin(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public static Performable withCredentials(String userName, String userPassword){
        return instrumented(DoLogin.class, userName, userPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}
