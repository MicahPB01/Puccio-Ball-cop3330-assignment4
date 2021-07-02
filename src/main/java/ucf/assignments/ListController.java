package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Micah Puccio-Ball
 *  Files saved as
 * path
 * description
 * Name::description::duedate::0/1
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class ListController {

    @FXML
    public void editTitleClick(ActionEvent actionEvent) {
        //call editList in EditList class passing Path from selected table view



    }
    @FXML
    public void editDescriptionClick(ActionEvent actionEvent) {
        //call editDescription  in EditList class passing Path from selected table view

    }
    @FXML
    public void addNewItemClick(ActionEvent actionEvent) {
        //Call addItem in AddItem class passing Path from selected table view


    }
    @FXML
    public void removeItemClick(ActionEvent actionEvent) {
        //Call removeItem in RemoveItem class passing Path from selected table view

    }
    @FXML
    public void editDueDateClick(ActionEvent actionEvent) {
        //call editItem from EditItem class passing Path from selected table view

    }
    @FXML
    public void markCompleteClick(ActionEvent actionEvent) {
        //call completeItem from EditItem class passing Path from selected table view

    }
    @FXML
    public void markIncompleteCLick(ActionEvent actionEvent) {
        //call incompleteItem from EditItem class passing Path from selected table view

    }
    @FXML
    public void showCompleteClick(ActionEvent actionEvent) {
        //call showComplete from LoadItems class passing Path and tableView index from selected table view

    }
    @FXML
    public void showIncompleteClick(ActionEvent actionEvent) {
        //call showIncomplete from LoadItems class passing Path and tableView index from selected table view
    }
    @FXML
    public void showAllClick(ActionEvent actionEvent) {
        //call loadAll from LoadItems class passing Path from selected table view
    }
    @FXML
    public void loadListClick(ActionEvent actionEvent) {
        //call loadList from LoadList class

    }
    @FXML
    public void addListClick(ActionEvent actionEvent) {
        //call addList from EditList class


    }
    @FXML
    public void removeListClick(ActionEvent actionEvent) {
        //call removeList from RemoveList class
    }
    @FXML
    public void editListClick(ActionEvent actionEvent) {
        //call loadItems from LoadItems class
    }
}
