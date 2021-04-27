/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media.Disc;

import hust.soict.hedspi.aims.Media.Disc.Track;
import hust.soict.hedspi.aims.Media.allMediaList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wind
 */
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    
    public CompactDisc(){
        allMediaList.addIntoList(this);
    }
    
    public CompactDisc(int id, String title, String category, String director, String artist, float cost) {
        super(id, title, category, cost, director);
        this.artist = artist;
    }   
    
    public void addTrack(Track trackItem) {
        if (tracks.contains(trackItem)) {
            System.out.println("Track existed!");
        } else {
            tracks.add(trackItem);
            System.out.println("Track added!");
        }
    }
    
    public void removeTrack(Track trackItem) {
        if (tracks.contains(trackItem)) {
            tracks.remove(trackItem);
            System.out.println("Track removed!");
        } else System.out.println("Can't find track!");
    }
    
    @Override
    public int getLength(){
        int totalLength = 0; 
        for (Track trackItem : tracks) {
            totalLength += trackItem.getLength();
        }
        return totalLength;
    }

    @Override
    public String showInfo() {
        return "CD ID: " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + this.getLength() + " - " + getCost();
    }
    
    @Override
    public void play() {
        System.out.println("Playing CD: " + super.getTitle());
        for (Track trackItem : tracks) {
            trackItem.play();
        }
    }
     
}
