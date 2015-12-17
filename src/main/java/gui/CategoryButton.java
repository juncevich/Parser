package gui;


import javafx.scene.control.Button;

class CategoryButton extends Button{
    private int button_id;
    private String name;


    public int getButton_id() {
        return button_id;
    }

    public void setButton_id(int button_id) {
        this.button_id = button_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
