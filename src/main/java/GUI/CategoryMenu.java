package gui;

import javafx.beans.NamedArg;
import javafx.scene.Parent;
import javafx.scene.Scene;


class CategoryMenu extends Scene {
    public CategoryMenu(@NamedArg("root") Parent root) {
        super(root);
    }

    public CategoryMenu(@NamedArg("root") Parent root, @NamedArg("width") double width, @NamedArg("height") double height) {
        super(root, width, height);
    }

}
