import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControlMenu implements EventHandler<ActionEvent>{
    tp2 application;

    public ControlMenu(tp2 app) {
        this.application = app;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == application.version1) {
            application.conteneur.getChildren().clear();
            application.addWidgetsToSceneV1(application.conteneur);
        } else if (actionEvent.getSource() == application.version2) {
            System.out.println("Version 2.0");
        }
    }
}
