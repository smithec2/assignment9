package edu.ldsbc.assignment9.services.impl;

import edu.ldsbc.assignment9.models.Contact;
import edu.ldsbc.assignment9.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String getName() {
        return "Dobby";
    }

    @Override
    public List<Contact> getNames() {
        List<Contact> nameList = new ArrayList<>();
        nameList.add(new Contact("lori","801-294-3553"));
        nameList.add(new Contact("jim","765-123-5555"));
        nameList.add(new Contact("scott", "956-343-1234"));

        return nameList;
    }
}
