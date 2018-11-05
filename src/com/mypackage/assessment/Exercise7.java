package com.mypackage.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("");
		strList.add("Address");
		strList.add("Street");
		strList.add("City");
		strList.add("");
		strList.add("Zip");
		strList.add("State");
		strList.add("Country");
		
		int count = 0;
		for (String str : strList) {
			if(str.length() > 5) {
				count++;
			}
		}
		
		System.out.println("Number of string with length greater than 5 is " + count);
		
		List<String> empStrList = new ArrayList<String>();
		empStrList = strList
						.stream().filter(s -> s.equalsIgnoreCase(""))
						.collect(Collectors.toList());
		System.out.println("Empty String List : " + empStrList + " (Size: " + empStrList.size() + ")");
	}
}
