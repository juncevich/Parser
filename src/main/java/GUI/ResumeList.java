package gui;

import javafx.beans.NamedArg;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;

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
