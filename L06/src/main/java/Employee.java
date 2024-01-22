package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
}