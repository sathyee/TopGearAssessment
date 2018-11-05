package com.mypackage.assessment.bean;

public interface Guitar {
	
	default void play() {
		System.out.println("Playing Guitar... ");
	}

}
