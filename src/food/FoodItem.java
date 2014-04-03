package food;

/**
 *
 * @author Merry McDonald
 */
public abstract class FoodItem implements Comparable<FoodItem>
{

	private String foodType;
	private String description;
	private String fatContent;
	private double price;

	/**
	 * Constructor.
	 * Creates a food item with foodType, description, and fatContent
	 * set to the empty string, and with price set to 0.0.
	 */
	public FoodItem()
	{
		this("", "", "", 0.0);
	}

	/**
	 * Constructor.  Sets the value of the private instance variables
	 * using the values passed in the corresponding parameters.
	 * @param foodType The type of food (drink, for example).
	 * @param description A description of the food item.
	 * @param fatContent The fat content (NF, LF, RF, for nonfat,
	 * low fat, and regular fat, respectively) for this food item.
	 * @param price The price of this food item.
	 */
	public FoodItem(String foodType, String description,
			  String fatContent, double price)
	{
		this.foodType = foodType;
		this.description = description;
		this.fatContent = fatContent;
		this.price = price;
	}

	/**
	 * Returns the description of this food item.
	 * @return the description of this food item.
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Returns the fat content of this food item.
	 * @return the fat content of this food item.
	 */
	public String getFatContent()
	{
		return fatContent;
	}

	/**
	 * Returns the price of this food item.
	 * @return the price of this food item.
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * Compares this food item to the food item passed in the 
	 * parameter.  Compares food items by type; for food items of the
	 * same type, compares by description.
	 * A collection of food items sorted using this method will be
	 * sorted in ascending order by type; foods of the same type
	 * will be sorted in ascending order by description.
	 * @param aFoodItem The food item that this food item is being 
	 * compared to.
	 * @return a negative value if, according to the above rules,
	 * this food item precedes aFoodItem; a positive value if this
	 * food item follows aFoodItem; zero otherwise.
	 */
	@Override
	public int compareTo(FoodItem aFoodItem)
	{
      return 0;
	}

	/**
	 * Returns a string representation of this food item.  
	 * foodType is left justified in a field of width approximately 9,
	 * description is left justified in a field width of approximately
	 * 25, fatContent is left-justified in a field width of 
	 * approximately 2, and price is preceded by a dollar sign and 
	 * uses a field of width 5, with 2 decimal places.
	 * @return a string representation of this food item.
	 */
	@Override
	public String toString()
	{
		return String.format("%-9s  %-25s  %-2s $%5.2f", foodType,
				  description, fatContent, price);
	}
}
