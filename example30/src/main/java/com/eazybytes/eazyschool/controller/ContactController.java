package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(value = "/saveMsg")
    public boolean saveMsg(@Valid @RequestBody Contact contact, Errors errors) {
        log.info("saveMsg : Method started : ContactController");
        if(errors.hasErrors()){
            log.error("Contact form validation failed due to : " + errors.toString());
            return false;
        }
        boolean isSuccess = false;
        isSuccess = contactService.saveMessageDetails(contact);
        log.info("saveMsg : Method end : ContactController");
        return isSuccess;
    }
}
