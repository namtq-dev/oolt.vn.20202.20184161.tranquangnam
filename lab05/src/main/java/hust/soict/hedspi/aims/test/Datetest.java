package hust.soict.hedspi.aims.test;


import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.DateUtils;
import hust.soict.hedspi.aims.utils.myDate;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wind
 */
public class Datetest {
    public static void main(String[] args) {
        myDate date1 = new myDate("thirtyfirst", "October", "twenty ten");
        myDate date2 = new myDate("thirtieth", "October", "twenty ten");
        myDate date3 = new myDate("first", "April", "twenty twenty");
        myDate date4 = new myDate("tenth", "February", "twenty twentyone");
        ArrayList<myDate> dateList = new ArrayList<>();
        dateList.add(date1);
        dateList.add(date2);
        dateList.add(date3);
        dateList.add(date4);
        date1.toIntDate();
        date2.toIntDate();
        date3.toIntDate();
        date4.toIntDate();
        System.out.println("After sort: ");
        DateUtils.sortDate(dateList);
    }
}
