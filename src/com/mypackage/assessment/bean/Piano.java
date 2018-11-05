package com.mypackage.assessment.bean;

public interface Piano {
	
	default void play() {
		System.out.println("Playing Piano... ");
	}

}
