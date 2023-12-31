/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universal.main;

import com.universal.interface1.I;
import com.universal.reference.Foo;

/**
 *
 * @author pc
 */
public class Test {
    public static void main(String[] args) {
        Foo f=new Foo();
        
        I i=f::met;
       i.m(); 
    }
 
}
