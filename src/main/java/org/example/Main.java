package org.example;

import org.example.concrollers.UserController;
import org.example.model.FileOperation;
import org.example.model.FileOperationImpl;
import org.example.model.Repository;
import org.example.model.RepositoryFile;
import org.example.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();

    }
}