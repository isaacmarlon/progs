
public class Calculadora {

	public int plus(int a, int b) {
		return a + b;
	}
	
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	
	public int times(int a , int b) {
		return a * b;
	}
	
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Calculadora math = new Calculadora();
		
		System.out.println(math.plus(1, 1));
		System.out.println(math.sub(1, 1));
		System.out.println(math.times(4, 4));
		System.out.println(math.div(0, 2));
		
	}
	
} 
