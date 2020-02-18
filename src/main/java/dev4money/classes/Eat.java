package dev4money.classes;

import dev4money.interfaces.Activity;

public class Eat implements Activity{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Start eating now");
	}

	@Override
	public void Continue() {
		// TODO Auto-generated method stub
		System.out.println("Continue eating... a few more minutes");
	}

	@Override
	public void End() {
		// TODO Auto-generated method stub
		System.out.println("Stop eating now......  time is up!");
	}

}
