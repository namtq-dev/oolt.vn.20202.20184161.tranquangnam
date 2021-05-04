/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media.Disc;

import hust.soict.hedspi.aims.Media.ItemFactory;
import hust.soict.hedspi.aims.Media.Media;
import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class DVDFactory implements ItemFactory{

    @Override
    public Media createItemFromConsole() {
        DigitalVideoDisc DVD = new DigitalVideoDisc();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter DVD ID : ");
        DVD.setId(input.nextInt());
        input.nextLine();
        System.out.println("Enter DVD title : ");
        DVD.setTitle(input.nextLine());
        System.out.println("Enter DVD category : ");
        DVD.setCategory(input.nextLine());
        System.out.println("Enter DVD cost : ");
        DVD.setCost(input.nextFloat());
        System.out.println("Enter DVD length : ");
        DVD.setLength(input.nextInt());
        input.nextLine();
        System.out.println("Enter DVD director : ");
        DVD.setDirector(input.nextLine());
        
        return DVD;
    }
}
    
