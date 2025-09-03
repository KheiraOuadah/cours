import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    Label lAng;
    Label lMath;
    Label lInfo;
    Label lGeo;
    TextField tfAnglais;
    TextField tfMathematiques;
    TextField tfInformatique;
    TextField tfGeographie;
    TextField tfOption;
    RadioButton rbAng1;
    RadioButton rbAng2;
    RadioButton rbAng3;
    RadioButton rbMath1;
    RadioButton rbMath2;
    RadioButton rbMath3;
    RadioButton rbInfo1;
    RadioButton rbInfo2;
    RadioButton rbInfo3;
    RadioButton rbGeo1;
    RadioButton rbGeo2;
    RadioButton rbGeo3;
    ToggleGroup tgAnglais;
    ToggleGroup tgMathematiques;
    ToggleGroup tgInformatique;
    ToggleGroup tgGeographie;
    ComboBox<String> option;
    CheckBox coefCheckBox;
    Label lMoy;
    Button btnMoy;

    Menu optionMenu;
    MenuItem version1;
    MenuItem version2;
    Menu aide;
    MenuItem ccm;
    MenuItem aPropos;
    MenuBar menuBar;
    StackPane root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.root = new StackPane(); // créer un conteneur
        initWidgets();
        addWidgetsToSceneV2(this.root);

        createMenu();

        BorderPane pane = new BorderPane();
        pane.setTop(this.menuBar);
        pane.setCenter(this.root);
        BorderPane.setMargin(this.root, new Insets(10, 10, 10, 10));

        addListeners();

        primaryStage.setTitle("Calcul de la moyenne"); // titre de la fenêtre
// TODO : Fix
        primaryStage.getIcons().add(new Image("/static/icone-fenetre.gif"));
        primaryStage.setScene(new Scene(pane, 450, 425)); // mettre le conteneur comme contenu de la fenêtre.
        primaryStage.setMaxHeight(425);
        primaryStage.setMinHeight(425);
        primaryStage.setMaxWidth(450);
        primaryStage.setMinWidth(450);
        primaryStage.show();
    }

    private void addListeners() {
        ControlButton cb = new ControlButton(this);
        this.btnMoy.setOnAction(cb);
        ControlMenu cm = new ControlMenu(this);
        this.version1.setOnAction(cm);
        this.version2.setOnAction(cm);
    }

    private void createMenu() {
        this.optionMenu = new Menu("Options");
        this.version1 = new MenuItem("Version 1");
        this.version1.setGraphic(new ImageView(new Image("/static/icone-menu-version1.gif")));
        this.version2 = new MenuItem("Version 2");
        this.version2.setGraphic(new ImageView(new Image("/static/icone-menu-version2.gif")));
        this.aide = new Menu("Aide");
        this.ccm = new MenuItem("Comment ça marche ?");
        this.aPropos = new MenuItem("À propos");
        this.menuBar = new MenuBar();
        this.menuBar.getMenus().add(optionMenu);
        this.optionMenu.getItems().addAll(version1, version2, aide);
        this.aide.getItems().addAll(ccm, aPropos);
    }

    public void initWidgets() {
        this.lAng = new Label("Anglais");
        this.lMath = new Label("Mathematiques");
        this.lInfo = new Label("Informatique");
        this.lGeo = new Label("Géographie");

        this.tfAnglais = new TextField();
        this.rbAng1 = new RadioButton("1");
        this.rbAng2 = new RadioButton("2");
        this.rbAng3 = new RadioButton("3");
        this.tfMathematiques = new TextField();
        this.rbMath1 = new RadioButton("1");
        this.rbMath2 = new RadioButton("2");
        this.rbMath3 = new RadioButton("3");
        this.tfInformatique = new TextField();
        this.rbInfo1 = new RadioButton("1");
        this.rbInfo2 = new RadioButton("2");
        this.rbInfo3 = new RadioButton("3");
        this.tfGeographie = new TextField();
        this.rbGeo1 = new RadioButton("1");
        this.rbGeo2 = new RadioButton("2");
        this.rbGeo3 = new RadioButton("3");
        this.option = new ComboBox<>(FXCollections.observableArrayList("Latin", "Grec", "Sport"));
        this.option.getSelectionModel().select(0);
        this.tfOption = new TextField();
        this.coefCheckBox = new CheckBox("Prendre en considération les coeficients");
        this.lMoy = new Label("Valeur");
        this.btnMoy = new Button("Moyenne");

        this.tgAnglais = new ToggleGroup();
        this.tgMathematiques = new ToggleGroup();
        this.tgInformatique = new ToggleGroup();
        this.tgGeographie = new ToggleGroup();

        groupRadioBtns(this.tgAnglais, this.rbAng1, this.rbAng2, this.rbAng3);
        groupRadioBtns(this.tgMathematiques, this.rbMath1, this.rbMath2, this.rbMath3);
        groupRadioBtns(this.tgInformatique, this.rbInfo1, this.rbInfo2, this.rbInfo3);
        groupRadioBtns(this.tgGeographie, this.rbGeo1, this.rbGeo2, this.rbGeo3);
    }

    public void groupRadioBtns(ToggleGroup tg, RadioButton rb1, RadioButton rb2, RadioButton rb3) {
        rb1.setToggleGroup(tg);
        rb1.setSelected(true);
        rb2.setToggleGroup(tg);
        rb3.setToggleGroup(tg);
    }

    public void addWidgetsToSceneV2(StackPane root) {
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 10, 5, 10));
        grid.setAlignment(Pos.CENTER);

        grid.add(this.lAng, 0, 0);
        grid.add(this.lMath, 0, 1);
        grid.add(this.lInfo, 0, 2);
        grid.add(this.lGeo, 0, 3);

        grid.add(this.tfAnglais, 1, 0);
        grid.add(this.tfMathematiques, 1, 1);
        grid.add(this.tfInformatique, 1, 2);
        grid.add(this.tfGeographie, 1, 3);

        grid.add(new HBox(10, this.rbAng1, this.rbAng2, this.rbAng3), 2, 0);
        grid.add(new HBox(10, this.rbMath1, this.rbMath2, this.rbMath3), 2, 1);
        grid.add(new HBox(10, this.rbInfo1, this.rbInfo2, this.rbInfo3), 2, 2);
        grid.add(new HBox(10, this.rbGeo1, this.rbGeo2, this.rbGeo3), 2, 3);

        grid.add(this.option, 0, 4);
        grid.add(this.tfOption, 1, 4);
        grid.add(new Label("Optionnel"), 2, 4);

