package com.twu.biblioteca.domain;

public abstract class Item {
    private String itemName;
    private String itemYear;
    private boolean checkedOut;
    private User itemUser;

    public Item(String itemName, String itemYear, boolean checkedOut){
        this.itemName = itemName;
        this.itemYear = itemYear;
        this.checkedOut = checkedOut;
        this.itemUser = new User();
    }

    public String getItemName() {
        return itemName;
    }

    public User getItemUser() {
        return itemUser;
    }

    public String getItemYear() {
        return itemYear;
    }

    public boolean isCheckedOut() {
        return this.checkedOut;
    };

    public void checkItem() {
        this.checkedOut = true;
    }

    public void setUser(User user) {
        this.itemUser = user;
    }

    public void returnItem() {
        this.checkedOut = false;
    }

    public abstract String toString(int i);

    public abstract String checkoutResultMessage();
    public abstract String returnResultMessage(User currentUser);

}
