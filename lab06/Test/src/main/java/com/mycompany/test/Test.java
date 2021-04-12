/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

/**
 *
 * @author Wind
 */
public class Test {
    public static void main(String[] args) {
        String s = "The    Lion King";
        String[] a = s.split(" ");
        System.out.println(a.length);
        for(String i : a) {
            System.out.println(i);
        }
    }
}
