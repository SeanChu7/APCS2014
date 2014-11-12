import java.util.*;

public class Stat extends SuperArray{

    /**
     * Initialize the data array to a size of your choosing.
     */
    public Stat()  {
	super(10);
    }
    
    /**
     * Initialize the data array to the specified size.
     */
    public Stat(int s)  {
	super(s);
    }

    /**
     * Returns a string that contains all the elements of the array.
     */
    public String toString() {
	return super.toString();
    }
    
    /*
     * Go through the array and have the user enter 
     * values for each available space.
     */
    public void setValues() {
	Scanner scan = new Scanner( System.in );

	for(int i=0; i < data.length; i++ ) {

	    System.out.print( "Enter data: " );
	    super.add(scan.nextInt(),500);
	}
    }

    /**
     * Return the sum of all the data in the array.
     */
    public int calcSum() {
	int sum = 0;
	for(int i=0; i < data.length; i++ )
	    sum+= (int)data[i];
	
	return sum;
    }

    /**
     * Return the average of the data in the array.
     */
    public double calcAvg() {
	return calcSum() * 1.0 / data.length;
    }

    /**
     * Return the smallest value in the array.
     */
    public int findMin() {
	int min = (int)data[0];

	for(int i=1; i < data.length; i++ )
	    if ( (int)data[i] < min )
		min = (int)data[i];
	    
	return min;
    }

    /**
     * Return the largest value in the array.
     */
    public int findMax() {
	int max = (int)data[0];

	for(int i=1; i < data.length; i++ )
	    if ( (int)data[i] > max )
		max = (int)data[i];
	    
	return max;
    }


    public int frequency( int n ) {

	int freq = 0;
	for(int i=0; i < data.length; i++ )
	    if ( (int)data[i] == n )
		freq++;

	return freq;
    }


    public boolean evenBalance() {
	int lsum = 0;
	int rsum = 0;

	for (int i=0; i < data.length/2; i++ ) {
	    lsum+= (int)data[i];
	    rsum+= (int)data[ data.length - 1 - i];
	}
	return lsum == rsum;
    }

    public int mode() {
	int guess = (int)data[0];
	int freq = frequency( guess );

	for (int i=1; i < data.length; i++ ) {
	    if ( frequency( (int)data[i] ) > freq ) {
		freq = frequency( (int)data[i] );
		guess = (int)data[i];
	    }
	}
	return guess;
    }

    public static void main( String[] args ) {

	int n;
	Stat s;
	Scanner scan = new Scanner( System.in );
	
	System.out.print("Number of entries: ");
	n = scan.nextInt();

	s = new Stat(n);

	s.setValues();
	System.out.println( "Data: " + s );
	System.out.println("Sum: " +  s.calcSum() );
	System.out.println("Average: " + s.calcAvg() );
	System.out.println("Min: " + s.findMin() );
	System.out.println("Max: " + s.findMax() );

	System.out.println( "Frequency of 10: " + s.frequency(10));
	System.out.println( "Frequency of -1: " + s.frequency(-1));

	System.out.println( "Balanced? " + s.evenBalance() );

	System.out.println( "Mode: " + s.mode() );
    }
}
