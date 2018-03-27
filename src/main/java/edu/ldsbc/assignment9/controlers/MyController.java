package edu.ldsbc.assignment9.controlers;

import edu.ldsbc.assignment9.models.Contact;
import edu.ldsbc.assignment9.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    MyService service;

    //home page
    @RequestMapping(value = "/robert", method = RequestMethod.GET)
    public String index(Model model)
    {
        List<Contact>  contacts = service.getContacts();
        model.addAttribute("names", contacts); //data on page
        return "index"; // index is the page name
    }

    @RequestMapping(value = "/contact/{id}/remove", method = RequestMethod.GET)
    public String removeContact(String id)
    {
     //
        return "redirect:/robert"; //redirect to homepage
    }

//     add new contact
    @RequestMapping(value = "/contact/new", method = RequestMethod.POST)
    public String addNewPost(@Valid Contact contact, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        // do work here
        service.addContact(contact);

        return "redirect:/robert"; //redirect to homepage
    }
}