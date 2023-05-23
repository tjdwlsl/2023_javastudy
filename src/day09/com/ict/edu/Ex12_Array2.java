package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생 수 받기
		System.out.println("인원 수: ");
		int su = scan.nextInt();
		// int [][] arr = new int [su][8];
		double[][] arr = new double[su][8];
		for (int i = 0; i < arr.length; i++) {
			// **for문 실행 될 때마다 한사람의 정보를 담을 수 있는 배열을 만들자!!!
			double[] p = new double[8];
			// p가 새로 생성 (new)때문에 p는 서로 다른 p다(su만큼의 p가 만들어짐)

			// 키보드로 번호, 국어, 영어 , 수학,
			// 총점, 평균, 학점, 순위(초기값 지정)
			System.out.println("번호 : ");
			// int num = scan.nextInt();
			p[0] = scan.nextInt();

			System.out.println("국어점수 : ");
			// int kor = scan.nextInt();
			p[1] = scan.nextInt();

			System.out.println("영어점수 : ");
			// int eng = scan.nextInt();
			p[2] = scan.nextInt();

			System.out.println("수학점수 : ");
			p[3] = scan.nextInt();
			// int math = scan.nextInt();

			p[4] = p[1] + p[2] + p[3]; // sum
			p[5] = (int) (p[4] / 3.0 * 10) / 10.0; // avg

			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else {
				p[6] = 'F';
			}
			p[7] = 1; // rank
			// p[] =>칸수? 8칸
			// **다차원배열에 넣자!!!
			arr[i] = p;
		}

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue; //생략가능 굳이 안써도 됨
				if(arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}

		// 순위로 오름차순 정렬
		// 자리를 변경하기 위해서 임시
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length-1; i++) { //마지막은 가지 않아서 길이 -1
			for (int j = i + 1; j < arr.length; j++) {//처음은 가지 않아서 i +1
				if(arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}

		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위\t");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 1 || j == 2 || j == 3)
					continue; // 국영수 출력에서 제외

				if (j == 5) {
					System.out.print(arr[i][j] + "\t");
				} else if (j == 6) {
					System.out.print((char) (arr[i][j]) + "\t");
				} else {
					System.out.print((int) (arr[i][j]) + "\t");
					// double인거만 double찍고 나머지 숫자는int
				}
			}
			System.out.println();
		}
	}

}
