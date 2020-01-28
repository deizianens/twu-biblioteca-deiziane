package com.twu.biblioteca.application;

import com.twu.biblioteca.domain.Item;
import com.twu.biblioteca.domain.User;

import java.util.ArrayList;
import java.util.List;

public class LibrarySection {

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

    public void getUserItemsList(User currentUser) {
        for(int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).isCheckedOut() && itemList.get(i).getBookUser().equals(currentUser)) {
                System.out.println(itemList.get(i).toString(i));
            }
        }
    }

    public String checkOutItem(int index, User currentUser) {
        Item item = itemList.get(index);
        item.setUser(currentUser);
        return(item.resultMessage());
    }

    public String returnItem(int bookIndex, User currentUser) {
        if(itemList.get(bookIndex).isCheckedOut() && itemList.get(bookIndex).getBookUser().equals(currentUser)) {
            itemList.get(bookIndex).returnItem();
            itemList.get(bookIndex).setUser(new User());
            return ("Thank you for returning the book");
        }
        else {
            return ("That is not a valid book to return.");
        }
    }
}
