package gui;

import javafx.beans.NamedArg;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;

import java.io.IOException;


public class ResumeList extends Scene {
    Parent loader;

    public ResumeList(@NamedArg("root") Parent loader) {
        super(loader);
        try {
            this.loader = FXMLLoader.load(getClass().getResource("ResumeList.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.loader = loader;
    }

}
