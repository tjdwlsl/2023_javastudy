package day05.com.ict.edu;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		System.out.println("\n=================");
		// 3. 이중 for 문으로 풀기 1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 1
		for (int i = 0; i < 4; i++) {
			for(int j= 0; j<4; j++) {
				if(i == j) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\n=================");	

		
		// 4. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		//100이상이 되는지 구하시오
		int sum = 0;
		int i = 1;
		for( i = 1; sum<100; i++) {
			if(i%2==0) {
				sum = sum - i;
			}else { 
				sum = sum + i;
			}
		}
		System.out.println(i-1);
		
		
		
		
		// 5.6 별찍기

		for ( i = 1; i < 6; i++) {
			for (int j = 1; j < 5; j++) {
				if (i > j) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
		
		
		for ( i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.print("=================");
		
		
		
		
		
		/*원하는 횟수 입력받고
		  숫자를 입력받아서
		  입력받은 숫자가 홀수인가 짝수인가*/
		System.out.print("원하는 횟수를 말하세요 : ");
		int su = scan.nextInt();
		
		for ( i = 0; i < su; i++) {
		     int num = scan.nextInt(); // 숫자 입력받기
		     if (num % 2 == 0) {
		         System.out.println("입력받은 숫자는 짝수입니다.");
		     } else {
		         System.out.println("입력받은 숫자는 홀수입니다.");
		     }
		  }
		System.out.println("=================");

		
		
		/*이름,국어,영어,수학을 입력받아서
		  총점, 평균, 학점을 구하고
		  이름, 총점, 평균, 학점을 출력하는 코딩
		  (평균은 소수점 첫쨰자리)*/
		
		System.out.println("이름을 입력하세요 : ");
	       System.out.println("국어점수를 입력하세요 : ");
	       System.out.println("영어점수를 입력하세요 : ");
	       System.out.println("수학점수를 입력하세요 : ");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			int sum1 = kor + eng + math;
			double avg = sum1/3.0;
			double avg2 = (int)(avg*10)/10.0;
			String str = " ";
			
			if(avg >= 90) {
				str = "A";
			}else if (avg >=80){
				str = "B";
			}else if (avg >= 70) {
				str = "c";
			}else if (avg >=60) {
				str = "D";
			}else {
				str = "F";
			}
			System.out.println("이름: " + name);
	       System.out.println("총점: " + sum1);
	       System.out.println("평균: " + avg);
	       System.out.println("학점: " + str);
		
	       System.out.print("=================");

		/*첫번째 숫자받기
		  두번째 숫자받기
		  연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ") */
	       
	       	System.out.print("첫번째 숫자는? : ");
			int su1 = scan.nextInt();
			System.out.print("두번째 숫자는? : ");
			int su2 = scan.nextInt();
			System.out.print("받을 연산자? : ");
			String su3 = scan.next();
				switch (su3) { //인자값은 char, int(정수), String
				case "+":
					System.out.println(su1 + su2);
					break;
				case "-":
					System.out.println(su1 - su2);
					break;
				case "*":
					System.out.println(su1*su2);
					break;
				case "/":
					System.out.println(su1/su2);
					break;
				
				}
				System.out.println();
			
		
		
	       
				/* next()와 nextLine()의 차이점은?
				 * next() : 엔터키, 스페이스키 등 공백이전의 문자를 가져옴(공백이후는 받아올 수 없다)
				 * nextLine() : 공백이후의 문자까지 받아옴
				 * */

		
	}

}
