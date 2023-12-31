/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.checksugar;

/**
 *
 * @author pc
 */
public class CheckSugar {
    public static void check(int level)throws HighSugar,LowSugar
    {
      if(level<60)
      {
          LowSugar ls=new LowSugar();
          throw ls;
      }
      else if(level>120)
      {
          HighSugar hs=new HighSugar();
          throw hs;
      }
      else
      {
          System.out.println("U have normal sugar level");
      }
    }
}
