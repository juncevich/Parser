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
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import logic.Parser;
import org.jsoup.nodes.Element;

import java.awt.*;
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
        
        //for (Element element : parser.getCategoryList()
        for (int i = 0; i < parser.getCategoryList().size(); i++) {
            Button button1 = new Button(parser.getCategoryList().get(i).text());
            button1.setPrefSize(250,40);
            if (i<10){
                gridPane.add(button1, 0, i);
            } else {
                gridPane.add(button1, 1, i);
            }

            //vBox.getChildren().add(button1);
            //vBox.getChildren().add(new Button(element.text()));


        }


        primaryStage.setScene(new Scene(gridPane,600,600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
