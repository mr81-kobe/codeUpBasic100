package bais100;

import java.util.Scanner;

public class Main64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		
		
		int a =scan.nextInt();  
		int b =scan.nextInt(); 
		int c =scan.nextInt(); 
		System.out.println(a<b&&a<c ? a : b<a&&b<c ? b : c);
	}

}
