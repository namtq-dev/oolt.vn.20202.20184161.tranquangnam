/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media.Disc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wind
 */
public class allTrackList {
    public static List<Track> allTracks = new ArrayList<>();
    
    public static void addIntoList(Track track){
        allTracks.add(track);
    }
}
