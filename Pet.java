package petBag;

/* This is where the pet class is written. The class contains information about a variety of 
   subjects relating to a pet, including pet type, age, spaces, days stay, and amount due.*/ 
public class Pet {

	String petType;
	String petName;
	int petAge;
	int dogSpaces;
	int catSpaces;
	double daysStay;
	double amountDue;

 /* This is our constructor which initializes values for petType, petName, petAge, dogSpaces
  * catSpaces, daysStay, and amountDue. */
	public Pet()
	{
		petType = "";
		petName = "";
		petAge = 0;
		dogSpaces = 0;
		catSpaces = 0;
		daysStay = 0;
		amountDue = 0;
	}
	
	// This method returns the Pet Type.
	public String getpetType()
	{
		return petType;
	}
	
	// This method sets the Pet Type with the type provided as an argument. 
	public void setpetType(String Type)
	{
		petType = Type;
	}
	
	// This method returns the Pet Name.
	public String getpetName()
	{
		return petName;
	}
	
	// This method sets the Pet Name with the name provided as an argument.
	public void setpetName(String Name)
	{
		petName = Name;
	}
	
	// This method returns the Pet Age.
	public int petAge()
	{
		return petAge;
	}
	
	// This method sets the Pet Age with the number provided as an argument. 
	public void setpetAge(int Age)
	{
		petAge = Age;
	}
	
	// This method returns the number of Dog Spaces.
	public int getdogSpaces()
	{
		return dogSpaces;
	}
	
	// This method sets the Dog Spaces with the number provided as an argument.
	public void setdogSpaces(int pupSpaces)
	{
		dogSpaces = pupSpaces;
	}
	
	// This method returns the number of Cat Spaces.
	public int getcatSpaces()
	{
		return catSpaces;
	}
	
	// This method sets the Cat Spaces with the number provided as an argument.
	public void setcatSpaces(int kittenSpaces)
	{
		catSpaces = kittenSpaces;
	}
	
	// This method returns the Days Stay.
	public double getdaysStay()
	{
		return daysStay;
	}
	
	// This method sets the Days Stay with the number provided as an argument.
	public void setdaysStay(double lenStay)
	{
		daysStay = lenStay;
	}
	
	// This method returns the Amount Due.
	public double getamountDue()
	{
		return amountDue;
	}
	
	// This method sets the Amount Due with the number provided as an argument. 
	public void setamountDue(double dueNow)
	{
		amountDue = dueNow;
	}
}
