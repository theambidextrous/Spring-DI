package dev4money.classes;

import dev4money.interfaces.Activity;

public class Dig implements Activity{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Start digging now");
	}

	@Override
	public void Continue() {
		// TODO Auto-generated method stub
		System.out.println("Continue digging ....");
	}

	@Override
	public void End() {
		// TODO Auto-generated method stub
		System.out.println("Stop digging now.... time is up");
	}

}
