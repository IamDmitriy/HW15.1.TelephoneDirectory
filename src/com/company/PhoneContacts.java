package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneContacts {
    //    Map<String, List<Contact>> map = new HashMap<>();
    Map<String, List<Contact>> map = new HashMap<>();

    public void addGroup(String nameGroup) {
        map.put(nameGroup, new ArrayList<Contact>());

    }

    public void addContactInGroup(String nameGroup, Contact contact) {
        List<Contact> curGroup = map.get(nameGroup);
        curGroup.add(contact);
    }

    public void printContacts() {
        System.out.println("Группы в справочнике:");

        for (String group: map.keySet()) {
            System.out.println("- " + group + ":");

            List<Contact> curListContacts = map.get(group);

            for (Contact contact : curListContacts) {
                System.out.println("    "+ contact);
            }
        }
    }
}
