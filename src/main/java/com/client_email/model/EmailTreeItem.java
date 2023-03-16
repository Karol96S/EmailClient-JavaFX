package com.client_email.model;

import javafx.scene.control.TreeItem;

public class EmailTreeItem<String> extends TreeItem {

    private String name;

    public EmailTreeItem (String name) {
        super(name);
        this.name = name;
    }
}
