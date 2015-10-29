import java.util.ArrayList;

public class Runner
	{
	public static void main(String[] args)
		{
		 ArrayList<String> animals = new ArrayList<String>();
		 animals.add("cow");
		 animals.add("bat");
		 animals.add("penguin");
		 animals.add("robin");
		 for (String c : animals)
			 {
			  System.out.println(c + " says " + Animal.makesNoise());
			  System.out.println();
			 }
		}
	}
