/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alim.khan
 */
@Entity
@Table(name="student")
public class student {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")    
    private String first_name;
    
    @Column(name="last_name")
    private String last_name;
    
    @Column(name="email")
    private String email;
    
    //Non-argument Constructor
    public student(){        
    }

    //Create constructor using fields
    public student(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }
    
    //Creating Getter and Setter for the column of table
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
      
    @Override
    public String toString() {
        return "student{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + '}';
    }    
}