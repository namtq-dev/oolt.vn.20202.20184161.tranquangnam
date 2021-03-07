import java.util.Scanner;
public class daysOfMonth {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao nam: ");
            int year = sc.nextInt();
            System.out.println("Nhap vao thang: ");
            int month = sc.nextInt();

            verify temp = new verify();
            temp.setYear(year);
            temp.setMonth(month);

            while (temp.verifyMonth() == false){
                System.out.println("Moi nhap lai thang: ");
                month = sc.nextInt();
                temp.setMonth(month);
            }

            if ((temp.isLeapYear() == true) && (month == 2)){
                System.out.println("Thang " + month + " nam " + year + " co 29 ngay");
            } else if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                System.out.println("Thang " + month + " nam " + year + " co 31 ngay");
            } else if((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                System.out.println("Thang " + month + " nam " + year + " co 30 ngay");
            } else System.out.println("Thang " + month + " nam " + year + " co 28 ngay");

        }
}

class verify{

    private int month;
    private int year;

    public void setMonth(int x) {
        month = x;
    }

    public void setYear(int x) {
        year = x;
    }

    public boolean verifyMonth () {
        if ((month >= 1) && (month <=12))
            return true;
        return false;
    }

    public boolean isLeapYear () {
        if (year%4 == 0) {
            if ((year%100 == 0) && (year%400 != 0))
                return false;
            return true;
        } else return false;
    }

}
