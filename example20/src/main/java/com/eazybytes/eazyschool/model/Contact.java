package com.eazybytes.eazyschool.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contact {
    private String name;
    private String mobileNumber;
    private String email;
    private String subject;
    private String message;
}
