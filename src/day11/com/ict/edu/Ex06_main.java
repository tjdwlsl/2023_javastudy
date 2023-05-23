package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex06_Method t1 = new Ex06_Method();
		//5명의 이름,국어,영어,수학을 입력 받아서
		//이름, 총점, 평균, 학점, 순위를 구하고
		//순위를 기준으로 오름차순 정렬해서 출력
		//============================================
		//입력 받기
		System.out.println("학생수 : ");
		int su = scan.nextInt();
		
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		
		for (int i = 0; i < su; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			//총점구하기
			sum[i] = t1.getSum(kor[i], eng[i], math[i]); //받기위해 sum의 배열을 만든다
			//평균구하기
			avg[i] = t1.getAvg(sum[i]);
			//학점구하가
			hak[i] = t1.getHak(avg[i]);

		}
		
		
		//출력
		System.out.println("이 름\t총 점\t평 균\t학 점");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]+"\t");
						
		
			//숙제 위에거 2차원 배열으로 (이름대신 번호)
			//다 double로 만들어서 번호로지정?
			//char로 변경해서 int로 형변환?
			//메서드부분도 double로 바꿔야함
			//근데 어디에 char넣으락 했는데 시발..
			
			
		}
	}
}
