package basic.exercise;

//can we have constructor in abstract class and interface?

//Yes, an Abstract Class can have a Constructor. You Can Overload as many
//Constructor as you want in an Abstract Class. These Contractors Can be used 
//to Initialized the initial state of the Objects Extending the Abstract Class.

public class Day4Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract class Product { 
		    int multiplyBy;
		    public Product( int multiplyBy ) {
		        this.multiplyBy = multiplyBy;
		    }

		    public int mutiply(int val) {
		       return multiplyBy * val;
		    }
		}

		class TimesTwo extends Product {
		    public TimesTwo() {
		        super(2);
		    }
		}

		class TimesWhat extends Product {
		    public TimesWhat(int what) {
		        super(what);
		    }
		}
	}

}
