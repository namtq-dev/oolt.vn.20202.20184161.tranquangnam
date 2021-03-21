public class myDate {
    private String dayName;
    private String monthName;
    private String yearName;
    private int dayInt;
    private int monthInt;
    private int yearInt;
    private String check;
    
    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public int getDayInt() {
        return dayInt;
    }

    public int getMonthInt() {
        return monthInt;
    }

    public int getYearInt() {
        return yearInt;
    }

    
    public myDate(String dayName, String monthName, String yearName) {
        this.dayName = dayName;
        this.monthName = monthName;
        this.yearName = yearName;
        String[] days = {"0","first","second","third","fourth","fifth","sixth","seventh","eighth",
            "ninth","tenth","eleventh","twelfth",
            "thirteenth","fourteenth","fifteenth","sixteenth","seventeenth","eighteenth","nineteenth",
            "twentieth","twentyfirst","twentysecond","twentythird","twentyfourth","twentyfifth","twentysixth",
            "twentyseventh","twentyeighth","twentyninth","thirtieth","thirtyfirst"};
        String[] months = {
            "0","January","February","March","April","May","June","July","August","September",
            "October","November","December"};
        String[] yearsFirst2Nums = {"twenty","twentyone"};
        String[] yearsSecond2Nums = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
            "seventeen","eighteen","ninteen","twenty","twentyone"};
        for (int i = 0; i < days.length; i++) {
            if (dayName.equals(days[i])) {
                dayInt = i;
                switch(dayInt%10){
                    case 1: check = "st"; break;
                    case 2: check = "nd"; break;
                    case 3: check = "rd"; break;
                    default: check = "th"; break;
                }
            }
        }   
        
        for (int i = 0; i < months.length; i++) {
            if (monthName.equals(months[i])) {
                monthInt = i;
            }
        }
        
        for (int i = 0; i < yearsFirst2Nums.length; i++) {
            for (int j = 0; j < yearsSecond2Nums.length; j++) {
                if (yearName.equals(yearsFirst2Nums[i] + " " + yearsSecond2Nums[j])) {
                    yearInt = (i+20)*100 + (j+10);
                }
            }
        }
    }
    
    public void print1() {
        System.out.println(monthName + " " + dayInt + check + " " + yearInt);
    }
    
    public void print2() {
        System.out.println(yearInt + "-" + monthInt + "-" +dayInt);
    }
}