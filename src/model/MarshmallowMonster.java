package model;

public class MarshmallowMonster
{
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;

	public MarshmallowMonster()
	{

	}

	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}

	public String toString()
	{
		String description = "My monster's name is " + name
				+ ". He has " + legCount + " legs, "
				+ eyeCount + " eyes, and "
				+ armCount + " arms.";
		return description;
	}
}
