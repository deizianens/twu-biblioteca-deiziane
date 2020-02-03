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
        if(itemList.size() > 0) {
            for (int i = 0; i < itemList.size(); i++) {
                if (!itemList.get(i).isCheckedOut()) {
                    System.out.println(itemList.get(i).toString(i));
                }
            }
        }
        else {
            System.out.println("There aren't any items on this library");
        }
    }

    public void getUserItemsList(User currentUser) {
        if(itemList.size() > 0) {
            for (int i = 0; i < itemList.size(); i++) {
                if (itemList.get(i).isCheckedOut() && itemList.get(i).getItemUser().equals(currentUser)) {
                    System.out.println(itemList.get(i).toString(i));
                }
            }
        }
        else {
            System.out.println("There aren't any items to return");
        }
    }

    public String checkOutItem(int index, User currentUser) {
        Item item = itemList.get(index);
        item.setUser(currentUser);
        return(item.checkoutResultMessage());
    }

    public String returnItem(int index, User currentUser) {
        Item item = itemList.get(index);
        return(item.returnResultMessage(currentUser));
    }
}
