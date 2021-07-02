package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Micah Puccio-Ball
 *  Files saved as
 * path
 * description
 * Name::description::duedate::0/1
 */
import javafx.beans.property.SimpleStringProperty;

public class ListObject {


    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public String getDueDate() {
        return dueDate.get();
    }

    public SimpleStringProperty dueDateProperty() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate.set(dueDate);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public ListObject(SimpleStringProperty name, SimpleStringProperty description, SimpleStringProperty dueDate, SimpleStringProperty status) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    private final SimpleStringProperty name;
    private final SimpleStringProperty description;
    private final SimpleStringProperty dueDate;
    private final SimpleStringProperty status;



}
