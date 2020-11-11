package controller;

import javafx.fxml.FXML;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controller {
    private EntityManager em;

    @FXML
    public void initialize() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPU");
        em = factory.createEntityManager();
    }

}
