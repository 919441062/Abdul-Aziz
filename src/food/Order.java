package food;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Merry McDonald
 */
public class Order implements Iterable<FoodItem>
{
	private int orderNumber; // Order number for this order.
   private ArrayList<FoodItem> order; // List of items in this order.
	
	/**
	 * Constructor.
	 * Sets order to a new empty array list of food items.
    * Sets orderNumber to -1;
	 */
	public Order()
	{
		
	}
	
   /**
    * Constructor.
    * Sets order to a new empty array list of food items.
    * Sets orderNumber equal to the value passed in the parameter.
    * @param orderNumber The order number for this order.
    */
   public Order(int orderNumber)
           
   {
      
   }
   
   /**
    * Returns the order number for this order.
    * @return the order number for this order.
    */
   public int getOrderNumber()
   {
      return 0;
   }
	/**
	 * Adds a food item to order.
	 * @param item The food item to be added.
	 */
	public void addToOrder(FoodItem item)
	{
		
	}
	
	/**
	 * Returns the total cost of the food items in order: finds 
    * the price for each item and returns the sum.
	 * @return the total cost of the food items order.
	 */
	public double getOrderTotal()
	{
		return 0.0;
	}
	
	/**
	 * Returns the number of food items in order.
	 * @return the number of food items in order.
	 */
	public int numberOfItems()
	{
		return 0;
	}
	
	/**
	 * Sorts the items in order using the natural order for 
	 * FoodItem objects.
	 */
	public void sortItemsInOrder()
	{
		
	}
	
	/**
	 * Returns an iterator over FoodItem objects in order.
	 * @return an iterator over FoodItem objects in order.
	 */
	@Override
	public Iterator<FoodItem> iterator()
	{
		return null;
	}

	/**
	 * Returns a string representation of this order.  The string
	 * representation consists of the order number, appropriately 
    * labeled, followed by each food item in the order, 
	 * using the toString method of the FoodItem class, with each
	 * item on a separate line.  Following the list of items, the 
	 * order total should be printed, appropriately labeled.  
    * See the sample output for details and exact formatting 
    * requirements.
	 * @return a string representation of this order.
	 */
	@Override
	public String toString()
	{
		return null;
	}
}
