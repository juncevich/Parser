package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import logic.Parser;


public class CategoryMenu extends GridPane {
    public CategoryMenu() {
        setAlignment(Pos.CENTER);
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(5,25,5,25));
        setGridLinesVisible(false);
        initCategoryMenu();

    }

    public void initCategoryMenu(){
        for (int i = 0; i < Parser.getCategoryList().size(); i++) {
            final Button buttonCategory = new Button(Parser.getCategoryList().get(i).text());

            buttonCategory.setPrefSize(250,20);
            buttonCategory.setTextAlignment(TextAlignment.JUSTIFY);
            buttonCategory.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    System.out.println(buttonCategory.getText());
//                    rootLayout.setCenter(new ResumeList());
//                    primaryStage.setTitle(buttonCategory.getText());

                }
            });
            if (i<10){
                this.add(buttonCategory, 0, i);
            } else if (i<20){
                this.add(buttonCategory, 1, i-10);
            }else if (i<30){
                this.add(buttonCategory, 2, i-20);
            } else if (i<40){
                this.add(buttonCategory, 3, i-30);

    }
}
}
}
