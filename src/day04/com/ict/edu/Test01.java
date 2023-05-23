package day04.com.ict.edu;

public class Test01 {

	public static void main(String[] args) {
		//근무시간이 8시간까지는 시간당 9620원 이고
		//8시간을 초과한 시간 만큼은 1.5배 지급
		//현재 근무한 시간이 10시간
		//얼마받음?
		
		//실수
		//int ot = 8;
		//int p = 9620;
		//int w = 10;
		//double o = 1.5;
		//double won;
		
		//double won1 = p * w;
		//double won2 = p * ot + p * (w - ot) * o;
		//won = w <= 8 ? won1: won2;
		//System.out.println(won);
		
		//정수
        //int ti = 10;
        //int m = 9620;
        //int h = 8; 
        //double o =1.5;
        //int wh = 0; 
        //int gn =(m*ti);
        //wh =(m*h+(int)(m*(ti-h)*o));
        //wh = (ti>h) ? wh : gn;
        //System.out.println(wh+"원");
        
        
       int time = 10; //변할 수 있는거
       int dan = 9620;
       //출력
       int pay = (time > 8) ? (8 * dan) + (int)((time - 8)*dan*1.5) : time * dan ;
       System.out.println("결과 : " + pay);
       
      
       
       //숫자비교
       int num1 = 47;
       int num2 = 52;
       int res = (num1 > num2 ) ? num1 : num2 ;
       System.out.println("더 큰 값은 : " + res);
       //
       res = (num1 - num2 > 0 ) ? num1 : num2 ;
       System.out.println("더 큰 값은 : " + res);
       
       //math.max
       //math 클래스에 있는 메소드 10개 조사하기
       //max, min 제외
       int res2 = Math.max(num1, num2);
       System.out.println("큰 값 : " + res2);
       
       //절댓값 (음수인지 양수인지를 구분)(양수여도 양수, 음수여도 양수)
       int res3 = -38;
       int res4 = (res3 > 0) ? res3 : res3*-1 ;
       System.out.println("큰 값 : " + res4);
       
       //Math 사용
       int res5 = Math.abs(res3);
       System.out.println("큰 값 : " + res5);
      
       
       
	
	
	
	}

}
