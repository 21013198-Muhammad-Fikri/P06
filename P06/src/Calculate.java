public class Calculate {		
	public int add (int a, int b) {
		return a +b;
	}
	public int substract (int a, int c) { 
		  return a - c; 
	} 
	
	public int multiply (int a, int b) { 
		  return a * b; 
		  } 
	public int divide (int a, int b) { 
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not supported");
		}
		return a/b; 
		
	}

}
