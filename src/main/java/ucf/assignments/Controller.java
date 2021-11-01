/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package ucf.assignments;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    /*
    Controller class for the .fxml file
    Will contain button functionality to dictate the behavior of the program
     */
    /*
    Create button: Prompts for the name of the list to create, then creates the new todo list and adds to master list

    Save all button: Saves all todo lists from the master list to the xml file

    Load File button: Accesses all the saved lists from the xml file and displays them in the Saved todo list box

    Load Single list: Allows user to prompt for the title of list, searches xml file for the list, and adds
    to Saved todo lsit area if this todo list is found

    View all button: Shows all todo lists and items in master list when selected

    View Completed items button: Shows only items that are completed when selected

    View Incomplete items button: Shows only items that need to be completed when selected

    Delete button: Only accessible when todo list is selected from middle box, deletes this todo list
    from the master list

    Save button: Only accessible when todo list is selected from middle box, Saves this todo list to
    the xml file when clicked

    Edit button: Only accessible when todo list is selected from middle box, Prompts to ask if user would like
    to edit entire list or item within list
        -If entire list Asks if user would like to add item, or rename list
        -If item prompts user to select item in list, then allows user to edit item or delete item

    Recover button: Only accessible when todo list is selected from right box, allows user to recover todo list
    from "storage" to master list

    Recover all button: Allows user to add all todo lists from "storage" to master list

    Note: you can hover over todo lists to bring up a drop down box of all items in that todo list then
    you can hover over each item to see all the attributes of that item
     */
}