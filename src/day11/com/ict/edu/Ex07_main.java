package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07_Method t1 = new Ex07_Method();
		Scanner scan = new Scanner(System.in);
		
		//5명의 이름,국어,영어,수학을 입력 받아서
		//이름, 총점, 평균, 학점, 순위를 구하고
		//순위를 기준으로 오름차순 정렬해서 출력
		//============================================
		//입력 받기
		System.out.println("학생수 : ");
		int su = scan.nextInt();
		
		String[] name = new String[su]; //su를 5로 고정시킬수 있음
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
			
			
			//void라서 void본인이 전역번수를 가지고있어서 넘어오지 않음
			
			//총점구하기
			t1.getSum(kor[i], eng[i], math[i]);
			//이거하는 순간 총점을 구하는 메서드로 감
			//메서드 부분에서 int sum부분에 총점이 봐뀌고 그 점수를 밑에 sum[i]로 저장
			sum[i] = t1.sum;//총점저장해야함
			//평균구하기
			t1.getAvg();
			avg[i] = t1.avg;
			//학점구하가
			t1.getHak();
			hak[i] = t1.hak;
		}
		//출력
		System.out.println("이 름\t총 점\t평 균\t학 점");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.println(hak[i]+"\t");

		}
		
	}

}
