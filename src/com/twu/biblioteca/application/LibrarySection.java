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
            if(itemList.get(i).isCheckedOut() && itemList.get(i).getItemUser().equals(currentUser)) {
                System.out.println(itemList.get(i).toString(i));
            }
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
