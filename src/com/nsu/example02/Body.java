package com.nsu.example02;

import java.util.Scanner;


public class Body {
	public static void main (String[]args )
	{
		System.out.println("������������:");
		Scanner  scanner = new Scanner(System.in);
		float h=scanner.nextInt();
		System.out.println("�������������:");
		float w=scanner.nextInt();
		float BMI;
		float H=h/100;
		BMI=w/(H*H);
		System.out.println("���BMI�ǣ�"+BMI);
			
	}
}
