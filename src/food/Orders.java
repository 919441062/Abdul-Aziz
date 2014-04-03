package food;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Merry McDonald
 */
public class Orders implements Iterable<Order>
{

	private ArrayList<Order> orders;

	/**
	 * Constructor.
	 * Sets orders to a new empty array list of Order objects.
	 */
	public Orders()
	{
	orders=new ArrayList<>();
	}

	/**
	 * Adds an order to orders.
	 * @param order The order to be added.
	 */
	public void addOrder(Order order)
	{
		orders.add(order);
	}

	/**
	 * Returns the order with the lowest cost.
	 * @return the order with the lowest cost.
	 */
	public Order findCheapestOrder()
	{
           Order o1=orders.get(0);
            for(Order o:orders){
               if(o1.getOrderTotal()>o.getOrderTotal()){
                o1=o;   
               }
                
            }
            
		return o1;
	}

	/**
	 * Returns the order with the largest number of items.
	 * @return the order with the largest number of items.
	 */
	public Order findMaxItems()
	{
		return null;
	}
	
	/**
	 * Returns an iterator over the Order objects in orders.
	 * @return an iterator over the Order objects in orders.
	 */
	@Override
	public Iterator<Order> iterator()
	{
		return null;
	}

	/**
	 * Returns a string representation of this Orders object.  The
	 * string representation consists of each Order object in orders, 
    * displayed using the toString method of the ORDER class.  
    * See sample output for details.
	 * @return a string representation of this Orders object.
	 */
	@Override
	public String toString()
	{
		return null;
	}
}
