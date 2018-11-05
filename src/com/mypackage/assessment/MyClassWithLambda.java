package com.mypackage.assessment;

import com.mypackage.assessment.bean.WordCount;

public class MyClassWithLambda {
	
	private static int totalCount = 0;

	public int getCount() {
		return totalCount;
	}
	
	public static void main(String[] args) {
		System.out.println("MyClassWithLambda...");
		
		WordCount wordCount = (int ct) -> totalCount += ct; 
		
		MyClassWithLambda myClass = new MyClassWithLambda();
		
		wordCount.count(4);
		wordCount.count(5);
		wordCount.count(2);
		wordCount.count(6);
		wordCount.count(3);
		
		System.out.println("totalCount : " + totalCount);
	}
}
