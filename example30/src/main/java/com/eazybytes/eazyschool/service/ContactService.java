package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Slf4j
@Service
public class ContactService {

    public boolean saveMessageDetails(Contact contact){
        log.info("saveMessageDetails : method started : ContactService");
        log.info(contact.toString());
        log.info("saveMessageDetails : method end : ContactService");
        return true;
    }
}
