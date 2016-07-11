/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.gcexample.dao.impl;

import com.leapfrog.gcexample.dao.StudentDAO;
import com.leapfrog.gcexample.etity.Student;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public class StudentDAOImpl implements StudentDAO {

    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public boolean insert(Student student) {
        return studentList.add(student);
    }

    @Override
    public ArrayList<Student> getAll() {
        return studentList;
    }

    @Override
    public boolean delete(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student getByID(int Id) {
        for (Student s : studentList) {
            if (s.getId() == Id) {
                return s;
            }
        }
        return null;
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
