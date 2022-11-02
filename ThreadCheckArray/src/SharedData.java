import java.util.ArrayList; 


/**
 * @author Sharon
 * @author Yuval
 *SharedData class,this class is the shared class between the two threads
 */
public class SharedData 
{
	ArrayList<Integer> array = new ArrayList<Integer>(); // Create an ArrayList object
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Constructor. gets an arraylist object and int when new object is created.
	 * sets inner array and b variables to be as the given params.
	 * @param array (variable with type array - array of Integers)
	 * @param b(variable with type int - b)
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**boolean array function , returns inner winarray, which is the array full of index used for number build.
	 * @return boolean array winArray.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**setWinArray function - sets winners (index) array.
	 * @param bollean array - "winArray"
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** getArray function. returns private array.
	 * @return array of type arraylist (integer).
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**getB function, returns private B variable
	 * @return private b variable of type private final int.
	 */
	public int getB() 
	{
		return b;
	}

	/**getFlag function, returns private flag variable
	 * @return private flag variable
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**setFlag function, changed flag status whenever needed (when number found).
	 * @param boolean variable - "flag"
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
