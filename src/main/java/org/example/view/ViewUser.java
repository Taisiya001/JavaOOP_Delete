package org.example.view;

import org.example.concrollers.UserController;
import org.example.model.User;

import java.util.Scanner;

public class ViewUser {
    private UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while(true) {
            String command = this.prompt("Введите команду: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) {
                return;
            }

            switch (com) {
                case CREATE:
                    String firstName = this.prompt("Имя: ");
                    String lastName = this.prompt("Фамилия: ");
                    String phone = this.prompt("Номер телефона: ");
                    this.userController.saveUser(new User(firstName, lastName, phone));
                    break;
                //case READ:
                //    String id = this.prompt("Идентификатор пользователя: ");
//
                //    try {
                //        User user = this.userController.readUser(id);
                //        System.out.println(user);
                //    } catch (Exception var8) {
                //        throw new RuntimeException(var8);
                //    }
                //    break;
                case LIST:
                    userController.readUsers().forEach(System.out::println);
                    break;
                case DELETE:
                    String id = this.prompt("Идентификатор пользователя: ");
                    try{
                        this.userController.deleteUser(id);
                    }catch (Exception e){
                        throw new RuntimeException(e);
                    }
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}