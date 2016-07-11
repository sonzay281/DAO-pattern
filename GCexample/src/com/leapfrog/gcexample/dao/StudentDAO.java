/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gcexample.dao;

import com.leapfrog.gcexample.etity.Student;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface StudentDAO {

    boolean insert(Student student);

    ArrayList<Student> getAll();

    boolean delete(int Id);

    Student getByID(int Id);

}
