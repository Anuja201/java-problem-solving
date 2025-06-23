package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x point1 :");
        int x1= sc.nextInt();
        System.out.println("Enter the x point2 :");
        int x2= sc.nextInt();
        System.out.println("Enter the y point1 :");
        int y1= sc.nextInt();
        System.out.println("Enter the y point2 :");
        int y2= sc.nextInt();
        
        Point2D p1=new Point2D(x1,y1);
        Point2D p2=new Point2D(x2,y2);
        
        System.out.println("point 1:" +p1.getDetail());
        System.out.println("point 2:"+p2.getDetail());
        
        if(p1.isEqual(p2)) {
        	System.out.println("it is located same");
        }else {
        	double distance=p1.calculateDistances(p2);
        }
        System.out.println("Distance between p1 and p2 is " +distance);
	}

}
