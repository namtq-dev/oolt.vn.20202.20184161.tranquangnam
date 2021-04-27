/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.aims.Media;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wind
 */
public class allMediaList {
    public static List<Media> allMedia = new ArrayList<>();
    
    public static void addIntoList(Media media){
        allMedia.add(media);
    }
}
