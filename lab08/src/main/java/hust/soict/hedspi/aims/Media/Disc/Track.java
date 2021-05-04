/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media.Disc;

/**
 *
 * @author Wind
 */
public class Track implements Playable, Comparable{
    private String title;
    private int length;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(){
        
    }
    
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
        allTrackList.addIntoList(this);
    }
    
    public static Track search(String title) {
        String[] tmp1 = title.split("\\s");
        for (Track item : allTrackList.allTracks) {
            String[] tmp2 = item.getTitle().split("\\s");
            int count = 0;
            for (String check2 : tmp2) {
                for (String check1 : tmp1) {
                    if(check1.equalsIgnoreCase(check2)) {
                        count++;
                        break;
                    }
                }
            }
            if (count == tmp2.length) {
                return item;
            }
        }
        System.out.println("Can't find item!");
        return null;
    }

    @Override
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength() + " min");
    }
    
    @Override
    public boolean equals(Object o){
      if(o instanceof Track){
        for (Track item : allTrackList.allTracks) {
            if (((Track) o).getLength() == item.getLength() && ((Track) o).getTitle().equalsIgnoreCase(item.getTitle())) {
                return true;
            }
        }
      }
      return false;
    }
    
    @Override
    public int compareTo(Object o) {
        if(o instanceof Track){
            return this.getTitle().compareToIgnoreCase(((Track) o).getTitle());
        } else return -1000;
    }
    
}
