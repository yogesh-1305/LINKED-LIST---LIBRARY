package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> myll = new MyLinkedList<>();
        for (int i=0; i<=5; i++){
            myll.add(i*i);
        }
        // printing list
        myll.print();

        myll.set(13,0);

        myll.print();
    }
}
