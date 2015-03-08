//--------------------------------------------------------------------
//Sergio Lourenco T00011397
//COMP 3050
//Assign2.java
//The purpose of this program is to demonstrate how to calculate
//factorials and fibonacci terms both recursively and non-recursively.
//Language: Java
//Editor: Eclipse
//Compiler: Eclipse Compiler for Java
//OS: Windows 8.1 (64-bit)
//Computer Used: Personal Desktop Computer
//--------------------------------------------------------------------


public class Assign2 {

    public static void main(String [] args){
    	
    	System.out.println("0! = " + FactP1(0));
    	System.out.println("1! = " + FactP1(1));
    	System.out.println("2! = " + FactP1(2));
    	System.out.println("3! = " + FactP1(3));
    	System.out.println("4! = " + FactP1(4));
    	System.out.println("5! = " + FactP1(5));
    	System.out.println("6! = " + FactP1(6));
    	System.out.println("7! = " + FactP1(7));
    	System.out.println("8! = " + FactP1(8));
    	System.out.println("9! = " + FactP1(9));
    	System.out.println("10! = " + FactP1(10));
    	
    	System.out.println("0! = " + FactP2(0));
    	System.out.println("1! = " + FactP2(1));
    	System.out.println("2! = " + FactP2(2));
    	System.out.println("3! = " + FactP2(3));
    	System.out.println("4! = " + FactP2(4));
    	System.out.println("5! = " + FactP2(5));
    	System.out.println("6! = " + FactP2(6));
    	System.out.println("7! = " + FactP2(7));
    	System.out.println("8! = " + FactP2(8));
    	System.out.println("9! = " + FactP2(9));
    	System.out.println("10! = " + FactP2(10));
    	

    	System.out.println("F0= " +FibonP1(0));
    	System.out.println("F1= " +FibonP1(1));
    	System.out.println("F2= " +FibonP1(2));
    	System.out.println("F3= " +FibonP1(3));
    	System.out.println("F4= " +FibonP1(4));
    	System.out.println("F5= " +FibonP1(5));
    	System.out.println("F6= " +FibonP1(6));
    	System.out.println("F7= " +FibonP1(7));
    	System.out.println("F8= " +FibonP1(8));
    	System.out.println("F9= " +FibonP1(9));
    	System.out.println("F10= " +FibonP1(10));
    	
    	System.out.println("F0= " +FibonP2(0));
    	System.out.println("F1= " +FibonP2(1));
    	System.out.println("F2= " +FibonP2(2));
    	System.out.println("F3= " +FibonP2(3));
    	System.out.println("F4= " +FibonP2(4));
    	System.out.println("F5= " +FibonP2(5));
    	System.out.println("F6= " +FibonP2(6));
    	System.out.println("F7= " +FibonP2(7));
    	System.out.println("F8= " +FibonP2(8));
    	System.out.println("F9= " +FibonP2(9));
    	System.out.println("F10= " +FibonP2(10));
    	
    	long start = System.nanoTime();
    	System.out.println("10!= " +FactP1(10));
    	long end = System.nanoTime();
    	long total = end - start;
    	double totalSeconds = (double)total / 1000000000.0;
    	System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
    	start = System.nanoTime();
    	System.out.println("20!= " +FactP1(20));
    	end = System.nanoTime();
    	total = end - start;
    	totalSeconds = (double)total / 1000000000.0;
    	System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
    	start = System.nanoTime();
    	System.out.println("30!= " +FactP1(30));
    	end = System.nanoTime();
    	total = end - start;
    	totalSeconds = (double)total / 1000000000.0;
    	System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
    	start = System.nanoTime();
    	System.out.println("40!= " +FactP1(40));
    	end = System.nanoTime();
    	total = end - start;
    	totalSeconds = (double)total / 1000000000.0;
    	System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
    	start = System.nanoTime();
    	System.out.println("50!= " +FactP1(50));
    	end = System.nanoTime();
    	total = end - start;
    	totalSeconds = (double)total / 1000000000.0;
    	System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
    	start = System.nanoTime();
    	System.out.println("60!= " +FactP1(60));
    	end = System.nanoTime();
    	total = end - start;
    	totalSeconds = (double)total / 1000000000.0;
    	System.out.println("Operation took: "+ totalSeconds + " seconds");
    	System.out.println();
    	
    	start = System.nanoTime();
    	System.out.println("10!= " +FactP2(10));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("20!= " +FactP2(20));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
		
		start = System.nanoTime();
    	System.out.println("30!= " +FactP2(30));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
		
		start = System.nanoTime();
    	System.out.println("40!= " +FactP2(40));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("50!= " +FactP2(50));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("60!= " +FactP2(60));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	System.out.println();
    	
    	start = System.nanoTime();
    	System.out.println("F10= " +FibonP1(10));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F20= " +FibonP1(20));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
		System.out.println("F30= " +FibonP1(30));
		end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
		
		start = System.nanoTime();
		System.out.println("F40= " +FibonP1(40));
		end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
		
		start = System.nanoTime();
    	System.out.println("F50= " +FibonP1(50));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F60= " +FibonP1(60));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	System.out.println();
    	
    	start = System.nanoTime();
    	System.out.println("F10= " +FibonP2(10));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F20= " +FibonP2(20));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F30= " +FibonP2(30));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F40= " +FibonP2(40));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F50= " +FibonP2(50));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
		start = System.nanoTime();
    	System.out.println("F60= " +FibonP2(60));
    	end = System.nanoTime();
    	total = end - start;
		totalSeconds = (double)total / 1000000000.0;
		System.out.println("Operation took: "+ totalSeconds + " seconds");
    	
    }

    public static double FactP1(int n){
    	double value = 1.0;

    	if (n == 0 || n == 1){
    		return value;
    	}
    	else{
    		int x = n;
    		while(x>1){
    			value = value * x;
    			x--;
    		}
    	}

    	return value;
    }

    public static double FactP2(int n){
    	if (n<1){
    		return 1;
    	}
    	else{

    		return n * FactP2(n-1);
    	}
    }

    public static double FibonP1(int n){
    	double [] value = new double [n+1];

    		if(n == 0 || n == 1){
    			return 1;
    		}
    		else{
    			for (int x = 0; x<n+1; x++){
    				if(x == 0 || x == 1){
    					value[x] = 1.0;
    				}
    				else{
    					value[x] = value[x-1] + value[x-2];
    				}
    			}
    		}
    	return value[n];
    }

    public static double FibonP2(int n){
    	if(n<=1){
    		return 1;
    	}
    	else{
    		return FibonP2(n-1) + FibonP2(n-2);
    	}
    }
}