package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import parse.ParseCategoryService;

import java.io.IOException;


class CategoryMenuView extends GridPane {
    public CategoryMenuView() {
        setAlignment(Pos.BOTTOM_CENTER);
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(5,25,5,25));
        setGridLinesVisible(false);
        initCategoryMenu();

    }

    public void initCategoryMenu(){
        for (int i = 0; i < ParseCategoryService.getAll().size(); i++) {
            final CategoryButton categoryButton = new CategoryButton();
            categoryButton.setButton_id(ParseCategoryService.getAll().get(i).getRubricNumber());
            categoryButton.setName(ParseCategoryService.getAll().get(i).getRubricName());
            categoryButton.setText(ParseCategoryService.getAll().get(i).getRubricName());
            categoryButton.setPrefSize(250,20);
            categoryButton.setTextAlignment(TextAlignment.JUSTIFY);
            categoryButton.setOnAction(actionEvent -> {
                System.out.println(categoryButton.getButton_id()+" "+ categoryButton.getName());
//                Parent root1 = null;
//                try {
//                    root1 = FXMLLoader.load(getClass().getResource("ResumeListView.fxml"));
//                    Stage stage = new Stage();
//                    Scene scene = new Scene(root1);
//                    stage.setTitle(categoryButton.getName());
//                    stage.setScene(scene);
//                    stage.show();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }

//                    rootLayout.setCenter(new ResumeList());
//                    primaryStage.setTitle(buttonCategory.getText());

            });
            if (i<10){
                this.add(categoryButton, 0, i);
            } else if (i<20){
                this.add(categoryButton, 1, i-10);
            }else if (i<30){
                this.add(categoryButton, 2, i-20);
            } else if (i<40){
                this.add(categoryButton, 3, i-30);

    }
}
}
}
