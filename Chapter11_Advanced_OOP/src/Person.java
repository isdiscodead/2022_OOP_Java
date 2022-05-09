/** 
 * Person : Example of Inheritance 
 * @author isdiscodead
 * @version v0.1
 * @since 05-09-2022
 *
 */

public class Person {
	
	private int weight; // private
	int age; // default 
	protected int height; // protected
	public String name; // public 
	
	public void setWeight( int weight ) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
}
