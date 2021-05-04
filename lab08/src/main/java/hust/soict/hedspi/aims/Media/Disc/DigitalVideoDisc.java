/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media.Disc;

import hust.soict.hedspi.aims.Media.Book;
import hust.soict.hedspi.aims.Media.Disc.Disc;
import hust.soict.hedspi.aims.Media.allMediaList;

/**
 *
 * @author Wind
 */
public class DigitalVideoDisc extends Disc implements Playable{
      
    public DigitalVideoDisc(){
        super();
    }
    
    public DigitalVideoDisc(int id, String title, String category, String director, float cost,  int length) {
        super(id, title, category, cost, director, length);
    }     

    @Override
    public String showInfo() {
        return "DVD ID: " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getCost();
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + super.getTitle());
        System.out.println("DVD length: " + super.getLength());
    }
  
    @Override
    public int compareTo(Object o) {
        if(o instanceof DigitalVideoDisc) {
            if(this.getCost() > ((DigitalVideoDisc) o).getCost()) {
                return (int) (this.getCost() - ((DigitalVideoDisc) o).getCost());
            }
            else return this.getTitle().compareToIgnoreCase(((DigitalVideoDisc) o).getTitle());
        } else return -1000;
    }
}
