package com.eazybytes.config;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.eazybytes.beans")
public class ProjectConfig {

}
