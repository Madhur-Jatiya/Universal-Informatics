import java.util.Scanner;

class Gun
 {
    void gun()
        {
            System.out.println("U select gun");
        }
 }

class Boomb
 {
    void boomb()
        {
            System.out.println("U select Boomb");
        }
 }

class MachineGun
 {
    void machinegun()
        {
            System.out.println("U select MachineGunun");
        }
 }

class Madhur
 {
    public static void main(String[] args) 
    {
        
            Scanner sc=new Scanner(System.in);
       do
        {           
            System.out.print("Enter 1 for Gun,2 for Boomb and 3 for MachineGun=");
            int x = sc.nextInt();
    
            if (x==1)
                {
                    Gun g=new Gun();
                    g.gun();
                }

            else if (x==2)
                {
                    Boomb b=new Boomb();
                    b.boomb();
                }

            else if (x==3)
                {
                    MachineGun mg=new MachineGun();
                    mg.machinegun();
                }
                
            else
                {
                    System.out.println("Plz enter btwn 1,2 and 3");
                }        
        
                    System.out.print("Enter 1 for go back=");
                    int y=sc.nextInt();
        }  
                  
        while(y==1);        
    }
 }