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
public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
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
    
}
