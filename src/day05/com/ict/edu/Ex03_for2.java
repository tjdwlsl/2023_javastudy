package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		//중첩 for문 : for문안에 또다른 for문
		//?
		for (int i = 1; i <4; i++) {
			System.out.println("실행문 - 1:");
			for (int j = 1; j <6; j++) { //윗줄에 i가 선언되어씩 때문0
				System.out.println("i = " + i + ", j =" + j);
				}//안쪽 for문
		}System.out.println(":실행문 -2");
		
		
		//구구단
		/*for (int i = 2; i <10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j< 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			
		}*/
		//구구단 가로
		for (int i = 2; i <10; i++) {
			System.out.println();
			System.out.println(i + "단");
			
			for (int j = 1; j< 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j)+" ");
	
	}

}
		//구구단 세로
		for (int i = 1; i <10; i++) {
			
			System.out.println("\n" + i + "단");
			
			for (int j = 2; j< 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j)+" ");
				
			}
			
		}
		
		
	}
}
