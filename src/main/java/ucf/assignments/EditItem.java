package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Micah Puccio-Ball
 *  Files saved as
 * path
 * description
 * Name::description::duedate::0/1
 */
public class EditItem {

    public String addItem(String path)   {
        //clears req 9
        //try to open file given path from tableview
        //get data from text fields name, description, and due date
        //save data to a string
        //add string to the end of the txt file
        //close txt file
        //call showAll from loadItems class passing path to update table view
        return "complete";
    }

    public String removeItem(String path, int index)   {
        //clears req 10
        //try to open file given path from tableview
        //skip to the line of the index
        //remove line
        //close txt file
        //call showAll from loadItems class passing path to update table view
        return "complete";
    }

    public String editDescription(String path, int index)   {
        //clears req 11
        //prompt using dialog box for new description
        //open list txt file from selected tableview
        //store current line in a temp string
        //create new string based on temp string replacing the old description with the new one
        //close txt file
        //call showAll from LoadItems class to update tableview

        return "complete";
    }

    public String editDueDate(String path, int index)   {
        //clears req 12
        //prompt using dialog box for new due date
        //open list txt file from selected tableview
        //store current line in a temp string
        //create new string based on temp string replacing the old date with the new one
        //close txt file
        //call showAll from LoadItems class to update tableview

        return "complete";
    }

    public String saveList(String path)   {
        //clears req 17
        //open a file chooser for user to save as txt file
        return "complete";
    }

    public String saveAll()   {
        //clears req 18
        //open file chooser for user the save as txt file
        //use file stream to combine all txt files in dir into one txt file
        return "complete";
    }




}
