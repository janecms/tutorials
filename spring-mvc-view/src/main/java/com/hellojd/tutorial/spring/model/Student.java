package com.hellojd.tutorial.spring.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "student")
public class Student {
   private int id;
   private String name;
   private String email;
   private LocalDate dob;
   
   // Getter and Setter methods
}