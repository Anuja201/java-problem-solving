package day2.question;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("given number "+num);
		System.out.println("Binary :"+Integer.toBinaryString(num));
		System.out.println("Octal :"+Integer.toOctalString(num));
		System.out.println("Hexadecimal :"+Integer.toHexString(num));

	}

}
