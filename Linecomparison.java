import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args){
        Scanner pt=new Scanner(System.in);
        System.out.println("****** UC2:Check equality of two lines ******");
        System.out.println("The equation of a line is ax+by=c");
        System.out.println("Enter x1,y1,x2,y2 of line 1:");
        int x1=pt.nextInt();
        int y1=pt.nextInt();
        int x2=pt.nextInt();
        int y2=pt.nextInt();
        int b1=x2-x1;
        int a1=y2-y1;
        int c1=a1*x1+b1*y1;
        System.out.println("Equation of line 1 is:"+a1+"x+"+b1+"y="+c1);

        System.out.println("Enter x1,y1,x2,y2 of line 2:");
        int x12=pt.nextInt();
        int y12=pt.nextInt();
        int x22=pt.nextInt();
        int y22=pt.nextInt();
        int b12=x22-x12;
        int a12=y22-y12;
        int c12=a12*x12+b12*y12;
        System.out.println("Equation of line 2 is:"+a12+"x+"+b12+"y="+c12);

        if(Objects.equals(a1, a12) && Objects.equals(b1, b12)){
            System.out.println("Line 1 and 2 are equal");
        }
        else System.out.println("Line 1 and 2 are not equal");
    }
}

