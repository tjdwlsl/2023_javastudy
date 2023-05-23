package day03.com.ict.edu2;

// import java.util.Scanner;
//Scanner scanner = new Scanner(System.in); 밑으로 넣기
//System.out.print("초를 입력하세요:");
//int time = scanner.nextInt();
//int hour = time/(60*60);
//int minute = time/60;
//int second = time%60;
//System.out.println(time +"초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");
//scanner.close();

public class Test03 {
	public static void main(String[] args) {
		//3989초는 몇시간, 몇 분, 몇 초 인가?
		int time = 3989; //주어진 정보
		
		//?왜0?
		int h = 0; //시
		int m = 0; //분
		int s = 0; //초
		int res = 0; //구한 나머지
		
		//1시간 3600초
		h = time / (60*60); // -> 1 //나눈 나머지도 구해야함 //int라 소수점 안나옴
		res = time % (60*60); // ->389 -> 또나눠야함 분구해야지
		
		m =  res / 60; //분
		s = res % 60; //초
		
		
		
	}
	
}

	