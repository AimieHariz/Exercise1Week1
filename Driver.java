public class Driver
{
	public static void main(String [] arg)
	{
		//Fish = datatype
		//Fish nemo == int x;
		//Nemo = object 
		//Fish = class
		Fish nemo = new Fish(); 
		nemo.Swim();

		
		// nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();
	
		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(150);
		fiery.Eat();

		// Fish dory = new Fish(); // another object
		// dory.Swim();

		// // dory.color = "yellow"; 
		// dory.SetColor("yellow");
		// dory.Swim();

		// Aquarium fancyAquarium = new Aquarium();
		// fancyAquarium.fillFish();
	}
}