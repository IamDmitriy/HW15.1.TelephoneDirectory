package com.company;

import com.company.contacts.Contact;
import com.company.contacts.PhoneContacts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneContacts phoneContacts = new PhoneContacts();

        phoneContacts.addGroup("Семья");
        phoneContacts.addGroup("Друзья");
        phoneContacts.addGroup("Коллеги");

        Contact[] contacts = new Contact[]{
                new Contact("Bill", "8-800-576-35-97"),
                new Contact("Abe", "8-800-576-35-84"),
                new Contact("Ed", "8-800-576-35-00"),
        };

        phoneContacts.addContact("Семья", contacts[0]);
        phoneContacts.addContact("Семья", contacts[1]);
        phoneContacts.addContact("Друзья", contacts[1]);
        phoneContacts.addContact("Друзья", contacts[2]);
        phoneContacts.addContact("Коллеги", contacts[2]);

        System.out.println("Программа справочник");

        while (true) {
            System.out.println("Введите название группы контактов или введите 'next', чтобы продолжить");

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

            String numberPhone = scanner.nextLine();

            Contact curContact = new Contact(name, numberPhone);

            System.out.println("Укажите группы контакта через пробел");

            String[] groups = scanner.nextLine().split(" ");

            for (String group : groups) {
                phoneContacts.addContact(group, curContact);
            }

            System.out.println("Контакт успешно добавлен в группы!");
        }

        phoneContacts.printContacts();
    }
}
