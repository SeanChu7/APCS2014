import java.util.*;

public class Stat {

    private int[] data;


    /**
     * Initialize the data array to a size of your choosing.
     */
    public Stat()  {
	data = new int[3];
    }
    
    /**
     * Initialize the data array to the specified size.
     */
    public Stat(int s)  {
	data = new int[s];
    }

    /**
     * Returns a string that contains all the elements of the array.
     */
    public String toString() {
	String ret = "";
	for(int i = 0; i < data.length; i++){
		ret += data[i] + " ";
	}
	return ret;
    }
    
    /*
     * Go through the array and have the user enter 
     * values for each available space.
     */
    public void setValues() {
	Scanner s = new Scanner(System.in);
	int a;
	for(int i = 0; i < data.length; i++){
		System.out.println("Please input what you want as the value.\n");
		a = s.nextInt();
		data[i] = a;
	}
	
	
    }

    /**
     * Return the sum of all the data in the array.
     */
    public int calcSum() {
	int sum = 0;
	for(int i = 0; i < data.length; i++){
		sum += data[i];
	}
	return sum;
    }

    /**
     * Return the average of the data in the array.
     */
    public double calcAvg() {
	int a = calcSum();
	double b = a/data.length;
	return b;
    }

    /**
     * Return the smallest value in the array.
     */
    public int findMin() {
	int min = data[0];
	for(int i = 0; i < data.length; i++){
		if(data[i] < min){
			min = data[i];
		}
	}
	return min;
    }

    /**
     * Return the largest value in the array.
     */
    public int findMax() {
	int max = data[0];
	for(int i = 0; i < data.length; i++){
		if(data[i] > max){
			max = data[i];
		}
	}
	return max;
    }

    public int freq(int n){
	int counter = 0;
	for(int i = 0; i < data.length; i++){
		if(data[i] == n){
			counter ++;
		}
	}
	return counter;
    }

    public boolean evenBalance(){
		int[] a1 = new int[data.length/2];
		int[] a2 = new int[data.length/2];
		for(int i = 0; i < data.length/2; i++){
			a1[i] = data[i];
		}
		for(int i = data.length/2; i < data.length; i++){
			a2[i-data.length/2] = data[i];
		}
		int temp = 0;
		int temp2 = 0;
		for(int i = 0; i<a1.length; i++){
			temp += a1[i];
		}
		for(int i = 0; i<a2.length; i++){
			temp2 += a2[i];
		}
		if(temp == temp2){
			return true;
		}		
		else{
			return false;
		}
    }

    public int mode(){
	int counter = 0;
	int ret = data[0];
	for(int i = 0; i < data.length; i++){
		if(freq(data[i])>counter){
			ret = data[i];
			counter = freq(data[i]);
		}
	}
	return ret;
    }

    public int mode2(){
	
    }

    public static void main( String[] args ) {
	int n;
	Stat s;
	Scanner scan = new Scanner( System.in );
	
	System.out.print("Number of entries: ");
	n = scan.nextInt();

	s = new Stat(n);

	s.setValues();
	System.out.println("Data: " + s );
	System.out.println("Sum: " +  s.calcSum() );
	System.out.println("Average: " + s.calcAvg() );
	System.out.println("Min: " + s.findMin() );
	System.out.println("Max: " + s.findMax() );
	System.out.println("Mode: " + s.mode() );
	System.out.println("evenBalance?: " + s.evenBalance() );
    }
}
