package javaprac;

import java.util.ArrayList;

public class helloworld {
	public static void main(String[] args) {

		int i;
		int number;
		int sum;
		int sum_2;
		int number_for_perfect;
		ArrayList<Integer> list_armstrong = new ArrayList();
		ArrayList<Integer> list_perfect = new ArrayList();
		
		for (i = 2; i<999; i++) {
			number = i;
			sum = 0;
			sum_2 = 0;
			
			while (number!=0) {
				sum += Math.pow(number%10,3);
				number = number/10;
			}
			
			if (sum == i) {
				list_armstrong.add(i);
			}
			
			for (number_for_perfect = 1; number_for_perfect < i ; number_for_perfect ++) {
				
				if (i % number_for_perfect == 0) {
					sum_2 += number_for_perfect;
				}
			}
			
			if (sum_2 == i) {
				list_perfect.add(i);
			}
			
			
		}
		
		System.out.println("학번 : 12211693 이름 : 조수민");
		
		
		System.out.println("Armstrong Number :");
		for(Integer q : list_armstrong) { 
		    System.out.print(q + " ");
		}
		System.out.println(" ");
		
		System.out.println("Perfect Number :");
		for(Integer q : list_perfect) { 
		    System.out.print(q + " ");
		}
		
		
	}

}
