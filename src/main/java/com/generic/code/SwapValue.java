package com.generic.code;

public class SwapValue {
	
	public void getSwap(int a, int b){
		System.out.println("Before Swapping : a,b =" +a+"," +b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping : a,b = " +a+ "," +b);
	}

}
