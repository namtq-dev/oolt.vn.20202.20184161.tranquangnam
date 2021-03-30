/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.otherProjects;

/**
 *
 * @author Wind
 */
public class GarbageCreator {
    public static void main(String[] args) {
    int MAX_GARBAGE = 1000;
//    public void createGarbage(){
        String s = "";
        for (int i = 0; i < MAX_GARBAGE; i++) {
            s += Math.random();
        }
//    }   
    }
}
