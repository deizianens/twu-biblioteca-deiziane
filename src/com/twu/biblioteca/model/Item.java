package com.twu.biblioteca.model;

public abstract class Item {
    private String itemName;
    private String itemYear;
    private boolean checkedOut;

    public Item(String itemName, String itemYear, boolean checkedOut){
        this.itemName = itemName;
        this.itemYear = itemYear;
        this.checkedOut = checkedOut;
    }

    public String getItemName() {
        return itemName;
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

    public void returnItem() {
        this.checkedOut = false;
    }

    public abstract String toString(int i);

    public abstract String resultMessage();
}
