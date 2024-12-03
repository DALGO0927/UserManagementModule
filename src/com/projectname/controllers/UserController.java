/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projectname.controllers;

import com.projectname.dao.UserDAO;
import com.projectname.models.User;

public class UserController {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Insert a new user
        User newUser = new User();
        newUser.setName("John Doe");
        newUser.setEmail("john.doe@example.com");
        userDAO.insertUser(newUser);

        // Fetch and display all users
        userDAO.getAllUsers().forEach(System.out::println);
    }
}
