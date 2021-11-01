/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package ucf.assignments;
import java.nio.file.Path;
import java.util.ArrayList;

/*
This Class deals with the functional aspects of a todo list such as adding or deleting todo lists
as well as dealing with memory by creating a xml file to save to at an input path, and having functionality
for saving multiple lists, single lists, and retrieving lists
Additionally this class contains a master list of all active todo lists
 */
public class Todo_Controller {
    //Define private class variable all_todo_lists (ArrayList of Todo_List)
    //Create private class variables for file_name (String) and file_path(Path) **For Storage**
    public Todo_Controller(Path path, String name){
        /*
        Set this.file_name and this.file_path to input parameters
        If output file is not already made
            Create new file at path+"\"+name+".xml"
         */
    }
    //Allows the user to input a todo list to add to the master list
    public boolean addTodoList(Todo_List toAdd){
        /*
        Check if Todo_List title matches the title of another in all_todo_list
        if this is the case
            return false
        else
            add toAdd to all_todo_list
            return true
         */
        return true;
    }
    //Allows user to delete a todo list by name from the master list
    public boolean removeTodoList(Todo_List toRemove){
        /*
        Check if toRemove is in all_todo_list
        if this is the case
            remove toRemove from Todo_List
            return true
        else
            return false
         */
        return true;
    }
    //Allows the user to save a single todo list to the xml file
    public boolean saveSingleToFile(Todo_List items){
        /*
        Define a Buffered Writer and file
        For each Item in items
            Print the Item to file in xml format
         */
        return true;
    }
    //Allows the user to save all active todo lists in the master list to xml file
    public boolean saveAllToFile(ArrayList<Todo_List> todo){
        /*
        Define a Buffered Writer and file
        Call readMemory() and save return value to storedTodos
        for each todo_list in todo
            Search each item in storedTodos to ensure todo_list is not already in memory (avoid duplication)
            Print Todo list information in xml format
            For each Item in todo_list
                Print the Item to file in xml format
                */
        /*
                Example:
                <Todos>
                    <Todo>
                        <Title>myTitle</Title>
                        <Items>
                            <Item>
                                <Description>myDescription</Description>
                                <Date>Date</Date>
                                <Complete>Boolean</Complete>
                            </Item>
                            <Item>
                                ...
                            </Item>
                        </Items>
                    </Todo>
                </Todos>
         */
        return true;
    }
    //Allows the user to search the storage for a todo list by name
    public ArrayList<Todo_List> searchStorage(String listTitle){
        /*
        Define fromMemory (ArrayList of Todo_List)
        Set fromMemory to a call of readMemory(filePath)
        for each Todo_List in fromMemory
            if listTitle is equal to title of Todo_List at index
                return TodoList at index
        Return null
         */
        return null;
    }
    //Reads all todo lists from xml file and returns an arraylist of these lists
    public ArrayList<Todo_List> readMemory(){
        /*
        Define a Buffered Reader and file reader at filePath
        Define String Line and int index=-1
        Define fromMemory (Array List of Todo_Lists)
        While Line=next line is not null
            Parse the xml file and extract values for each component of each todo list
        Return fromMemory
         */
        return null;
    }
}
