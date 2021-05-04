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
public class CDFactory implements ItemFactory{
    

    @Override
    public Media createItemFromConsole() {
        CompactDisc CD = new CompactDisc();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter CD ID : ");
        CD.setId(input.nextInt());
        input.nextLine();
        System.out.println("Enter CD title : ");
        CD.setTitle(input.nextLine());
        System.out.println("Enter CD category : ");
        CD.setCategory(input.nextLine());
        System.out.println("Enter CD cost : ");
        CD.setCost(input.nextFloat());
        input.nextLine();
        System.out.println("Enter CD director : ");
        CD.setDirector(input.nextLine());
        System.out.println("Enter CD artist : ");
        CD.setArtist(input.nextLine());
        System.out.println("Enter numbers of track : ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            input.nextLine();
            Track track = new Track();
            System.out.println("Enter track " + (i + 1) + " : ");
            System.out.println("Enter title of track : ");
            track.setTitle(input.nextLine());
            System.out.println("Enter length of track : ");
            track.setLength(input.nextInt());
            CD.addTrack(track);
        }
        
        return CD;
    }
}
