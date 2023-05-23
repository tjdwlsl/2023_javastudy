package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main2 {

	
	    public static void main(String[] args) {
	        Ex09_Constructor name = new Ex09_Constructor("홍길동", 0, 0, 0);

	        Scanner scan = new Scanner(System.in);

	        Ex09_Constructor[] arr = new Ex09_Constructor[3];

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print("이름 : ");
	            String inputName = scan.next();

	            System.out.print("국어 : ");
	            int kor = scan.nextInt();

	            System.out.print("영어 : ");
	            int eng = scan.nextInt();

	            System.out.print("수학 : ");
	            int math = scan.nextInt();

	            Ex09_Constructor person = new Ex09_Constructor(inputName, kor, eng, math);

	            int sum = person.getKor() + person.getEng() + person.getMath();
	            person.setSum(sum);
	            double avg = (int) (sum / 3.0 * 10) / 10.0;
	            person.setAvg(avg);

	            if (avg >= 90) {
	                person.setHak("A학점");
	            } else if (avg >= 80) {
	                person.setHak("B학점");
	            } else if (avg >= 70) {
	                person.setHak("C학점");
	            } else {
	                person.setHak("F학점");
	            }

	            person.setRank(1);

	            arr[i] = person;
	        }

	        // 순위
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length; j++) {
	                if (i == j)
	                    continue;
	                if (arr[i].getSum() < arr[j].getSum()) {
	                    arr[i].setRank(arr[i].getRank() + 1);
	                }
	            }
	        }

	        // 정렬
	        // 임시저장
	        Ex09_Constructor tmp = new Ex09_Constructor("",0,0,0);

	        // 오름차순정렬
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
	            System.out.print(arr[i].getSum()+"\t");
				System.out.print(arr[i].getAvg()+"\t");
				System.out.print(arr[i].getHak()+"\t");
				System.out.println(arr[i].getRank());
	        }
	    }
	}


