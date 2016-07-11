/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gcexample.controller;

import com.leapfrog.gcexample.dao.StudentDAO;
import com.leapfrog.gcexample.etity.Student;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class StudentController {

    private Scanner input;
    private StudentDAO stdDAO;

    public StudentController(Scanner input, StudentDAO stdDAO) {
        this.input = input;
        this.stdDAO = stdDAO;
    }

    public void menu() {
        System.out.println("Please choose the operation");
        System.out.println("1.Add student");
        System.out.println("2.Show all Students");
        System.out.println("3.Delete Student");
        System.out.println("4.Search by ID");
        System.out.println("5.Exit");
        System.out.print("Choose the number[1-5]:");
    }

    public void add() {
        while (true) {
            Student std = new Student();
            System.out.print("Enter ID:");
            std.setId(input.nextInt());
            System.out.print("First name:");
            std.setFirstname(input.next());
            System.out.print("Lat name:");
            std.setLastname(input.next());
            System.out.print("Email:");
            std.setEmail(input.next());
            System.out.print("Contact:");
            std.setContact(input.next());
            System.out.print("Status:");
            std.setStatus(input.nextBoolean());
            stdDAO.insert(std);
            System.out.println("Do you want to add more[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showall() {
        System.out.println("Listing all Names");
        for (Student s : stdDAO.getAll()) {
            System.out.println(s.toString());
        }
    }

    public void delete() {
        while (true) {
            System.out.print("Enter id to delete:");
            int id = input.nextInt();
            boolean result=stdDAO.delete(id);
            if(!result){
                System.out.println("Not found");
            }
            else{
                System.out.println("Deleted successfully.");
            }
            stdDAO.delete(id);
            System.out.println("Do you want to delete more[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void searchById() {
        while (true) {
            System.out.print("Enter id to search:");
            int sId = input.nextInt();
            Student st = stdDAO.getByID(sId);
            if (st != null) {
                System.out.println(st.toString());
            } else {
                System.out.println("Student not found");
            }
            System.out.println("Do you want to search more[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
    
    public void process(){
         while (true) {

           menu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                   add();
                    break;
                case 2:
                   showall();
                    break;
                case 3:
                   delete();
                    break;
                case 4:
                    searchById();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }
    }
}
