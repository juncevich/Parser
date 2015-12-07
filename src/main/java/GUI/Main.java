package GUI;

import com.sun.javafx.geom.Vec2f;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import logic.Parser;
import org.jsoup.nodes.Element;

import java.awt.*;
import java.io.IOException;
import java.util.Random;


public class Main extends Application {
    Parser parser;




    @Override
    public void start(final Stage primaryStage) throws Exception{
        parser = new Parser();
        primaryStage.setTitle("Resume parser");


        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(5,25,5,25));
        gridPane.setGridLinesVisible(false);
        for (int i = 0; i < parser.getCategoryList().size(); i++) {
            final Button button1 = new Button(parser.getCategoryList().get(i).text());

            button1.setPrefSize(250,20);
            button1.setTextAlignment(TextAlignment.JUSTIFY);
            button1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    System.out.println(button1.getText());
                    primaryStage.setScene(new Scene(new GridPane(), 1000, 370));
                    primaryStage.setTitle(button1.getText());
                }
            });
            if (i<10){
                gridPane.add(button1, 0, i);
            } else if (i<20){
                gridPane.add(button1, 1, i-10);
            }else if (i<30){
                gridPane.add(button1, 2, i-20);
            } else if (i<40){
            gridPane.add(button1, 3, i-30);
        }


        }
        Scene scene = new Scene(gridPane,1000,370);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
