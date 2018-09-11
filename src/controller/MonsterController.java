package controller;

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
	}
}
