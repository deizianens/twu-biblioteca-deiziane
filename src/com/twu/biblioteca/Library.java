package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Item> itemList = new ArrayList<Item>();

    public void addItem(Book book) {
        this.itemList.add(book);
    }

    public void getitemList() {
        for(int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i).toString(i));
        }
    }


    public String checkOutItem(int index) {
        if(!itemList.get(index).isCheckedOut()) {
            itemList.get(index).checkItem();
            return ("Thank you! Enjoy the book");
        }
        else {
            return ("Sorry, that book is not available");
        }

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
