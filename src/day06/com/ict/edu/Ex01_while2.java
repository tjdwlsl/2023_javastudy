package day06.com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
		//절차지향코딩(순차적으로 내려가면서 실행하는 코딩)
		//구구단 -1
		int i = 2;
		while (i<10) {
			int j =1; //while문 위에있는 i랑 겹침
			while (j<10) {
				System.out.println(i + "*" + j + "=" + (i*j));
				j++;
			}
			i++;
		}
		System.out.println("===============================");
		
		//구구단 -2
		i = 2;
		while (i<10) {
			int j =1; //while문 위에있는 i랑 겹침
			while (j<10) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
				j++;
			}
			System.out.println(); //위쪽의 1~9까지 돌고 내려와서 줄바꿈
			i++;
		}
		System.out.println("===============================");
		
		//구구단 -3
		i = 1;
		while (i<10) {
			int j = 2;
			while (j<10) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
				j++;
				
			}
			System.out.println();
			i++;
			
		}
		
		
	}

}
