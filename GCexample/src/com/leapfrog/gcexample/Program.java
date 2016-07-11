/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gcexample;

import com.leapfrog.gcexample.controller.StudentController;
import com.leapfrog.gcexample.dao.impl.StudentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new StudentController(new Scanner(System.in), new StudentDAOImpl()).process();

    }

}
