package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneContacts phoneContacts = new PhoneContacts();

        phoneContacts.addGroup("Семья");
        phoneContacts.addGroup("Друзья");
        phoneContacts.addGroup("Коллеги");

        Contact[] contacts = new Contact[] {
                new Contact("Bill", "1"),
                new Contact("Jim", "2"),
                new Contact("Ed", "2"),
        };

        phoneContacts.addContactInGroup("Семья", contacts[0]);
        phoneContacts.addContactInGroup("Друзья", contacts[1]);
        phoneContacts.addContactInGroup("Коллеги", contacts[2]);

        System.out.println("Программа справочник");

        while (true) {
            System.out.println("Введите название группы контактов или введите 'next' для продолжения");

            String input = scanner.nextLine();

            if ("next".equals(input)) {
                break;
            }

            phoneContacts.addGroup(input);
        }

        while (true) {
            System.out.println("Введите наименование контакта или введите 'end' для выхода");

            String name = scanner.nextLine();

            if ("end".equals(name)) {
                break;
            }

            System.out.println("Введите номер контакта");

            String numberPhone  = scanner.nextLine();

            Contact curContact = new Contact(name, numberPhone);

            System.out.println("Укажите группы контакта через пробел");

            String[] groups = scanner.nextLine().split(" ");

            for (String group : groups) {
                phoneContacts.addContactInGroup(group, curContact);
            }

            System.out.println("Контакт успешно добавлен в группы!");
        }



        phoneContacts.printContacts();


    }
}
