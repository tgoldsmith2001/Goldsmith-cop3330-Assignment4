/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Todo_ControllerTest {
    /*Instantiate Todo_Controller_Test (new Todo_Controller)
    Create initialList (TodoList) with title "INITIAL_TITLE"
    Add a TodoList to Todo_Controller_Test.all_todo_lists
     */
    //Test for Requirement 6
    @Test
    void addTodoList() {
        /*
        Create test_6 (Todo_List) using initializer with title
        Create test_6_expectedArray
        Add TodoList with input parameter "INITIAL_TITLE" and test_6 to test_6_expectedArray
        Set boolean test_6_ifAdded to call of addTodoList
        Assert that test_6_ifAdded is true
        Assert that array in Controller is equal to test_6_expectedArray
         */
    }
    //Test for Requirement 7
    @Test
    void removeTodoList() {
        /*
        Create test_7 (Todo_List) with input parameter "INITIAL_TITLE"
        Call removeTodoList with input test_7
        Call Assert equals to ensure Todo_Controller_Test is an empty array
         */
    }
    //Test for Requirement 17
    @Test
    void saveSingleToFile(){
        /*
        Define a new array of todo lists
        Add one todo list to the array
        Save all todo lists in array to a file
        Call readMemory of the created file
        Assert that initial array equals the call to readMemory
         */
    }
    //Test for Requirement 18
    @Test
    void saveAllToFile(){
                /*
        Define a new array of todo lists
        Add multiple todo list to the array
        Save all todo lists in array to a file
        Call readMemory of the created file
        Assert that initial array equals the call to readMemory
         */
    }
    //Test for Requirement 19 and 20
    @Test
    void searchStorage(){
        /*
        Define a new array of todo lists
        Add multiple todo list to the array
        Save all todo lists in array to a file
        Call searchStorage for one element in memory, and set equal to todo list variable
        Assert that todo list variable equals intended memory access
        Call searchStorage again for another element, and set equal to another variable
        Assert that todo list variable equals intended memory access
         */
    }
}