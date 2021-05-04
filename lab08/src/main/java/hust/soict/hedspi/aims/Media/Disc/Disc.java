/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media.Disc;

import hust.soict.hedspi.aims.Media.Media;
/**
 *
 * @author Wind
 */
public class Disc extends Media{
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
//    public Disc(String director, String title, String category, float cost, int id) {
//        super(title, category, cost, id);
//        this.director = director;
//    }
//
//    public Disc(int length, String title, String category, float cost, int id) {
//        super(title, category, cost, id);
//        this.length = length;
//    }
//
    
    public Disc(){
        super();
    }
    
    public Disc(int id, String title, String category, float cost, String director) {
        super(title, category, cost, id);
        this.director = director;
    }
    
    public Disc(int id, String title, String category, float cost, String director, int length) {
        super(title, category, cost, id);
        this.director = director;
        this.length = length;
    }
    
    @Override
    public String showInfo() {
        return "Disc: " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getCost();
    }

}
