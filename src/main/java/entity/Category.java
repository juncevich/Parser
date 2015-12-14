package entity;


public class Category {
    private int id;
    private int rubricNumber;
    private String rubricName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRubricNumber() {
        return rubricNumber;
    }

    public void setRubricNumber(int rubric_number) {
        this.rubricNumber = rubric_number;
    }

    public String getRubricName() {
        return rubricName;
    }

    public void setRubricName(String rubric_name) {
        this.rubricName = rubric_name;
    }
}
