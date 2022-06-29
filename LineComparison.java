import java.util.*;
public class LineComparison {
    public static void main(String[] args){
        Scanner pt=new Scanner(System.in);
        System.out.println("***** UC1:Length of line on Cartesian *****");
        System.out.println("Enter Point 1:");
        int x1=pt.nextInt();
        int y1= pt.nextInt();

        System.out.println("Enter Point 2:");
        int x2=pt.nextInt();
        int y2= pt.nextInt();

        double length= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The length of line is: "+length);
    }
}
