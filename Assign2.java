/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2015/3/6
 */


public class Assign2 {

    public static void main(String [] args){
    	/*System.out.println("0! = " + FactP2(0));
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
    	*/

    	System.out.println(FibonP2(0));
    	System.out.println(FibonP2(1));
    	System.out.println(FibonP2(2));
    	System.out.println(FibonP2(3));
    	System.out.println(FibonP2(4));
    	System.out.println(FibonP2(5));
    	System.out.println(FibonP2(6));
    	System.out.println(FibonP2(7));
    	System.out.println(FibonP2(8));
    	System.out.println(FibonP2(9));
    	System.out.println(FibonP2(10));
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