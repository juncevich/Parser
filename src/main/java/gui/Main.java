package gui;

import entity.Category;
import entity.Resume;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import parse.ParseCategoryService;
import parse.ParseResumeService;
import utils.Parser;

import java.io.IOException;
import java.util.List;

import static gui.Main.loadData;


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
        CategoryMenuView categoryMenuView = new CategoryMenuView();
        ParseCategoryService parseCategoryService = new ParseCategoryService();
        List<Category> categoryList = parseCategoryService.getAll();


        //            button1.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent actionEvent) {
//                    System.out.println(button1.getText());
//                    rootLayout.setCenter(new ResumeList());
//                    primaryStage.setTitle(button1.getText());
//
//                }
//            });





        rootLayout.setCenter(categoryMenuView);
    }

    static void loadData(){
        List<Resume> resumeList = ParseResumeService.getResumeListByCategory(1);
    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
        loadData();
    }
}
