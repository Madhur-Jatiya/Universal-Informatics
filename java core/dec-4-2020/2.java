import java.util.Scanner; 
abstract class Game
{
abstract void weapon();
}

class Gun extends Game 
{
    void  weapon()
    {
       System.out.println("u have choosed gun");
    }
}

 class Bomb extends Game
 {
    void weapon()
     {
        System.out.println("u have choosed Bomb");
     }
  }

 class MachineGun extends Game
 {
   void weapon()
    {
      System.out.println("u have choosed MachineGun");
    } 
  }
   
class Test
  {
      public static void main(String arg[]) 
        {
            int x; 
            Scanner sc=new Scanner(System.in);
 
            Game g=null; 
            System.out.println("Enter 1 for choose Gun,2 for choose bomb and 3 for choose machinegun=");
            x=sc.nextInt();

                  if(x==1)        
                  {                     
                  Gun gg;                    
                  g=new Gun();                    
                  }
                    
                  else
                  if(x==2) 
                    {                                          
                      Bomb b;
                      g=new Bomb(); 
                    }
                    
                    else 
                  if(x==3) 
                      {
                          MachineGun mg;    
                          g=new MachineGun();
                      }
                    
else
{
System.out.println("Pls choose b/w 1,2 and 3 only");
}  
 g.weapon(); 
      
}
      
}

