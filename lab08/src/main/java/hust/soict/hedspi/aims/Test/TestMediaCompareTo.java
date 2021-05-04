/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Test;

import hust.soict.hedspi.aims.Media.Disc.CompactDisc;
import hust.soict.hedspi.aims.Media.Disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.Media.Disc.Track;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Wind
 */
public class TestMediaCompareTo {
    public static void main(String[] args) {
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 19.95f, 87);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 24.95f, 97);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", "Disney", 18.98f, 110);
//        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4, "Blaxin", "Animal", " Walt Disney", 18.99f, 110);
     
        Collection collection = new ArrayList();
//        collection.add(dvd1);
//        collection.add(dvd2);
//        collection.add(dvd3);
//        collection.add(dvd4);

        //unsorted order
//        Iterator iterator = collection.iterator();
//        System.out.println("----------------------------------------------");
//        System.out.println("The DVDs currently in the order are: ");
//
//        while(iterator.hasNext()){
//            DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
//            System.out.println(dvd.getTitle());
//        }
//        
//        //sorted order
//        Collections.sort((List)collection);
//        iterator = collection.iterator();
//        System.out.println("----------------------------------------------");
//        System.out.println("The DVDs in sorted order are: ");
//        while(iterator.hasNext()){
//            DigitalVideoDisc dvd = (DigitalVideoDisc)iterator.next();
//            System.out.println(dvd.showInfo());
//        }
//        System.out.println("----------------------------------------------");
        
        Track track1 = new Track("Happy new year", 3);
        Track track2 = new Track("Xuan nay con khong ve", 4);
        Track track3 = new Track("Doraemon BGM", 2);
        Track track4 = new Track("Bad guy", 4);
        Track track5 = new Track("Good guy", 6);

        CompactDisc cd1 = new CompactDisc(7, "Nhac nam moi", "Nhac pop", "Hong Duc", "Duc", 100);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.addTrack(track5);
        
        CompactDisc cd2 = new CompactDisc(8, "VPop", "Nhac viet", "Cong Ly", "MTP", 180);
        cd2.addTrack(track4);
        
        CompactDisc cd3 = new CompactDisc(9, "CPop", "Nhac trung", "SNSD", "Taylor", 90);
        cd3.addTrack(track3);
        cd3.addTrack(track1);
        
        CompactDisc cd4 = new CompactDisc(10, "KPop", "Nhac han", "Chau Nhuan Phat", "Bibi", 10);
        
        collection.add(cd1);
        collection.add(cd2);
        collection.add(cd3);
        collection.add(cd4);
        
         //unsorted order
        Iterator iterator = collection.iterator();
        System.out.println("----------------------------------------------");
        System.out.println("The CDs currently in the order are: ");

        while(iterator.hasNext()){
            CompactDisc cd = (CompactDisc)iterator.next();
            System.out.println(cd.getTitle());
        }
        
        //sorted order
        Collections.sort((List)collection);
        iterator = collection.iterator();
        System.out.println("----------------------------------------------");
        System.out.println("The CDs in sorted order are: ");
        while(iterator.hasNext()){
            CompactDisc cd = (CompactDisc)iterator.next();
            System.out.println(cd.showInfo());
        }
        System.out.println("----------------------------------------------");
    }
    
}
