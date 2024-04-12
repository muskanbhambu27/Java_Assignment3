package Patternn;

import java.util.Scanner;
public class Prod {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		float rate,amount,dis,disamount;
		int n;
		String name;
		System.out.println("Enter Product Name,Rate and Quantity");
		name = sc.next();
		rate = sc.nextFloat();
		n = sc.nextInt();
		amount = rate*n;
		dis = (amount*10)/100;
		disamount = amount - dis;
		System.out.println("Amount= " +amount);
		System.out.println("Discount= " +dis);
		System.out.println("Final Amount= " +disamount);
	}
}