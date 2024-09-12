/* Robert Farino
   May 15, 2024
   Assignment Two
   Pet BAG Dog Class */


package petBag;

// This is where the class is written. The class contains information about a dog.
public class Dog {
	
	int dogSpaceNumber;
	double dogWeight;
	boolean grooming;

	// This is our constructor which sets Dog Space Number, Dog Weight, and Grooming.
	public Dog()
	{
		dogSpaceNumber = 0;
		dogWeight = 0;
		grooming = false;
	}
	
	// This method returns the Dog Space Number.
	public int getDogSpaceNumber()
	{
		return dogSpaceNumber;
	}
	
	// This method sets the Dog Space Number with the number provided as an argument.
	public void setDogSpaceNumber(int spaceNumber)
	{
		 dogSpaceNumber = spaceNumber; 
	}
	
	// This method returns the Dog Weight.
	public double getDogWeight()
	{
		return dogWeight;
	}
	
	// This method sets the Dog Weight with the number provided as an argument.
	public void setDogWeight(double weight)
	{
		dogWeight = weight;
	}
	
	// This method returns true if Dog Grooming is requested or false if not requested.
	public boolean getGrooming()
	{
		return grooming;
	}
	
	// This method sets the Dog Grooming flag with true if requested or false if not requested.
	public void setGrooming(boolean groom)
	{
		grooming = groom;
	}
}
