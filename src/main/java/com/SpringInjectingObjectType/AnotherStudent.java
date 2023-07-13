package com.SpringInjectingObjectType;

public class AnotherStudent {
	
	MathCheat cheat;

	
	
	

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void test() {
		cheat.mathExam();
	}
	
	

}
