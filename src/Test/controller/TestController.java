package Test.controller;

import java.util.Scanner;

/**
 * @author abur9000
 */
public class TestController
{
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.next();
		System.out.println("Oh cool, you like " + answer);
	}
}
