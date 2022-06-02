package javaprac;
import java.util.Scanner;
import java.util.ArrayList;

public class countclass {
	public static void main(String[] args) {
		System.out.println("�й� 12211693 �̸� ������");
		int num = 0;
		int total_sosu = 0;
		int total_legendre = 0;
		int total_twin = 0;

		
		while (true) {
			ArrayList<Integer> list_legendre = new ArrayList<Integer>();
		
			Scanner sc = new Scanner(System.in);
			System.out.print("asdf : ");
			
			num = sc.nextInt();
			
			if (num == 0) {
				break;
			}
			
			else {
		        for(int i=2; i<=num; i++) {
		        	int q;
		            for(q=2; q<i; q++) {
		                if(i%q == 0)
		                    break;
		            }
		            if(i == q)	

		            	list_legendre.add(i);
		        }
			
                for (int i = 0 ; i <list_legendre.size(); i++) {
                	try {
                	if (list_legendre.get(i) == list_legendre.get(i+1)-2) {
                		total_twin += 1;
                	}
                	}
                	catch(Exception IndexOutOfBoundsExceotion) {
                		
                	}
                }

    			System.out.println("Nums of primes : " + list_legendre.size() + ", Nums of Twin Primes : " +total_twin);
    			total_twin = 0;
    			list_legendre = null;
    			
    			
    			
			}
		}
	}
}
	

