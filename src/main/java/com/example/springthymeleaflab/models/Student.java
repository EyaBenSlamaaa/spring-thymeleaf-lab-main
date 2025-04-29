package com.example.springthymeleaflab.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Student {

    // Validation pour le nom
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private final String name;

    // Validation pour l'email
    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private final String email;

    // Validation pour la spécialité
    @NotBlank(message = "Major is required")
    private final String major;

    // Constructeur par défaut nécessaire pour la sérialisation/deserialization (exemple : Spring)
    public Student() {
        this.name = "";
        this.email = "";
        this.major = "";
    }

    // Constructeur pour initialisation des champs
    public Student(String name, String email, String major) {
        this.name = name;
        this.email = email;
        this.major = major;
    }

    // Getters uniquement, car les champs sont immuables
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }

    // Méthode toString pour déboguer ou afficher les informations
    @Override
    public String toString() {
        return "Student {" +
                "Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Major='" + major + '\'' +
                '}';
    }
}