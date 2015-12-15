package gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class ResumeList extends AnchorPane {
    /**
     * Creates an AnchorPane layout.
     */
    public ResumeList() {
        try {
            getChildren().add(FXMLLoader.<Node>load(ClassLoader.getSystemResource("ResumeListView.fxml")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
