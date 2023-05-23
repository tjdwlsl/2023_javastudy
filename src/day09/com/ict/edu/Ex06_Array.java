package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학급 인원수 입력 받기
		// 이름,국어,영어,수학,점수 입력
		// 총점,평균,학점,순위
		
		//정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원수를 물어본다.
		System.out.println("인원수: ");
		int su = scan.nextInt();
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su];
		
		for (int i = 0; i < su; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			System.out.print("국어점수를 입력 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어점수를 입력 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학점수를 입력 : ");
			math[i] = scan.nextInt();
	
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			
			if(avg[i] >=90) {
				hak[i] = "A학점";
			}else if(avg[i]>=80) {
				hak[i] = "B학점";
			}else if(avg[i]>=70) {
				hak[i] = "C학점";
			}else {
				hak[i] ="F학점";
			}
			
			rank[i] = 1;
		}
		//순위
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(i == j)continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		//출석
		System.out.println("이름\t종점\t평균\t학점\t순위");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i]+ "\t");
			System.out.print(sum[i]+ "\t");
			System.out.print(avg[i]+ "\t");
			System.out.print(hak[i]+ "\t");
			System.out.println(rank[i]);
        
		}
		
	
	}
}
