package lesson6.labs.prob2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainJavaFx2 extends Application {
    Utils utils = new Utils();
    Scene scene;

    public static void main(String[] arg) {
        launch(arg);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("String Utility");
        createScene();
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


    }

    private void createScene() {
        HBox mainBox = new HBox();
        mainBox.setAlignment(Pos.CENTER);
        VBox leftBox = new VBox();
        leftBox.setAlignment(Pos.CENTER);

        leftBox.setPadding(new Insets(15, 15, 15, 15));

        leftBox.setSpacing(15);

        VBox rightBox = new VBox();
        rightBox.setAlignment(Pos.CENTER_LEFT);

        Button btnCountLetters = new Button("Count Letters");
        Button btnReverseLetters = new Button("Reverse Letters");
        Button btnRemoveDuplicates = new Button("Remove Duplicates");

        btnCountLetters.setMaxWidth(150);
        btnReverseLetters.setMaxWidth(150);
        btnRemoveDuplicates.setMaxWidth(150);

        Label labelInput = new Label("Input");
        Label labelOutut = new Label("Output");

        TextField textFieldInput = new TextField();
        TextField textFieldOutput = new TextField();

        leftBox.getChildren().add(btnCountLetters);
        leftBox.getChildren().add(btnReverseLetters);
        leftBox.getChildren().add(btnRemoveDuplicates);

        rightBox.getChildren().add(labelInput);
        rightBox.getChildren().add(textFieldInput);
        rightBox.getChildren().add(labelOutut);
        rightBox.getChildren().add(textFieldOutput);

        mainBox.getChildren().add(leftBox);
        mainBox.getChildren().add(rightBox);


        btnCountLetters.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldOutput.setText(utils.wordCount(textFieldInput.getText().toString()) + "");
            }
        });
        btnRemoveDuplicates.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldOutput.setText(utils.removeDuplicates(textFieldInput.getText().toString()) + "");
            }
        });
        btnReverseLetters.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldOutput.setText(utils.reverseLetters(textFieldInput.getText().toString()) + "");
            }
        });

        scene = new Scene(mainBox, 400, 160);
    }


}
