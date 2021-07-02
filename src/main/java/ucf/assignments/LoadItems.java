package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Micah Puccio-Ball
 *  Files saved as
 * path
 * description
 * Name::description::duedate::0/1
 */
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LoadItems {
    @FXML private TableView<ItemObject> tableView;
    @FXML private TableColumn<ItemObject, String> ListName;
    @FXML private TableColumn<ItemObject, String> Description;

    public String showAll(String path)   {
        //clears req14
        //create observable list
        //using the path provided, open the list txt file in try catch
        //skip three lines to get to first item
        //loop through the rest of the lines in the txt file add each line to returnList
        //show observable array list in tableView

        return "Completed";
    }

    public String showComplete(String path)   {
        //clears req 16
        //create observable list
        //using the path provided, open the list txt file in try catch
        //skip three lines to get to first item
        //loop through the rest of the lines in the txt file add each line to returnList
            //only add line if the last char in string is 1
        //show observable array list in tableView

        return "Completed";

    }

    public String showIncomplete(String path)   {
        //clears req 15
        //create observable list
        //using the path provided, open the list txt file in try catch
        //skip three lines to get to first item
        //loop through the rest of the lines in the txt file add each line to returnList
            //only add line if the last char in string is 0
        //show observable array list in tableView

        return "Completed";
    }

    public String complete(String path, int index)   {
        //clears req 13
        //using the path provided, open the list txt file in try catch
        //skip three lines plus index to get to selected item to edit
        //edit end of line from 0 to 1

        return "Completed";
    }
    public String incomplete(String path, int index)   {
        //using the path provided, open the list txt file in try catch
        //skip three lines plus index to get to selected item to edit
        //edit end of line from 1 to 0

        return "Completed";
    }


}
