package com.twu.biblioteca.application;

import com.twu.biblioteca.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySection {
    static Scanner input = new Scanner(System.in);

    private List<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void getAvailableItemsList() {
        for(int i = 0; i < itemList.size(); i++) {
            if(!itemList.get(i).isCheckedOut()) {
                System.out.println(itemList.get(i).toString(i));
            }
        }
    }

    public void getNotAvailableItemsList() {
        for(int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).isCheckedOut()) {
                System.out.println(itemList.get(i).toString(i));
            }
        }
    }

    public String checkOutItem(int index) {
        return(itemList.get(index).resultMessage());
    }

    public String returnItem(int bookIndex) {
        if(itemList.get(bookIndex).isCheckedOut()) {
            itemList.get(bookIndex).returnItem();
            return ("Thank you for returning the book");
        }
        else {
            return ("That is not a valid book to return.");
        }
    }
}
