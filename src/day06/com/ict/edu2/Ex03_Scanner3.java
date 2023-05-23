package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//근무시간 8시간까지는 시간당 9620이고
		//8시간을 초과한 시간만큼 1.5배 ㅈ지급
		//현재 근무시간 10
		//얼마 받?
		System.out.println("근무시간 :");
		int time = scan.nextInt();
		int dan = 9620;
		int pay =0;
		if (time > 8) {
			pay = (8*dan) + (int)((time-8)*dan*1.5); //실수라 int 캐스팅
		} else {
			pay = time * dan;
		}
		System.out.println("금액 : " + pay);
			
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         int menu = scan.nextInt();
         int dan2 = 0; //매뉴가 정해져야 단가가 정해짐.
         String drink = "";
         int total = 0;
         int vat = 0;
         int in = 10000;
         int out = 0;
         int su =2;
         
         if(menu == 1) {
        	 dan2 = 3500;
        	 drink = "카페모카";
        	}else if (menu ==2) {
        		dan2 = 4000;
        		drink = "카페라떼";
        	}else if (menu ==3) {
        		dan2 = 3500;
        		drink = "아메리카노";
        	}else if (menu == 4) {
        		dan2 = 3500;
        		drink = "과일주스";
        	}
         	total = dan2 *su;
         	vat = (int)(total*0.1); //왼쪽을 기준으로 vat가 int니까 형변환
         	out = in - (total + vat);
         	System.out.println("잔돈은 : " + out);
         
       //나라를 입력하면 수도가 출력되게 하자
       //한국 = 서울, 중국 = 베이징, 일본 = 도쿄, 미국 = 워싱턴, 외에는 없음
       //없음은 switch case로 해야함
 		System.out.println("나라이름 : ");
 		String country = scan.next();
 		String str ="";
 		switch (country) {
			case "한국":
				str = "서울";
				break;
			case "중국":
				str = "베이징";
				break;
			case "일본":
				str = "도쿄";
				break;
			case "미국":
				str = "워싱턴";
				break;	
	
			default: str = "없음";
				break;
		}
 		System.out.println(country + " 수도는 " + str +" 입니다. ");
		System.out.println("=======================");
		
 		
	}

}
