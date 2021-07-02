package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Micah Puccio-Ball
 *  Files saved as
 * path
 * description
 * Name::description::duedate::0/1
 */
import javafx.scene.control.TextInputDialog;

import java.util.Optional;



public class EditList {
    public String addList()   {
        //clears req 6
        //create and set string variables equal to text entered in the title
        //and description fields from GUI

        //create new txt file with the name being equal to what was entered
        //open new txt file
        //write one line containing the lists description
        //close the file
        //call loadList in LoadList class to update tableview
        return "complete";
    }

    public String removeList(String path)   {
        //clears req 7
        //attempt to delete txt file  associated with path
        //call loadList in LoadList class to update tableview
        return "complete";
    }

    public String editTitle(String path)   {
        //clears req 8
        //prompt using dialog box for new title
        //rename selected file to the result of the dialog box
        //call loadList in LoadList class to update tableview
        return "complete";
    }

}
