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

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getLegCount()
	{
		return legCount;
	}

	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}

	public int getEyeCount()
	{
		return eyeCount;
	}

	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}

	public boolean getHasNoses()
	{
		return hasNoses;
	}

	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}

	public int getArmCount()
	{
		return armCount;
	}

	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}

	public String toString()
	{
		String description1 = "My monster's name is " + name + ". He has " + legCount + " legs, " + eyeCount + " eyes, " + armCount + " arms, and ";
		String description2;
		if(hasNoses == true) {
			description2 = "does have nose(s).";
		}else {
			description2 = "does not have a nose.";
		}
		return description1 + description2;
	}
}
