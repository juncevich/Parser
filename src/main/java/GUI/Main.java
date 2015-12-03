package GUI;

import com.sun.javafx.geom.Vec2f;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.Parser;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Random;


public class Main extends Application {
    Parser parser;




    @Override
    public void start(Stage primaryStage) throws Exception{
        parser = new Parser();
        primaryStage.setTitle("Hello World");
        Button button = new Button("click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello World!");
            }
        });

        VBox vBox = new VBox();
        GridPane gridPane = new GridPane();
        
        for (Element element : parser.getCategoryList()
                ) {
            vBox.getChildren().add(new Button(element.text()));


        }


        primaryStage.setScene(new Scene(vBox,300,300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
