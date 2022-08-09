package org.ictkerala.assignment;

public class simpleinterest {
	double sicalc(int principle,int year,double rate)
		{
		double sinterest;
		sinterest=principle*year*rate/100;
		System.out.println(sinterest);
		return sinterest;
		}
	
	
	void cicalc(int principle,int year, double rate)
		{
		double cinterest;
		cinterest=principle*(1+rate/100);
		System.out.println(cinterest);
		
		}
	
	double pericalc(double l,double b)
	{
		double perimeter;
		perimeter=2*(l+b);
		System.out.println(perimeter);
		return perimeter;
	}
	
}
