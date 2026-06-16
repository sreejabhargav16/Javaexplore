package scannermeth;

import java.util.Scanner;

public class Scanclas {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name is:");
		String name=sc.next();
		System.out.println("Age is");
		int age=sc.nextInt();
		System.out.println("Name is::"+name);
		System.out.println("Age is::"+age);
	}

}
