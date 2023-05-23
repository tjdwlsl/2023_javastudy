package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		//5명의 이름, 국어,영어, 수학을 입력 받아서
		//이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력
		
		Scanner scan = new Scanner(System.in);
		//Ex08_Method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		//클래스를 자료형으로 사용(int[])
		//int[] k1 = new int[];
		Ex08_Method[] arr = new Ex08_Method[5];
		for (int i = 0; i < arr.length; i++) {
			Ex08_Method t1 = new Ex08_Method();
			//객체를 밖에 선언하면 메서드에 저장된 값이
			//바뀌니까 안에다 선언해서 반복될 때 마다 새롭게 만든다
			System.out.println("이름 : ");
			t1.name = scan.next();
			
			System.out.println("국어 : ");
			t1.kor = scan.nextInt();
			
			System.out.println("영어 : ");
			t1.eng = scan.nextInt();
		
			System.out.println("수학 : ");
			t1.math = scan.nextInt();
			
			t1.sum = t1.kor + t1.eng + t1.math;
			t1.avg = (int)(t1.sum/3.0*10)/10.0;
			
			//학점
			if(t1.avg >=90) {
				t1.hak = "A";
			}else if (t1.avg >=80) {
				t1.hak = "B";
			}else if (t1.avg >=70) {
				t1.hak = "C";
			}else {
				t1.hak = "F";
			}
			
			t1.rank = 1;
			
			arr[i] = t1;
			
		}
		
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i].sum <= arr[j].sum) {
					arr[i].rank ++;
				}
			}
		}
		//정렬
		//임시저장
		Ex08_Method tmp = new Ex08_Method();
		
		//오름차순 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.println(arr[i].rank);
			
			
		}
		
	}

}
