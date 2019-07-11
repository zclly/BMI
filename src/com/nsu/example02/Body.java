package com.nsu.example02;

import java.util.Scanner;


public class Body {
	public static void main (String[]args )
	{
		System.out.println("请输入你的身高:");
		Scanner  scanner = new Scanner(System.in);
		float h=scanner.nextInt();
		System.out.println("请输入你的体重:");
		float w=scanner.nextInt();
		float BMI;
		float H=h/100;
		BMI=w/(H*H);
		System.out.println("你的BMI是："+BMI);
			
	}
}
