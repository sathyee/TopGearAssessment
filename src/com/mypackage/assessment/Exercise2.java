package com.mypackage.assessment;

import com.mypackage.assessment.bean.Guitar;
import com.mypackage.assessment.bean.Piano;

public class Exercise2 implements Piano, Guitar {

	@Override
	public void play() {
		Guitar.super.play();
		Piano.super.play();
	}
	
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2();
		e2.play();
	}
	
}
