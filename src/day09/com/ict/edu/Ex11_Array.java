package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex11_Array {
	public static void main(String[] args) {
		// 숙제
		/*
		 * int? p1 =>(번호,국어,영어,수학,총점,평균,학점,순위) p2 =>(번호,국어,영어,수학,총점,평균,학점,순위) p3
		 * =>(번호,국어,영어,수학,총점,평균,학점,순위)
		 * 
		 */
		int[][] arr = new int[5][5];
		// 번호, 총점 ,평균, 학점, 순위
		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'C', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 95, 'A', 1 };

		
		 //arr[?][0] = 번호
		 //arr[?][1] = 총점
		 //arr[?][2] = 평균
		 //arr[?][3] = 학점
		 //arr[?][4] = 순위
		 

		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		// 순위를 구하자(오름차)
		int[] tmp = new int[5]; // 자리변경을 위한 임시변수 필요 //int[] tmp = {0,0,0,0,0};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][1] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					arr[i][4]++;

				}

			}
		}

		// 정렬 기준으로 출력
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;

				}
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char) (arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}
}
