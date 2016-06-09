/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author alim.khan
 */
public class AddStudent {
    public static void main(String args[]){
        //Create SessionFactory Object
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student.class).buildSessionFactory();
        //Create Session
        Session session = factory.getCurrentSession();
        
        try{
            //Create student object
            System.out.println("Creating student object");
            student tempStudent = new student("Madhuram","Timalsina","madhuram.timalsina@email.com");
            
            //Start the transaction
            session.beginTransaction();
            
            //Saving data in Database
            System.out.println("Saving data");
            session.save(tempStudent);
            
            //Commit Transaction
            session.getTransaction().commit();
            System.out.println("Data Saved");
            
        }finally{
            factory.close();
        }
    }
}
