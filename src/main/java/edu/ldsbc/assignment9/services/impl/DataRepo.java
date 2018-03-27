package edu.ldsbc.assignment9.services.impl;

import edu.ldsbc.assignment9.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepo {

    private List<Contact> contactList = new ArrayList<>();

    private static DataRepo ourInstance = new DataRepo();

    public static DataRepo getInstance() {
        return ourInstance;
    }

    private DataRepo() {
        contactList.add(new Contact("lori","801-294-3553", "provo"));
        contactList.add(new Contact("jim","765-123-5555", "elko"));
        contactList.add(new Contact("scott", "956-343-1234", "bountiful"));
    }

    public List<Contact> getContactList() {
        return contactList;
    }
}
