package lesson6.labs.prob1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainJavaFX extends Application {
    Scene scene;

    public static void main(String[] arg) {
        launch(arg);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Address Form");


        createScene();
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    private void createScene() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(15);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        Label textName = new Label("Name");
        Label textStreet = new Label("Street");
        Label textCity = new Label("City");
        Label textState = new Label("State");
        Label textZip = new Label("Zip");

        gridPane.add(textName, 0, 0, 1, 1);
        gridPane.setMargin(textName, new Insets(10, 0, 0, 0));
        gridPane.add(textStreet, 1, 0, 1, 1);
        gridPane.setMargin(textStreet, new Insets(10, 0, 0, 0));
        gridPane.add(textCity, 2, 0, 1, 1);
        gridPane.setMargin(textCity, new Insets(10, 0, 0, 0));

        TextField inputName = new TextField();
        TextField inputStreet = new TextField();
        TextField inputCity = new TextField();
        gridPane.add(inputName, 0, 1, 1, 1);
        gridPane.add(inputStreet, 1, 1, 1, 1);
        gridPane.add(inputCity, 2, 1, 1, 1);


        gridPane.add(textState, 0, 2, 1, 1);
        gridPane.setMargin(textState, new Insets(10, 0, 0, 0));
        gridPane.add(textZip, 1, 2, 1, 1);
        gridPane.setMargin(textZip, new Insets(10, 0, 0, 0));


        TextField inputState = new TextField();
        TextField inputZip = new TextField();


        gridPane.add(inputState, 0, 3, 1, 1);
        gridPane.add(inputZip, 1, 3, 1, 1);


        Button btn = new Button("Submit");
        HBox hbxBtn = new HBox(10);
        hbxBtn.setAlignment(Pos.BASELINE_CENTER);
        hbxBtn.getChildren().add(btn);


        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hbxBtn);
        borderPane.setPadding(new Insets(0, 0, 10, 0));

        borderPane.setTop(gridPane);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(inputName.getText().toString());
                System.out.println(inputStreet.getText().toString());
                System.out.println(inputCity.getText().toString() + ", " + inputState.getText().toString() + " " + inputZip.getText().toString());
            }
        });

        scene = new Scene(borderPane, 700, 200);
    }
    private void createScene2() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(15);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        Label textName = new Label("Name");
        Label textStreet = new Label("Street");
        Label textCity = new Label("City");
        Label textState = new Label("State");
        Label textZip = new Label("Zip");

        gridPane.add(textName, 0, 0, 2, 1);
        gridPane.setMargin(textName, new Insets(10, 0, 0, 0));
        gridPane.add(textStreet, 1, 0, 2, 1);
        gridPane.setMargin(textStreet, new Insets(10, 0, 0, 0));
        gridPane.add(textCity, 2, 0, 2, 1);
        gridPane.setMargin(textCity, new Insets(10, 0, 0, 0));

        TextField inputName = new TextField();
        TextField inputStreet = new TextField();
        TextField inputCity = new TextField();
        gridPane.add(inputName, 0, 1, 2, 1);
        gridPane.add(inputStreet, 1, 1, 2, 1);
        gridPane.add(inputCity, 2, 1, 2, 1);


        gridPane.add(textState, 0, 2, 2, 1);
        gridPane.setMargin(textState, new Insets(10, 0, 0, 0));
        gridPane.add(textZip, 1, 2, 2, 1);
        gridPane.setMargin(textZip, new Insets(10, 0, 0, 0));


        TextField inputState = new TextField();
        TextField inputZip = new TextField();


        gridPane.add(inputState, 0, 3, 1, 1);
        gridPane.add(inputZip, 1, 3, 1, 1);


        Button btn = new Button("Submit");
        HBox hbxBtn = new HBox(10);
        hbxBtn.setAlignment(Pos.BASELINE_CENTER);
        hbxBtn.getChildren().add(btn);


        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hbxBtn);
        borderPane.setPadding(new Insets(0, 0, 10, 0));

        borderPane.setTop(gridPane);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println(inputName.getText().toString());
                System.out.println(inputStreet.getText().toString());
                System.out.println(inputCity.getText().toString() + ", " + inputState.getText().toString() + " " + inputZip.getText().toString());
            }
        });

        scene = new Scene(borderPane, 700, 200);
    }
}
