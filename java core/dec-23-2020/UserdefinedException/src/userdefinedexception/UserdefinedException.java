/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefinedexception;

import com.universal.checksugar.CheckSugar;
import com.universal.checksugar.HighSugar;
import com.universal.checksugar.LowSugar;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class UserdefinedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter sugar level=");
        int l=sc.nextInt();
        try
        {
        CheckSugar.check(l);
        }
        catch(HighSugar hs)
        {
            System.out.println("U have high sugar");  
        }
        catch(LowSugar ls)
        {
            System.out.println("U have low sugar"); 
        }
        finally
        {
            System.out.println("Sugar check krane k liye dhanyawad");
        }
    }
    
}
