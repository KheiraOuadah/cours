import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class tp1 extends Application {
    Label ang;
    TextField AnglaisTextField;
    ToggleGroup groupang;
    Label maths;
    TextField mathsTextField;
    ToggleGroup groupmaths;
    Label inf;
    TextField infoTextField;
    ToggleGroup groupinf;
    Label geo;
    TextField geoTextField;
    ToggleGroup groupgeo;
    ComboBox optionnelbox;
    TextField optionnelTextField;
    Label optionnel;
    CheckBox cb;
    Button moyenne;
    Label valeur;
    RadioButton ang1;
    RadioButton ang2;
    RadioButton ang3;
    RadioButton mat1;
    RadioButton mat2;
    RadioButton mat3;
    RadioButton inf1;
    RadioButton inf2;
    RadioButton inf3;
    RadioButton geo1;
    RadioButton geo2;
    RadioButton geo3;
    VBox vbox;
    FlowPane conteneur;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Calcul de la moyenne"); //titre de la fenêtre
        initWidgets();
        addWidgetsToSceneV1();
//        addWidgetsToSceneV2();
        primaryStage.setScene(new Scene(conteneur, 400, 350)); //mettre le conteneur comme contenu de la fenêtre.
        primaryStage.show();
    }



    private void initWidgets() {
        this.ang = new Label("Anglais");
        this.AnglaisTextField = new TextField();
        this.groupang = new ToggleGroup();
        this.ang1=new RadioButton("1");
        ang1.setToggleGroup(groupang);
        ang1.setSelected(true);
        this.ang2=new RadioButton("2");
        ang2.setToggleGroup(groupang);
        this.ang3=new RadioButton("3");
        ang3.setToggleGroup(groupang);

        this.maths = new Label("Mathématiques");
        this.mathsTextField = new TextField();
        this.groupmaths = new ToggleGroup();
        this.mat1=new RadioButton("1");
        mat1.setToggleGroup(groupmaths);
        mat1.setSelected(true);
        this.mat2=new RadioButton("2");
        mat2.setToggleGroup(groupmaths);
        this.mat3=new RadioButton("3");
        mat3.setToggleGroup(groupmaths);

        this.inf = new Label("Informatique");
        this.infoTextField = new TextField();
        this.groupinf = new ToggleGroup();
        this.inf1=new RadioButton("1");
        inf1.setToggleGroup(groupinf);
        inf1.setSelected(true);
        this.inf2=new RadioButton("2");
        inf2.setToggleGroup(groupinf);
        this.inf3=new RadioButton("3");
        inf3.setToggleGroup(groupinf);

        this.geo = new Label("Géographie");
        this.geoTextField = new TextField();
        this.groupgeo = new ToggleGroup();
        this.geo1 =new RadioButton("1");
        geo1.setToggleGroup(groupgeo);
        geo1.setSelected(true);
        this.geo2=new RadioButton("2");
        geo2.setToggleGroup(groupgeo);
        this.geo3=new RadioButton("3");
        geo3.setToggleGroup(groupgeo);

        this.optionnelbox =new ComboBox(FXCollections
                .observableArrayList(new String[]{"Latin","Grec", "Sport" }));
        optionnelbox.getSelectionModel().select(0);
        this.optionnelTextField = new TextField();
        this.optionnel = new Label("Optionnel");

        this.cb =new CheckBox("Prendre en considération les coefficients");

        this.moyenne = new Button("Moyenne");
        this.valeur = new Label("Valeur");

    }

    private void addWidgetsToSceneV2() {
        
    }

    private void addWidgetsToSceneV1() {
        FlowPane flow1 = new FlowPane();
        flow1.setVgap(4); //Ajouter des espaces entre les lignes de composants
        flow1.setHgap(4); //Ajouter des espaces entre les composants dans une même ligne
        flow1.getChildren().addAll(this.ang,this.AnglaisTextField,this.ang1,this.ang2,this.ang3);

        FlowPane flow2 = new FlowPane();
        flow2.setVgap(4); //Ajouter des espaces entre les lignes de composants
        flow2.setHgap(4);
        flow2.getChildren().addAll(this.maths,this.mathsTextField,this.mat1,this.mat2,this.mat3);

        FlowPane flow3 = new FlowPane();
        flow3.setVgap(4);
        flow3.setHgap(4);
        flow3.getChildren().addAll(this.inf,this.infoTextField,this.inf1,this.inf2,this.inf3);

        FlowPane flow4 = new FlowPane();
        flow4.setVgap(4);
        flow4.setHgap(4);
        flow4.getChildren().addAll(this.geo,this.geoTextField,this.geo1,this.geo2,this.geo3);

        FlowPane flow5 = new FlowPane();
        flow5.setVgap(4);
        flow5.setHgap(4);
        flow5.getChildren().addAll(this.optionnelbox,this.optionnelTextField,this.optionnel);

        FlowPane flow6 = new FlowPane();
        flow6.setVgap(4);
        flow6.setHgap(4);
        flow6.getChildren().addAll(this.moyenne,this.valeur);

        this.vbox =new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10,10,10,10));
        vbox.getChildren().addAll(flow1,flow2,flow3,flow4,flow5,this.cb,flow6);

        this.conteneur = new FlowPane();
        conteneur.setVgap(4);
        conteneur.setHgap(4);
        conteneur.getChildren().addAll(this.vbox);



    }

}

































