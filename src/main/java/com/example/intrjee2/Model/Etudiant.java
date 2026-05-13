package com.example.intrjee2.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    private String nom;
    private String email;
    private int age;
}
