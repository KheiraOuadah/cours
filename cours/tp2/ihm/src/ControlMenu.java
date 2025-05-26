import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControlMenu implements EventHandler<ActionEvent> {
    HelloWorld application;

    public ControlMenu(HelloWorld app) {
        this.application = app;
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == application.version1) {
            application.root.getChildren().clear();
            application.addWidgetsToSceneV1(application.root);
        } else if (event.getSource() == application.version2) {
            application.root.getChildren().clear();
            application.addWidgetsToSceneV2(application.root);
        }
    }
}
