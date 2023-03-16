module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires java.mail;
    requires activation;

    opens com.client_email;
    opens com.client_email.controller;
    opens com.client_email.model;
}