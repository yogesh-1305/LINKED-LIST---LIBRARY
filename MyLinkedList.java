package com.company;

// OWN IMPLEMENTED lINKED LIST CLASS
public class MyLinkedList<E> {
    Node<E> head;


    // ADD FUNCTION TO ADD ELEMENTS TO LINKED LIST
    void add(E data){
        // CREATING OBJECT OF NODE CLASS (CREATING NEW NODE)
        Node<E> toAdd = new Node<E>(data);

        // CHECKING IF LIST IS EMPTY OR NOT
        if (isEmpty()){
            // IF LIST IS EMPTY
            // SET THE DATA ENTERED AS HEAD
            head = toAdd;

            // AND RETURN OUT OF THE STATEMENT
            return;
        }

        // SETTING THE HEAD NOTE TO A TEMP VARIABLE
        Node<E> temp = head;

       /*
        WHILE TEMP IS NOT EQUAL TO NULL (OR WE DON'T REACH THE END OF THE LIST)
        SET TEMP TO THE NEXT NODE

        ONCE WE REACH THE LAST NODE,
        THEN COME OUT OF THE LOOP, AND
        ADD THE NEW NODE TO TH POSITION OF TEMP
       * */
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }



    // FUNCTION TO CHECK IF THE LIST IS EMPTY OR NOT
    boolean isEmpty(){
        return head == null;
    }

    // PRINT FUNCTION TO PRINT LIST ELEMENTS
    void print(){
        Node<E> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }



    // FUNCTION TO FIND INDEX OF THE ELEMENT STORED IN LINKED LIST
    E indexOf(E element){
        Node<E> temp1 = head; // SETTING HEAD TO TEMPORARY VARIABLE temp1
        int index = 0; // INITIALIZING INDEX TO 0

            /*
            WHILE TEMP IS NOT EQUAL TO NULL (OR WE DON'T REACH THE END OF THE LIST)
            SET TEMP TO THE NEXT NODE, AND
            INCREASE THE INDEX BY 1

            IF THE data AT THAT NODE IS EQUAL TO THE element THE USER ENTERED,
            THE RETURN THE INDEX VALUE AT THAT POINT OF TIME

            ELSE (IF THE ELEMENT IS NOT FOUND IN THE LIST,
            RETURN -1)
           * */
        while (temp1.next != null){
            temp1 = temp1.next;
            index++;
            if (temp1.data == element){
                System.out.println(index);
            }
        }
        System.out.println("Element not found");
        return element;
    }



    // METHOD TO ADD AN ELEMENT AT A SPECIFIC INDEX
    void set(E data, int index){
        // CREATING TEMPORARY NODE AND SETTING IT TO HEAD NODE
        Node<E> temp = head;

        // GRABBING THE DATA AND SET CREATING NEW NODE
        Node<E> newNode = new Node<>(data);

        // CHECK FOR INVALID INDEX POSITION
        if (index < 0){
            System.out.println("Invalid Index!");
        }

        // ADDING NEW NODE TO FIRST POSITION
        if (index == 0){
            newNode.next = head;
            head = newNode;

        // ADDING NEW NODE TO OTHER THAN FIRST POSITION
        }else {
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



    // NODE CLASS
    static class Node<E>{
        E data; // DATA TO BE STORED IN LINKED LIST
        Node<E> next; // NODE VARIABLE

        // CONSTRUCTOR
        Node(E data){
            this.data = data;
            next = null;
        }
    }
}

