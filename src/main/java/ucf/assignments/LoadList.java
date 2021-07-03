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
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class LoadList {
    @FXML private TextField listName;
    @FXML private TableView listTable;
    public String loadList(String path)   {
        //clears req 19 and 20
        //create new file chooser
        //allow user to select one or more files
        //for each file, read the first three lines to get path, name, and description
        //store the path, name, and description into observable arraylist
        //show observable array list in tableview
        System.out.println(listName.getText());
        ListObject test = new ListObject(new SimpleStringProperty("Maria"), new SimpleStringProperty("Teasdfst"));
        System.out.println(test.getDescription());
        System.out.println(test.getName());



        return "complete";
    }
}
