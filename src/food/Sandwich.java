package food;

/**
 *
 * @author Merry McDonald
 */
public class Sandwich extends FoodItem
{
	private String breadType;
	private String[] ingredients;

	/**
	 * Constructor.
	 * Calls the no-arg constructor of the super class. Assigns 
	 * breadType to be the empty string and sets ingredients to null.
	 */
	public Sandwich()
	{super();
        
		
	}

	/**
	 * Constructor.
	 * Calls the constructor with four parameters of the super class. 
	 * Then sets breadType and ingredients to the values passed in
	 * the corresponding parameters.
	 * @param breadType The type of bread (whole wheat, for example)
	 * @param ingredients The ingredients for this sandwich.
	 * @param foodType The type of food.
	 * @param description The description of this item.
	 * @param fatContent The fat content of this item.
	 * @param price The price of this item.
	 */
	public Sandwich(String breadType, String[] ingredients,
			  String foodType, String description, String fatContent,
			  double price)
	{
		
	}
	
	/**
	 * Returns a string representation of this sandwich.
	 * The toString method of the super class is called.  Then the 
	 * breadtype is concatenated to the returned string in a left-
	 * justified field of approximately 20, followed by the list 
	 * of ingredients. Ingredients are listed on the same line, with
    * a single space separating pairs of ingredients.
    * NOTE: ON THE SAMPLE OUTPUT, THE LIST OF INGREDIENTS MAY WRAP
    * TO THE NEXT LINE IF THE LINE IS TOO LONG FOR THE WORD 
    * DOCUMENT, BUT THE LIST OF INGREDIENTS SHOULD NOT WRAP ON 
    * YOUR CONSOLE OUTPUT.
	 * @return a string representation of this sandwich.
	 */
	@Override
	public String toString()
	{
		return null;
	}
}
