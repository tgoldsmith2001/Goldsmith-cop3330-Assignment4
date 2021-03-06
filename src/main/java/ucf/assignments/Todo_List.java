/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package ucf.assignments;
import java.util.ArrayList;

public class Todo_List {
    /*
    Define private class variables for title (String) and an items (Array List of Items)
     */
    public Todo_List(String title){
        /*
        Set title class variable to input String title
         */
    }
    public Todo_List(String title, ArrayList<Item> items){
        /*
        Set title class variable to input String title
        Set items class array list to input array list items
         */
    }
    //Sorts the items list by date (earliest to latest) then returns the resulting Array list of items
    public ArrayList<Item> sortByDate(){
        /*
        For i=0 to i=items length
            For j=i+1 to j=items length
                Call compareTwoItems with input items[i] and items[j]
                    If False
                        Flip items[i] and items[j]
        return items
         */
        return null;
    }
    //Compares item 1 and item 2 if item 1 is earlier return true, otherwise false
    private boolean compareTwoItems(Item item1, Item item2){
        /*
        If date of item1 is earlier than date of item2
            return true
        Else
            Return false
         */
        return false;
    }
    //Allows user to add an item to items arraylist, then returns that item
    public ArrayList<Item> addItem(Item addedElement){
        /*
        Adds input parameter to items
        Returns items
         */
        return null;
    }
    //Allows a user to remove an element in items based on input parameter
    public ArrayList<Item> removeItem(String removedElement){
        /*
        Define index(int)
        Call searchArray (removedElement) and set equal to index
        If index is not -1
            remove element if items at index
         */
        return null;
    }
    //Searches for item in Array
    private int searchItem(String name){
        /*
        For each Item in items
            If the name of the item is the same as the input parameter return its index
        If input parameter is not found in list return -1
         */
        return -1;
    }
    //Allows user to update title of todo list based on input parameter
    public String updateTitle(String newTitle){
        /*
        Set the title variable to the input parameter
        Return the title of the Todo list
         */
        return "";
    }
    //Returns all values of items
    public ArrayList<Item>getItems(){
        /*
        Return the value of items
         */
        return null;
    }
    //Returns only the items that are incomplete from items
    public ArrayList<Item>getIncompleteItems(){
        /*
        Create return_Array (ArrayList of Items)
        For Item in items
            If complete is false for item
                Add to return_Array
        return return_Array
         */
        return null;
    }
    //Returns only the completed items from items
    public ArrayList<Item>getCompleteItems(){
        /*
        Create return_Array (ArrayList of Items)
        For Item in items
            If complete is true for item
                Add to return_Array
        return return_Array
         */
        return null;
    }
}
