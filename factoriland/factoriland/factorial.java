package factoriland;

import java.util.ArrayList;

public class factorial {

	public static void main(String[] args) {
		recFactorialSums(16, new ArrayList<Integer>());

	}
	
	public static void recFactorialSums(int n, ArrayList<Integer> arr){
		for(int i = 2; i <= n; i++){
			if(n - factorial(i) >= 0){
				arr.add(i);
				recFactorialSums(n - factorial(i), arr);
				arr.remove(arr.size() - 1);
			}
		}
		
		if(n == 0){
			for(int i = 0; i < arr.size(); i++){
				System.out.print(arr.get(i) + " ");
			}
			System.out.println();
		}
	}
	
	public static int factorial(int x){
		int temp = 1;
		for(int i = 1; i <= x; i++){
			temp *= i;
		}
		return temp;
	
	}

}
