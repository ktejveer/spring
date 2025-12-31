package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(value = "/saveMsg")
    public boolean saveMsg(@RequestBody Contact contact){
        boolean isSuccess = false;
        isSuccess = contactService.saveMessageDetails(contact);
        return isSuccess;
    }
}
