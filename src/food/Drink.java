package food;

/**
 *
 * @author Merry McDonald
 */
public class Drink extends FoodItem
{
	private int ounces;
	private boolean decaf;

	/**
	 * Constructor. Calls the no-arg constructor of the super class.
	 * Assigns 0 to ounces and false to decaf.
	 */
	public Drink()
	{
		
	}
	
	/**
	 * Constructor.  Calls the constructor with four parameters 
	 * of the super class. Assigns ounces and decaf with the values 
	 * sent in the corresponding parameters.
	 * @param ounces The number of ounces for this drink.
	 * @param decaf True if this drink is caffeine-free; false 
	 * otherwise.
	 * @param foodType The type of food.
	 * @param description The description of this item.
	 * @param fatContent The fat content of this item.
	 * @param price The price of this item.
	 */
	public Drink(int ounces, boolean decaf, String foodType,
			  String description, String fatContent, double price)
	{
		
	}

	/**
	 * Returns a string representation of this drink.  It calls the
	 * toString method of the super class and then concatenates the 
	 * number of ounces, left-justified in a field of width 
	 * approximately 2, followed by the word "ounces", followed by 
    * some spaces, then the words "decaf" or "not decaf", 
    * left-justified in a field of width approximately 10.
    * Note:  The number of spaces following the word ounces should
    * be chosen so that the items in the last column of information
    * for drinks (decaf or not decaf) and sandwiches (list of
    * ingredients) are properly aligned as shown in the sample output.
	 * @return a string representation of this drink.
	 */
	@Override
	public String toString()
	{
		return null;
	}
}
