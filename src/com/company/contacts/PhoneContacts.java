package com.company.contacts;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneContacts {
    private Map<String, List<Contact>> map = new HashMap<>();

    public void addGroup(String nameGroup) {
        map.put(nameGroup, new LinkedList<Contact>());
    }

    public void addContact(String nameGroup, Contact contact) {
        List<Contact> curGroup = map.get(nameGroup);
        curGroup.add(contact);
    }

    public void printContacts() {
        System.out.println("Группы в справочнике:");

        for (String group : map.keySet()) {
            System.out.println("- " + group + ":");

            List<Contact> curListContacts = map.get(group);

            for (Contact contact : curListContacts) {
                System.out.println("    " + contact);
            }
        }
    }
}
