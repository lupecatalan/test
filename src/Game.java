import java.util.*;


public class Game {
	
	public  static void main(String[] args)
	{
	
		Die d = new Die();
		
		// CupofDice c = new CupofDice();
		
		d.roll();
		
		System.out.println(d.toString());
	}
}
