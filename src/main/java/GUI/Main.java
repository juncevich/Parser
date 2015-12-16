package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import logic.Parser;

import java.io.IOException;


public class Main extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private AnchorPane CategoryLayout;
    ResumeList resumeList;
    Parser parser = new Parser();
    
    @Override
    public void start(final Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Resume parser.");
        initRootLayout();
        showCategoryView();

    }


    public void initRootLayout() {
        try {

            rootLayout = FXMLLoader.load(ClassLoader.getSystemResource("RootLayout.fxml"));
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showCategoryView(){
        CategoryMenu categoryMenu = new CategoryMenu();

//            button1.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent actionEvent) {
//                    System.out.println(button1.getText());
//                    rootLayout.setCenter(new ResumeList());
//                    primaryStage.setTitle(button1.getText());
//
//                }
//            });





        rootLayout.setCenter(categoryMenu);
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
