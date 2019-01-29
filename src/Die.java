import java.util.Random;

public class Die {
	
	private int faceValue;
	
	public void roll() 
	{
		Random rand = new Random();
		
		faceValue = rand.nextInt(6) + 1;
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
	
	public String toString() 
	{
		return Integer.toString(faceValue);
	}
}
