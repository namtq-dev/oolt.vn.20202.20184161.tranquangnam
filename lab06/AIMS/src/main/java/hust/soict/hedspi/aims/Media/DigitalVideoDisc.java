/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media;

/**
 *
 * @author Wind
 */
public class DigitalVideoDisc extends Media{
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title) {
        super(title);
        allMediaList.addIntoList(this);
    }

    public DigitalVideoDisc(String title, String category) {
        super(title, category);
        allMediaList.addIntoList(this);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        allMediaList.addIntoList(this);
    }

    public DigitalVideoDisc(String title, String category, String director) {
        super(title, category);
        this.director = director;
        allMediaList.addIntoList(this);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(title, category, cost, id);
        allMediaList.addIntoList(this);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(title, category, cost, id);
        this.director = director;
        this.length = length;
        allMediaList.addIntoList(this);
    }

    @Override
    public String showInfo() {
        return "DVD: " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getCost();
    }
     
}
