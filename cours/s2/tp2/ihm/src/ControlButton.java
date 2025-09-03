import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;

public class ControlButton implements EventHandler<ActionEvent> {
    HelloWorld application;

    public ControlButton(HelloWorld app) {
        this.application = app;
    }

    public void onMouseClicked() {
        if (!this.isTextFieldsValid()) {
            return;
        }

        float anglais = Float.parseFloat(application.getAnglais());
        float math = Float.parseFloat(this.application.getMathematiques());
        float geo = Float.parseFloat(this.application.getGeographie());
        float info = Float.parseFloat(this.application.getInformatique());
        int coefAnglais = 1;
        int coefMath = 1;
        int coefGeo = 1;
        int coefInfo = 1;
        if (application.coefCheckBox.isSelected()) {
            coefAnglais = Integer.parseInt(((RadioButton) application.tgAnglais.getSelectedToggle()).getText());
            coefMath = Integer.parseInt(((RadioButton) application.tgMathematiques.getSelectedToggle()).getText());
            coefGeo = Integer.parseInt(((RadioButton) application.tgGeographie.getSelectedToggle()).getText());
            coefInfo = Integer.parseInt(((RadioButton) application.tgInformatique.getSelectedToggle()).getText());
        }
        float moy = (anglais * coefAnglais + math * coefMath + geo * coefGeo + info * coefInfo) / (coefAnglais + coefMath + coefGeo + coefInfo);

        if (!application.getOption().isEmpty()) {
            int coefOption = 1;
            if (!application.option.getValue().equals("Sport") && application.coefCheckBox.isSelected()) {
                coefOption = 2;
            }
            float option = Float.parseFloat(application.getOption());
            moy = (anglais * coefAnglais + math * coefMath + geo * coefGeo + info * coefInfo + option * coefOption) / (coefAnglais + coefMath + coefGeo + coefInfo + coefOption);
        }
        application.lMoy.setText(String.valueOf(moy));

    }

    public boolean isTextFieldsValid() {
        String anglais = this.application.getAnglais();
        String math = this.application.getMathematiques();
        String geo = this.application.getGeographie();
        String info = this.application.getInformatique();
        String option = this.application.getOption();

        String alertTitle = "Erreur !";
        if (anglais.isEmpty() || math.isEmpty() || geo.isEmpty() || info.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(alertTitle);
            alert.setHeaderText("Veuillez remplir tout les champs !");
            alert.showAndWait();
            return false;
        } else if (!(Float.parseFloat(anglais) >= 0 && Float.parseFloat(math) >= 0 && Float.parseFloat(geo) >= 0 && Float.parseFloat(info) >= 0)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(alertTitle);
            alert.setHeaderText("Les notes ne peuvent pas etre inférieur à 0 !");
            alert.showAndWait();
            return false;
        } else if (!(Float.parseFloat(anglais) <= 20 && Float.parseFloat(math) <= 20 && Float.parseFloat(geo) <= 20 && Float.parseFloat(info) <= 20)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(alertTitle);
            alert.setHeaderText("Les notes ne peuvent pas etre supérieur à 20 !");
            alert.showAndWait();
            return false;
        } else if (!option.isEmpty() && (Float.parseFloat(option) < 0 || Float.parseFloat(option) > 20)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(alertTitle);
            alert.setHeaderText("Note optionelle invalide !");
            alert.showAndWait();
        }
        return true;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == application.btnMoy) {
            onMouseClicked();
        }
    }
}
