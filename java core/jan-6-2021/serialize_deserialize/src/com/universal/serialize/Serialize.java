/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.serialize;

import com.universal.student.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author administrator
 */
public class Serialize {
    public static void main(String[] args) {
   
        try
        {
            Student s=new Student();
         FileOutputStream fos=new FileOutputStream("one.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
            System.out.println("process done");
       fos.close();
       oos.flush();
       oos.close();
        }
        
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
          
    }
}
