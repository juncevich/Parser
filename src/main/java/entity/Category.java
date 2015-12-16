package entity;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Category {
    private int id;
    private int rubricNumber;
    private String rubricName;

    public Category() {
    }

    public Category(int id, int rubricNumber, String rubricName) {
        this.id = id;
        this.rubricNumber = rubricNumber;
        this.rubricName = rubricName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRubricNumber() {
        return rubricNumber;
    }

    public void setRubricNumber(int rubricNumber) {
        this.rubricNumber = rubricNumber;
    }

    public String getRubricName() {
        return rubricName;
    }

    public void setRubricName(String rubricName) {
        this.rubricName = rubricName;
    }
}
