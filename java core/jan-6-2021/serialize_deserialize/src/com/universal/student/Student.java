/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.student;
import java.io.Serializable;
/**
 *
 * @author administrator
 */
public class Student implements Serializable
{
   public int roll;
   public String name;
    public transient float per;
    
    public Student()
    {
       roll=101;
       name="Ramlal";
       per=12.5f;
    }
    
    
}
