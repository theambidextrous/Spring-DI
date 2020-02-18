package dev4money.classes;

import dev4money.interfaces.Activity;

public class Play implements Activity {

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Start playing now");
	}

	@Override
	public void Continue() {
		// TODO Auto-generated method stub
		System.out.println("Continue Playing...");
	}

	@Override
	public void End() {
		// TODO Auto-generated method stub
		System.out.println("Stop playing now... time is up!");
	}

}
