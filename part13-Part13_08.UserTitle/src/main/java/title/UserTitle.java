package title;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        Parameters parameters = this.getParameters();
        String title = parameters.getNamed().get("title");

        window.setTitle(title);
        window.show();
    }
}
