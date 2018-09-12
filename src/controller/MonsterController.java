package controller;

import java.util.Scanner;

import model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster myMonster;

	public MonsterController()
	{
		myMonster = new MarshmallowMonster("bobby", 3.5, 3, true, 1);
	}

	public void start()
	{
		System.out.println(myMonster);
		myMonster.setArmCount(100);
		System.out.println("My monster has " + myMonster.getArmCount() + " arms.");
		System.out.println("Alright, lets have YOU make a monster!");
		Scanner in = new Scanner(System.in);
		System.out.println("What is your monster's name?");
		String name = in.nextLine();
		System.out.println("How many legs does your monster have (use a double)?");
		double legs = in.nextDouble();
		System.out.println("How many eyes does your monster have (use an int)?");
		int eyes = in.nextInt();
		System.out.println("Does your monster have noses (yes/no)?");
		String noses = in.next();
		noses.toLowerCase();
		boolean hasNoses;
		if(noses.equals("yes")) {
			hasNoses = true;
		}else {
			hasNoses = false;
		}
		System.out.println("How many arms does your monster have (use an int)?");
		int arms = in.nextInt();
		MarshmallowMonster userMonster = new MarshmallowMonster(name, legs, eyes, hasNoses, arms);
		System.out.println(userMonster);
		in.close();
	}
}
