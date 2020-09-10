package br.com.unicesumar;

import br.com.unicesumar.models.User;
import br.com.unicesumar.service.UserService;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("1 - Cadastrar usuario");
        System.out.println("2 - Listar usuários");
        System.out.println("0 - Sair");

        int menu;

        int id = 0;

        do {
            menu = read.nextInt();

            switch (menu) {
                case 1:

                    System.out.println("Informe o nome do usuario");
                    String name = read.nextLine();
                    read.nextLine();

                    System.out.println("Informe o email do usuario");
                    String email = read.nextLine();

                    System.out.println("Informe o cargo do usuario");
                    String cargo = read.nextLine();

                    User user = new User(id, name, email, cargo);
                    UserService.create(user);

                    id++;

                    break;

                case 2:
                    UserService.getUsers().forEach(System.out::println);
                    break;

                default:
                    if(menu == 0)
                        System.out.println("Saindo....");
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar usuario");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Sair");

        } while (menu != 0);

    }
}
