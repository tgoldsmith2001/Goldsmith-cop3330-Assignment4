/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
package ucf.assignments;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Todo_List_Test {
    //Test for Requirement 9
    @Test
    void addItem() {
        /*
        Define test_9 (a todo list)
        Create new using initializer with only title input: new Todo_List("test_before")
        Define element_to_add (Item) and initialize with test values
        Create Test_List_9 (ArrayList of Items)
        Add element_to_add to Test_List_9
        Call addItem with input parameter element_to_add
        Check the resultant Array on the call of addItem is the same as Test_List_9
         */
    }
    //Test for Requirement 10
    @org.junit.jupiter.api.Test
    void removeItem() {
        /*
        Define test_10_array (ArrayList of Items), and initialize with 3 item variables
        Define test_10 (a todo list)
        Create new using initializer with title input, and ArrayList input: new Todo_List("test",test_10_array)
        For Item in test_10_initial_array
            Remove last element of test_10_array
            Call removeItem
            Check the resultant Array on the call of removeItem is the same as Test_10_array
         */
    }

    //Test for Requirement 8
    @org.junit.jupiter.api.Test
    void updateTitle() {
        /*
        Define test_8 (a todo list) and define using new using initializer with only title input: new Todo_List("test_before")
        Call updateTitle with input parameter "test_after"
        Check the title of test_1 by using an assert equals to ensure it was changed to "test_before"
         */
    }
    //Test for Requirement 14
    @org.junit.jupiter.api.Test
    void getItems() {
        /*
        Define test_14_items (arraylist of test items)
        Define test_14 (a todo list) and create new todoList with title "Test_14" and test_14_items
        Assert that test_14_items equals a call to getItems
         */
    }
    //Test for Requirement 15
    @org.junit.jupiter.api.Test
    void getIncompleteItems(){
        /*
        Define test_15_items as an arraylist of only incomplete test items
        Define test_15 as a new Todo List with title "Test_15" and an arraylist of items (with the incomplete items matching test_15_items)
        Assert that test_15_items equals a call to getIncompleteItems
         */
    }
    //Test for Requirement 16
    void getCompleteItems(){
        /*
        Define test_16_items as an arraylist of only complete test items
        Define test_16 as a new Todo List with title "Test_16" and an arraylist of items (with the complete items matching test_16_items)
        Assert that test_16_items equals a call to getCompleteItems
         */
    }
    //Test for Extra Credit
    void sortByDate(){
        /*
        Define test_EC as an arrayList of todo_lists (out of order)
        Define Ordered_test_EC as an arrayList of todo_lists (in order)
        Assert that arrat test_EC equals Ordered_test_EC
         */
    }
}