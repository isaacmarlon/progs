package exceptions;

public class Contato {
	
	public int batteryLevel;
	
	public Contato() {
		
		batteryLevel = 100;
		
	}
	
	public void chargeBattery(int hours) {
	    
	    System.out.println("Droid charging...");
	    
	    int charge = 5 * hours;
	    charge += this.batteryLevel;
	    
	    if (charge > 100) {
	    	this.batteryLevel = 100;
	    } else {
	    	this.batteryLevel = charge;
	    }
	    
	}

	public static int divide(int a, int b) {
		int result = 0;

		try {
			result = a / b;
		} catch (ArithmeticException exception) {
			System.err.println("Error! Dividing by zero is not allowed. l:12");
		} finally {
			return result;
		}

	}

	public static void main(String[] args) {
		System.out.println(divide(2, 0));
	}
}
