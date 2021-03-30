package hust.soict.hedspi.aims.utils;


import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wind
 */
public class DateUtils {
//    public void compareDate(myDate date1, myDate date2) {
//        if ((date1.getYearInt() == date2.getYearInt()) &&
//            (date1.getMonthInt() == date2.getMonthInt()) &&              
//            (date1.getDayInt()== date2.getDayInt())) {
//            System.out.println("Two dates are equal!");
//        } else System.out.println("Two dates are not equal!");
//    }
    
    public static int compareDate(myDate date1, myDate date2) {
        if (date1.getYearInt() > date2.getYearInt()) return 1;
        else if (date1.getYearInt() < date2.getYearInt()) return 0;
        else {
            if (date1.getMonthInt() > date2.getMonthInt()) return 1;
            else if (date1.getMonthInt() < date2.getMonthInt()) return 0;
            else {
                if (date1.getDayInt() > date2.getDayInt()) return 1;
                else if (date1.getDayInt() < date2.getDayInt()) return 0;
                else return -1;
            }
        }
    }
    
    public static void sortDate(ArrayList<myDate> dateList) {
        for (int i = 1; i < dateList.size(); i++) {
            if (compareDate(dateList.get(i-1), dateList.get(i)) == 1) {
                Collections.swap(dateList, i-1, i);
                if (i > 1) i -= 2;
            }
        }
        for (int i = 0; i < dateList.size(); i++) {
            dateList.get(i).toIntDate();
        }
    }
}
