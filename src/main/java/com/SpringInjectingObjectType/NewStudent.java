package com.SpringInjectingObjectType;

public class NewStudent {

//	this is loose coupling
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void cheatexam() {
		cheat.cheatmethod();
	}

}
