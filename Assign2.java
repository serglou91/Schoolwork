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
    	
    }

    public static int FactP1(int n){
    	int value = 1;

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

    public static int FactP2(int n){
    	if (n<1){
    		return 1;
    	}
    	else{

    		return n * FactP2(n-1);
    	}
    }

    public static int FibonP1(int n){
    	int [] value = new int [n];

    		if(n == 0 || n == 1){
    			return 1;
    		}
    		else{
    			for (int x = 0; x<n; x++){
    				if(x == 0 || x == 1){
    					value[x] = 1;
    				}
    				else{
    					value[x] = value[x-1] + value[x-2];
    				}
    			}
    		}

    	return value[n-1];
    }

    public static int FibonP2(int n){
    	if(n<=1){
    		return 1;
    	}
    	else{
    		return FibonP2(n-1) + FibonP2(n-2);
    	}
    }
}