//        grid.setStyle("-fx-border-color: gray;");

        HBox hBox = new HBox(10, this.btnMoy, this.lMoy);
        hBox.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(grid, this.coefCheckBox, hBox);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        root.getChildren().add(vBox);
    }

    public void addWidgetsToSceneV1(StackPane root) {
        HBox line1 = initLineV1(this.tfAnglais, this.rbAng1, this.rbAng2, this.rbAng3, this.lAng);
        HBox line2 = initLineV1(this.tfMathematiques, this.rbMath1, this.rbMath2, this.rbMath3, this.lMath);
        HBox line3 = initLineV1(this.tfInformatique, this.rbInfo1, this.rbInfo2, this.rbInfo3, this.lInfo);
        HBox line4 = initLineV1(this.tfGeographie, this.rbGeo1, this.rbGeo2, this.rbGeo3, this.lGeo);

        // Line 5
        HBox line5 = new HBox(this.option, this.tfOption, new Label("Optionnel"));
        line5.setSpacing(10);
        line5.setPadding(new Insets(10, 10, 10, 10));
        line5.setAlignment(Pos.CENTER);

        // Line 6
        HBox line6 = new HBox(this.coefCheckBox);
        line6.setSpacing(10);
        line6.setPadding(new Insets(10, 10, 10, 10));
        line6.setAlignment(Pos.CENTER);

        // Line 7
        HBox line7 = new HBox(this.btnMoy, this.lMoy);
        line7.setSpacing(10);
        line7.setPadding(new Insets(10, 10, 10, 10));
        line7.setAlignment(Pos.CENTER);
        root.getChildren().add(new VBox(line1, line2, line3, line4, line5, line6, line7));
    }

    public HBox initLineV1(TextField tf, RadioButton rb1, RadioButton rb2, RadioButton rb3, Label label) {
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.getChildren().addAll(label, tf, rb1, rb2, rb3);

        hbox.setAlignment(Pos.CENTER);

        return hbox;
    }

    public String getAnglais() {
        return this.tfAnglais.getText();
    }

    public String getMathematiques() {
        return this.tfMathematiques.getText();
    }

    public String getInformatique() {
        return this.tfInformatique.getText();
    }

    public String getGeographie() {
        return this.tfGeographie.getText();
    }

    public String getOption() {
        return this.tfOption.getText();
    }
}