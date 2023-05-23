package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		arr[?][0] = 번호
		arr[?][1] = 국어
		arr[?][2] = 영어
		arr[?][3] = 수학
		arr[?][4] = 총점
		arr[?][5] = 평균
		arr[?][6] = 학점
		arr[?][7] = 순위
		*/
		
		/*int[] p1 = { 1, 90, 90, 90, 270, 90, 'A', 1 };
		int[] p2 = { 2, 70, 70, 70, 210, 70, 'C', 1 };
		int[] p3 = { 3, 60, 60, 60, 180, 60, 'F', 1 };
		int[] p4 = { 4, 100, 100, 100, 300, 100, 'A', 1 };
		int[] p5 = { 5, 95, 100, 90, 285, 95, 'A', 1 };*/
		//학생 수 받기
		System.out.println("인원 수: ");
		int su = scan.nextInt();
		//int [][] arr = new int [su][8];
		double [][] arr = new double [su][8];
		for (int i = 0; i < arr.length; i++) {
			//키보드로 번호, 국어, 영어 , 수학,
			System.out.println("번호 : ");
			int num = scan.nextInt();
			System.out.println("국어점수 : ");
			int kor = scan.nextInt();
			System.out.println("영어점수 : ");
			int eng = scan.nextInt();
			System.out.println("수학점수 : ");
			int math = scan.nextInt();
		}
		
		
		//총점, 평균, 학점, 순위
		
	
	
		//순위
		
		//순위로 오름차순 정렬
		
		//출력
		
		
	}
}
