module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.client_email;
    //opens com.client_email.view;
    opens com.client_email.controller;
}