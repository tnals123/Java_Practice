package java1203;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class asdfasdf {
	

	
	public static void main(String[] args) {
		File file = new File("C:/Users/soo86/Desktop/log.txt");
		System.out.println("학번 12211693 이름 조수민");
		int count = 0;
		int gameplayer = 1;
		Scanner sc = new Scanner(System.in);
		Random randomInt = new Random();
		var randomint = randomInt.nextInt(100)+1;

	while (true) {
		
		System.out.println("정수를 입력하세요(1~100) : ");
		var myanswer = sc.nextInt();
		
		assert myanswer >=1 : "범위 안에 있는 정수를 입력해 주세요! (1~100)";
		assert myanswer <=100 : "범위 안에 있는 정수를 입력해 주세요! (1~100)";
		
		if (myanswer < randomint) {
			System.out.println("UP");
			count +=1 ;
		}
		else if (myanswer > randomint) {
			System.out.println("Down");
			count +=1 ;
		}
		
		else if (myanswer == randomint) {
			System.out.println("정답!" + count + "번 만에 맞춤");
			
			try {
			    BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			    writer.write("gameplayer" + gameplayer + " : " + count + " try" );
			    writer.newLine();
			    writer.write("");
			    writer.flush();
			    writer.close();
			} catch (IOException e) {
			    e.printStackTrace();
			}
			
			
			System.out.println("다시 할래요? 1 : Y , 2 : N");
			var myanswer2 = sc.nextInt();


			
			if(myanswer2 == 1) {
				randomint = randomInt.nextInt(100)+1;
				gameplayer += 1;
				continue;
			}
			else if (myanswer2 == 2) {
				break;
			}
		}
	}

	
	}
}
	


