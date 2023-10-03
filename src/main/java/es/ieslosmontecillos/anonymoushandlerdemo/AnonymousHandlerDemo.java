package es.ieslosmontecillos.anonymoushandlerdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class AnonymousHandlerDemo extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 220, 50);
        HBox botones = new HBox();
        stage.setTitle("Anonymous Handler Demo");
        Button newProc = new Button("New");
        Button openProc = new Button("Open");
        Button saveProc = new Button("Save");
        Button printProc = new Button("Print");

        //Anonymous InnerClassess
        newProc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Nuevo proceso");
            }
        });
        openProc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Abrir proceso");
            }
        });
        saveProc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Guardar Proceso");
            }
        });
        printProc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Imprimir proceso");
            }
        });

        //Ajuste del HBox
        botones.getChildren().add(newProc);
        botones.getChildren().add(openProc);
        botones.getChildren().add(saveProc);
        botones.getChildren().add(printProc);
        botones.setAlignment(Pos.CENTER);
        botones.setSpacing(10);


        root.setCenter(botones);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}