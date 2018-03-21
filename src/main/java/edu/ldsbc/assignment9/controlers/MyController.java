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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model)
    {
        List<Contact>  contacts = service.getNames();
        model.addAttribute("names", contacts); //data on page
        return "index"; // index is the page name
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewPost(@Valid Contact contact, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        // do work here ie. sort
        List<Contact>  contacts = service.getNames();
        model.addAttribute("names", contacts); //data on page
        return "index"; // index is the page name
    }
}