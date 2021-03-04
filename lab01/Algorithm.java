import javax.swing.JOptionPane;

class Maths{
    public static double sum(double x, double y){
        return x + y;
    }
    public static double diff(double x, double y){
        return x - y;
    }
    public static double product(double x, double y){
        return x * y;
    }
    public static double quotient(double x, double y){
        return x / y;
    }
}
public class Algorithm {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2); 
        JOptionPane.showMessageDialog(null, Maths.sum(num1, num2), "Sum of the two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, Maths.diff(num1, num2), "Diff of the two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, Maths.product(num1, num2), "Product of the two numbers", JOptionPane.INFORMATION_MESSAGE);
        if(num2 == 0){
            JOptionPane.showMessageDialog(null, "Quotient is wrong!", "Quotient of the two numbers", JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, Maths.quotient(num1, num2), "Quotient of the two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}



