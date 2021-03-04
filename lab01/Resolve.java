class SecondDegree {

    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double x) {
        this.a = x;
    }

    public double getB() {
        return b;
    }

    public void setB(double y) {
        this.b = y;
    }

    public double getC() {
        return c;
    }

    public void setC(double z) {
        this.c = z;
    }
    
    public String solve() {
        double d = b*b - 4*a*c;
        String ans;
        if(d < 0) ans = "No result";
        else if(d == 0) ans = "Result is " + (-b)/(2*a);
        else ans = "Result is " + (-b + Math.sqrt(d))/(2*a) + " and " + (-b - Math.sqrt(d))/(2*a);
        return ans;
    }
}

class FirstDegree_OneVar {

    private double a, b;
    
    public double getA(){
        return a;
    }

    public void setA(double x){
        this.a = x;
    }

    public double getB(){
        return b;
    }

    public void setB(double y){
        this.b = y;
    }

    public String solve() {
        if(a == 0){
            return "No result";
        } else return "The result is " + -b/a;
    }
}

class FirstDegree_TwoVars {

    private double a1, b1, c1;
    private double a2, b2, c2;
    
    public double getA1(){
        return a1;
    }

    public void setA1(double x){
        this.a1 = x;
    }

    public double getB1(){
        return b1;
    }

    public void setB1(double y){
        this.b1 = y;
    }

    public double getC1(){
        return c1;
    }

    public void setC1(double x){
        this.c1 = x;
    }

    public double getA2(){
        return a2;
    }

    public void setA2(double y){
        this.a2 = y;
    }

    public double getB2(){
        return b2;
    }

    public void setB2(double y){
        this.b2 = y;
    }

    public double getC2(){
        return c2;
    }

    public void setC2(double y){
        this.c2 = y;
    }

    public String solve(){
        double D, D1, D2;
        D = a1*b2 - a2*b1;
        D1 = c1*b2 - c2*b1;
        D2 = a1*c2 - a2*c1;
        String ans;
        if(D == 0){
            if(D1 == D && D2 == D){
                return "Infinite results";
            } else return "No results";
        } else return ans = "The results are x = " + D1/D + ", y = " + D2/D;   
    }
}

public class Resolve{
    public static void main(String[] args) {
        
        FirstDegree_OneVar eq1 = new FirstDegree_OneVar();
        eq1.setA(5);
        eq1.setB(6);
        System.out.println(eq1.solve());

        FirstDegree_TwoVars eq2 = new FirstDegree_TwoVars();
        eq2.setA1(3);
        eq2.setB1(5);
        eq2.setC1(9);
        eq2.setA2(9);
        eq2.setB2(18);
        eq2.setC2(27);
        System.out.println(eq2.solve());

        SecondDegree eq3 = new SecondDegree();
        eq3.setA(1);
        eq3.setB(3);
        eq3.setC(2);
        System.out.println(eq3.solve());
    }
}