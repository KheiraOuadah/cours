import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        /*version de base
        primaryStage.setTitle("Hello World!"); //titre de la fenêtre
        Label label = new Label("Hello World"); //créer un label
        StackPane root = new StackPane(); //créer un conteneur
        root.getChildren().add(label);      //ajouter le bouton au conteneur
        primaryStage.setScene(new Scene(root, 300, 250)); //mettre le conteneur comme contenu de la fenêtre.
        primaryStage.show();
        fin */
        /*version amélioré
        primaryStage.setTitle("Hello World"); //titre
        StackPane root = new StackPane(); //conteneur
        Label labNom=new Label("Nom");
        TextField tfNom=new TextField();
        //root.getChildren().add(new Label("Hello World")); //ajout label conteneur
        root.getChildren().add(labNom);
        root.getChildren().add(tfNom);
        primaryStage.setScene(new Scene(root, 300, 250)); // mettre conteneur comme contenu
        primaryStage.show();
         */

        /*test internet*/
        primaryStage.setTitle("HelloWorld");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

//        Label scenetitle = new Label("Welcome");
//        grid.add(scenetitle, 0, 0, 2, 1);//column 0 row 0 columnspan 2 rowspan 1

        Label userName = new Label("Nom:");
        grid.add(userName, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 0);

        ToggleGroup group = new ToggleGroup();
        RadioButton rbM=new RadioButton("Male");
        rbM.setToggleGroup(group);
        rbM.setSelected(true);
        grid.add(rbM, 0, 1);

        RadioButton rbF=new RadioButton("Femelle");
        rbF.setToggleGroup(group);
        grid.add(rbF, 1, 1);
        Button button = new Button("OK");
        grid.add(button, 0, 2,2,1);

        ComboBox combo=new ComboBox(FXCollections.observableArrayList(new String[]{"IE","Chrome", "Firefox" }));
        combo.getSelectionModel().select(0);
        grid.add(combo, 0, 3,2,1);

        CheckBox cb=new CheckBox("J'accepte les conditions d'utilisations");
        grid.add(cb, 0, 4,2,1);
        

//        Label pw = new Label("Password:");
//        grid.add(pw, 0, 2);
//
//        PasswordField pwBox = new PasswordField();
//        grid.add(pwBox, 1, 2);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}