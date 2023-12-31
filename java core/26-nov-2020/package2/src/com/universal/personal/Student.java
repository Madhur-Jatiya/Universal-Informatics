package com.universal.personal;

import java.util.Scanner;

public class Student 
{
    private int roll;
    private  String name;
    
   public void getStudent()
   {
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter roll no=");
       roll=sc.nextInt();
       System.out.println("Enter name=");
       name=sc.next();
   }
  public void putStudent()
  {
      System.out.println("Roll no="+roll);
      System.out.println("Name="+name);
  }
    
}
