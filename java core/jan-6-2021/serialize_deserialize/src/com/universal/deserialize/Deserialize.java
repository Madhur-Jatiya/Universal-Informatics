/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.deserialize;

import com.universal.student.Student;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author administrator
 */
public class Deserialize {
    public static void main(String arg[])
{
    try
    {
FileInputStream fis=new FileInputStream("one.txt");
ObjectInputStream ois=new ObjectInputStream(fis);

Student s=(Student)ois.readObject();

System.out.println("Roll no="+s.roll);
System.out.println("Name="+s.name);
        System.out.println("percentage="+s.per);
fis.close();
ois.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
}
}
