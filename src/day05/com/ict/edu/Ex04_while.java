package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		//while문 : for문과 같은 반복문
		//형식1) 
		//		초기식;
		//		while(조건식){
		//			조건식이 참이면 실행할 문장;
		//			조건식이 참이면 실행할 문장;
		// 			증감식;
		//	}
		//	while 문의 끝을 만나면 조건식으로 간다.
		
		//형식2)
		//		초기식;
		//		while(true){    //참이라 무조건 실행 무한반복됨
		//			if(빠져나갈 조건){
		//				break; 
		//			}				무한반복을 막기위해
		//			조건식이 참이면 실행할 문장;
		//			조건식이 참이면 실행할 문장;
		// 			증감식;
		//	
		//}
		//	while 문의 끝을 만나면 조건식으로 간다.
		
		//1 ~ 10까지 출력
		int i = 1;
		while (i < 11) { 
			System.out.println("i = " + i);
			i++;
			
		}
		System.out.println("==============================");
		
		//형식2)
		//int i =1; 안쪽에아닌 바깥쪽에 선언되서 못씀
		//i =으로 변경
		i = 1;
		while(true) {
			if(i>=11) break; //true일때 반대
							 //조건이 커서 false일때 빠져나가게 해야함
			System.out.println("i = " + i);
			i++;
			
		}
		
		
		//0~10까지 짝수 출력
		i = 0;
		while(i<11) {
			if(i%2==0) {
			System.out.println(i);
		}
		i++;
	}
		
		//구구단 중 7단 출력
		i = 1;
		
		while(i<10) {
			System.out.println(i*7);
			//System.out.println("7* " + i + "=" + (7*1));
			i++;
		}
		
		// 1-10 누적합 (합계 구하기)
		i = 1;
		int sum = 0;
		while(i<11) {
			sum = sum + i;
			i++;			
		}
		System.out.println("sum= : " + sum);
		
		
		//0000
		//0000
		//0000
		//0000
		//4의 배수로도 볼 수 있다.
		
		/*System.out.println("0 0 0 0");
		System.out.println("0 0 0 0");
		System.out.println("0 0 0 0");
		System.out.println("0 0 0 0");
		*/
		
		/*
		int i = 1;
        int j = 1;
        int input = 5;
        while(i < input) {
            j = 1;
            while(j < input) {
                System.out.print(" 0");
                j++;
            }
            System.out.println();
            i++;
        }
        
        
		
	
		
		/*i = 0;
		while (i < 4) {
		int j = 0;
		while (j < 4) {
		System.out.print("0" + " ");
		j++;
		        }
		System.out.println(" ");
		i++;
		        }*/
		i=1;
		while(i<5) {
			System.out.println("0 0 0 0");
			i++;	
		}
		
		i=1; //4의 배수로보면 편함
		while(i<17) {
			System.out.print("0");
			if(i%4==0) {
				System.out.println();
			}
			i++;	
		}
		
		
		
		
		
		
	}

}
