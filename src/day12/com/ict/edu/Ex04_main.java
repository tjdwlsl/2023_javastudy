package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		// 5명의 이름, 국어,영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력

		Scanner scan = new Scanner(System.in);
		// Ex08_Method로 만들어진 객체만 저장하는 배열(객체형 배열 = 참조자료형 배열)
		// 클래스를 자료형으로 사용(int[])
		// int[] k1 = new int[];
		Ex04_get_set[] arr = new Ex04_get_set[5];
		for (int i = 0; i < arr.length; i++) {
			Ex04_get_set t1 = new Ex04_get_set();
			// 객체를 밖에 선언하면 메서드에 저장된 값이
			// 바뀌니까 안에다 선언해서 반복될 때 마다 새롭게 만든다
		
			System.out.println("이름 : ");
			t1.setName(scan.next());

			System.out.println("국어 : ");
			t1.setKor(scan.nextInt());
			
			//방법2
			//System.out.println("국어 : ");
			//int kor = scan.nextInt();
			//t1.setKor(kor);

			System.out.println("영어 : ");
			t1.setEng(scan.nextInt());

			System.out.println("수학 : ");
			t1.setMath(scan.nextInt());

			t1.setSum(t1.getKor() + t1.getEng() + t1.getMath());
			t1.setAvg((int) (t1.getSum() / 3.0 * 10) / 10.0);

			// 학점
			if (t1.getAvg() >= 90) {
				t1.setHak("A");
			} else if (t1.getAvg() >= 80) {
				t1.setHak("B");
			} else if (t1.getAvg() >= 70) {
				t1.setHak("C");
			} else {
				t1.setHak("F");
			}

			t1.setRank(1);

			arr[i] = t1;

		}

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].getSum() <= arr[j].getSum()) {
					
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		// 정렬
		// 임시저장
		Ex04_get_set tmp = new Ex04_get_set();

		// 오름차순 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());

		}

	}

}
