package com.ali.sundaypractice;
class Calculator
{
	public int add(int i, int j)
	{
		return i+j;
	}
}
class AdvCalc extends Calculator
{
	public int sub(int i, int j) {
		return i-j;
	}
}
public class Input {
	public static void main(String []args)
	{
		AdvCalc c1= new AdvCalc();
		int result=c1.add(6, 8);
		int result2=c1.sub(8, 9);
		System.out.println(result);
		System.out.println(result2);
		
	}		
			

}
