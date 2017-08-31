package example;

public class EditorialBetweenTwoSets {
    
	public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            
            if (a >= b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }

        return a + b;
    }

    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    
    public static int getTotalX(int[] a, int[] b) {
        
        int multiple = 0;
        for(int i : b) {
            multiple = gcd(multiple, i);
        }
//        System.err.println("Multiple: " + multiple);
        
        int factor = 1;
        for(int i : a) {
            factor = lcm(factor, i);
            if (factor > multiple) {
                return 0;
            }
        }

        if (multiple % factor != 0) {
            return 0;
        }
//        System.err.println("Factor: " + factor);
        
        int value = multiple / factor;
        
        int max = Math.max(factor, value);
        int totalX = 1;
        
        for (int i = factor; i < multiple; i++) {
            if (multiple % i == 0 && i % factor == 0) {
                totalX++;
            }
        }

        return totalX;
        
    }

    public static void main(String[] args) {
    	int[] a = {100,99,98,97,96,95,94,93,92,91};
		int[] b = {1,2,3,4,5,6,7,8,9,10};
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}