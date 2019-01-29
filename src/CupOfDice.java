
public class CupOfDice {

	Die[] cup;
	
	public CupOfDice()
	{
		cup = new Die[5];
		
		for(int i = 0; i < 5; i++)
		{
			cup[i] = new Die();
		}
	}
	
	public void roll()
	{
		for(int i = 0; i < 5; i++)
		{
			cup[i].roll();
			getValue(cup[i]);
		}
	}
	
	public void getValue(Die die)
	{
		die.getFaceValue();
	}
}
