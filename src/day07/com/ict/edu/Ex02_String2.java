package day07.com.ict.edu;

public class Ex02_String2 {
	public static void main(String[] args) {
		
		//.7 getBytes() : byte[]
        //해당 문자열을 byte[]로 변환시킨다.
        //보통 입출력할 때 사용한다. (대/소문자, 숫자, 일부 특수문자만 가능(아스키 코드), 영어를 제외한 글자 안 됨)
        String a1 = "java";
        byte[] b1 = a1.getBytes();
        System.out.println(b1[0]); //j 숫자
        System.out.println(b1[1]); //a 숫자
        System.out.println(b1[2]); //v 숫자
        System.out.println(b1[3]); //a 숫자

        System.out.println("=======================");
        
        for (int i = 0; i < 4; i++) {
        	System.out.println(b1[i]);
        }//문자보려면? char 형 변환
        System.out.println("=======================");
        	
        //8. hashCode() : int
        // 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
        // String hashCode는 각 문자열에서 정수값으로 변경
        
        String a2 ="홍길동";
        System.out.println(a2.hashCode());
            	
        String a3 ="홍길동";
        System.out.println(a3.hashCode());
        System.out.println("=======================");
        
        //문자열일때 == 주소가 같냐?(String으로 쓰지마셈)
        System.out.println(a2 == a3);
        //문자열일때 equals(내용이 같냐?)
        System.out.println(a2.equals(a3));
        System.out.println("=======================");
        
        //9.indexOf(int ch),indexOf(String str) : int < - > charAt()
        //입력된 char, String을 해당 문자열에 char이나 String의 위치값을 알려준다.
        //찾는 문자나 문자열이 없으면 -1 반환
        String a4 = "BufferedReader";
        
        //앞 순서부터 찾아줌, 띄어쓰기도 찾음
        // 'R'을 찾아라
        System.out.println(a4.indexOf('R'));
        //'r'을 찾아라
        System.out.println(a4.indexOf('r'));
        //'K'를 찾아라
        System.out.println(a4.indexOf('K'));
        //"er"을 찾아라
        System.out.println(a4.indexOf("er"));
        System.out.println("=======================");
        
        //10. lastIndexOf(int ch), lastIndexOf(String str) : int
        //입력된 char, String를 해당 문자열에 char나 String의 마지막 위치값을 알려준다.
        System.out.println(a4.lastIndexOf('R'));
        //'r'을 찾아라
        System.out.println(a4.lastIndexOf('r'));
        //'K'를 찾아라
        System.out.println(a4.lastIndexOf('K'));
        //"er"을 찾아라
        System.out.println(a4.lastIndexOf("er")); //마지막
        System.out.println("=======================");
        
        
        
        //11. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
        //2번째 3번째 문자나 문자열 찾기 위함
        //fromIndex => 시작위치값
        a4 = "BufferedReader";
        System.out.println(a4.indexOf('e', 0)); //a.indexOf('e')와 와 같은내용
        
        //첫번째 'e'의 위치가 4로 나와서 5부터 시작
        System.out.println(a4.indexOf('e',5));
        System.out.println(a4.indexOf('e',a4.indexOf('e', 0) + 1)); //6
        
        //두번째 'e'의 위치는 6이 나왔으면 7부터 시작
        System.out.println(a4.indexOf('e',7));
        System.out.println(a4.indexOf('e',a4.indexOf('e',a4.indexOf('e', 0) + 1) +1));
        System.out.println("=======================");
        
        //12. length() : int => 문자열의 길이(개수) => 1부터 시작
        //						문자열의 위치(index) => 0부터
        System.out.println(a4.length());
        System.out.println("=======================");
        
        
        //13.replace(char oldchar, char newChar) : String
        //   replace(String oldStr, char newString) : String
        //새로운 문자나 문자열을 받아서 치환한다.
        
        String a5 = "대한민국";
        String a6 = a5.replace('한', '韓');
        String a7 = a5.replace("한", "한 ♥");
                
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println("=======================");
        
        
        //홍길동 
        //길이 = 3(개수) index = 0,1,2 (index는 0부터 시작)
        String a8 = "홍길동";
        String res = "";
        
        int t1 = a8.length();//길이만큼 반복
        
        for(int i = 0; i < t1; i++) { 
        	char a = a8.charAt(i); //한글자씩 끄집어냄
        	if(i==0 || i== t1-1) { //처음과 끝을 알수있다.?(길이와 자릿값은 1차이)
        		res += a; //a+"";이거도됨
        	}else { 
        		res += "*";
        	}
        }
        System.out.println(res);
        
        
        
        //전화번호 : 010-8544-3804 => 010-8544-****, 010-****-3804로 변경
        //끝번호 *만들기
        a8 = "010-8544-3804";
        int t2 = a8.length(); //길이만큼 돌아감
        int t3 = a8.lastIndexOf("-");
        res = "";
        for (int i = 0; i < t2; i++) {
        	char a = a8.charAt(i);//한개씩 뽑아냄
        	if(i>=0 && i<= t3) {
        		res += a;
        	}else {
        		res += "*";
        	}
        }
        System.out.println(res);
        
        //중간번호 *만들기
        a8 = "010-8544-3804";
        t2 = a8.length(); //길이만큼 돌아감
        t3 = a8.indexOf("-"); //첫번째 '-'
        int t4 = a8.lastIndexOf("-"); //두번째 '-'
        res = "";
        for (int i = 0; i < t2; i++) {
        	char a = a8.charAt(i);//한개씩 뽑아냄
        	if(i>=t3 +1 && i<= t4-1) {
        		res += "*";
        	}else {
        		res += a;
        	}
        }
        System.out.println(res);
        System.out.println("=======================");
                
        //14. isEmpty() : boolean
        //해당 문자열이 비어있으면 true,내용이 있으면 false
        String t5 = "HelloWorld";
        System.out.println(t5.isEmpty());
        
        t5="";
        System.out.println(t5.isEmpty());
        System.out.println("=======================");

        //15. split(String regex) : String[]
        //	  split(String regex, int limit) : String[]
        //regex = 구분자(나눌기준) 기준을주고 가져오는게 = split 
        //limit = 배열의 크기(방의 갯수) = limit가 없으면 알아서 ,로 자름
        t5 = "사과, 딸기, 망고, @ 오렌지, 두리안, 용과";
        String[] arr = t5.split(","); 
        //','로 방을 나눔 (방이 여러개면 방번호가 달림, 그게 index(0부터시작)
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);*/
        //for문을 사용해도 같은결과
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i]);
		}
        System.out.println("=======================");
        
        String[] arr2 = t5.split(",",3);//3으로 방크기 지정 
        for (int i = 0; i < arr2.length; i++) {
        	System.out.println(arr2[i]);
		}
        System.out.println("=======================");
        
        
        //16. substring(int beginIndex) : String
        //입력된 시작위치부터 끝까지 문자열 추출
        String t6 = "010-8544-3804";
        String t7 = t6.substring(4); //4하면 4가 시작위치 끝까지 출력(앞에는 자름)
        System.out.println(t7);
      
        //뒤에만 출력1
        t7 = t6.substring(9);
        System.out.println(t7);
        //뒤에만 출력1
        t7 = t6.substring(t6.lastIndexOf("-")+1);
        System.out.println(t7);
        System.out.println("=======================");
        
        //16-2 substring(int beginIndex, int endIndex) : String
        //beginIndex위치부터 endIndex위치까지 (endIndex 위치는 포함하지 않는다)
         t6 = "010-8544-3804"; //중간만 뽑겠다
         t7 = t6.substring(4, 8);
         System.out.println(t7);
         
         //첫글자 추출
         t7 = t6.substring(0, 1);
         System.out.println(t7);
         System.out.println("=======================");

         //010-8544-3804
         String t8 =  "010--8544-3804?";
         String t9 = "****";
         String t10 = t8.replace(t8.substring(4, 8), t9);
         System.out.println(t10);
	
         //t10 = t8.replace(t8.substring(t8.indexOf("-") +1,t8.lastIndexOf(",")),t9);
         //System.out.println(t10);
         
         t10 = t8.replace(t8.substring(t8.lastIndexOf("-") +1),t9);
         System.out.println(t10);
         
         String[] arr3 = t8.split("-");
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         
         System.out.println(arr[0]+"-****-" + arr3[2]);
         System.out.println(arr3[0]+"-" + arr3[1] + "-****");
         System.out.println("=======================");
         
         //17. toLowerCase() : String => 해당문자열을 모두 소문잘 변경
         //	   toUpperCase() : String => 해당문자열을 모두 대문잘 변경
        
        String str1 = "javaLand03Exam";
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
        	 char k = str1.charAt(i);
        	 //다 대문자 만들기
        	 //소문자 => 대문자 변경 (대문자와 소문자의 차이는 32)
        	 if(k>='a'&& k<='z') {
        		 str2 = str2+(char)(k-32);
        	 }else {       		 //나머지는 그대로 출력
        		 
        		 str2 = str2 + k;
        	 }
        	 
		}
        System.out.println(str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println("=======================");
        
        //18. toString : String
        // 객체(클래스)에서 toString : 모든 클래스(객체)에서 사용가능한 메소드
        //						  클래스(객체)가 가지고 있는 정보나 값(데이터)들을
        //						  문자열로 만들어서 반환하는 메소드
        //String에서의 toString : 문자열 자체 반환
        String u1 = "java 11 자바 11";
        String u2 = u1.toString();
        System.out.println(u1);
        System.out.println(u2);
        System.out.println("=======================");
        
        //19. trim() : String
        //해당 문자열의 앞, 뒤 공백 제거, 글자사이의 공백은 제거 못함
        String u3 = "  java  자바  JAVA  ";
        System.out.println("길이 : " + u3.length());
        System.out.println(u3);
        
        String u4 = u3.trim();
        System.out.println("길이 : " + u4.length());
        System.out.println(u4);
        System.out.println("=======================");
        
        //20. startsWith(String prefix) : boolean (prefix : 접두어 -> ~로 시작하자)
        //주어진 문자열로 시작하는지 검색 (문자 : char, 문자열 : String 서로 틀림)
        //startsWith(String prefix, int toffset) : boolean
        //주어진 문자로 시작하는지 검색, toffset =>시작위치
        //endsWith(String suffix) : boolean
        //주어진 문자로 끝났는지 검사

        String u5 = "java   자바   JAVA";
        //startsWith
        System.out.println(u5.startsWith("JAVA"));
        System.out.println(u5.startsWith("java"));
        System.out.println(u5.startsWith("자바"));
        System.out.println();
        //endsWith
        System.out.println(u5.endsWith("JAVA"));
        System.out.println(u5.endsWith("java"));
        System.out.println(u5.endsWith("자바"));
        System.out.println("=======================");
        
        //21. valueOf(기본자료형) : 들어온 기본자료형을 String으로 변경
        boolean bo1 = true;
        char ch1 = 'a';
        int num1 = 34;
        long num2 = 37L;
        double num3 = 345.127;
      
        System.out.println(bo1);
        System.out.println(ch1);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("=======================");
        
        //숫자형으로 변환?
        System.out.println(bo1);
        System.out.println(ch1+1);
        System.out.println(num1+1);
        System.out.println(num2+1);
        System.out.println(num3+1);
        System.out.println("=======================");
        
        //String(문자열)으로 바꾸기
        System.out.println(String.valueOf(bo1)+1);
        System.out.println(String.valueOf(ch1)+1);
        System.out.println(String.valueOf(num1)+1);
        System.out.println(String.valueOf(num2)+1);
        System.out.println(String.valueOf(num3)+1);
        System.out.println("=======================");
        
        //원래 자료형으로 돌려보내는 법
        //char는 자료변환없음 ?(char at있으니까)
        //22. Wrapper Class
        //기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스
        //22-1."true", 또는 "false" => true나 false로 바꾼다. : boolean.parseBoolean()
        String msg = "true";
        boolean msg2 = Boolean.parseBoolean(msg);
        System.out.println(msg);
        System.out.println(msg2);
        if(msg2) { 
        	System.out.println("변경1");
        }else {
        	System.out.println("변경2");
        }
        System.out.println("=======================");
        
        //문자형숫자를 진짜 숫자로 바꿔줌
        //22-2. "142", "25" => 142, 25 =>Integer.ParseInt
        msg = "142";
        int msg3 = Integer.parseInt(msg); //142
        System.out.println(msg +10); //14210 String이라 그냥 붙어버림
        System.out.println(msg3 +10); //152 숫자라 실제로 계산됨
        System.out.println("=======================");
        
        //22-3. "123123", "46456" => 123123, 456456 => Long.parseLong();
        //변경할 때 "숫자" => OK, "숫자L" => err
        msg = "13213132132132";
        long msg4 = Long.parseLong(msg);
        System.out.println(msg+9);
        System.out.println(msg4+9);
        System.out.println("=======================");
        
        //22-4 "347.457" => 347,457 => Double.parseDouble()	
        msg = "347.457";
        double msg5 = Double.parseDouble(msg);
        System.out.println(msg+0.04);
        System.out.println(msg5+0.04);
        System.out.println("=======================");
        
        //float사용할 경우
        msg = "347.457f";
        msg5 = Double.parseDouble(msg); //오류발생 안됨
        System.out.println(msg+1.04);
        System.out.println(msg5+1.04);
        System.out.println("*****************************");
        //22-5 Character.parseCharacter()는 존재하지 않음
        //String의 charAt() 이용하면 char를 가져올수 있다.
        msg = "p";
        char msg6 = msg.charAt(0);
        /////////////////////////char bytes, get bytes??
        msg = "java 자바 JAVA 大韓民國 2023 %*";
        //String.getBytes() => byte[] ( 영문자 대/소문자, 및 일부 특수문자만 가능)
        byte[] result = msg.getBytes();
        
        for (int i = 0; i < result.length; i++) { //입출력 통신용
        	System.out.println(result[i]+" : " + (char)(result[i]));
		}
        System.out.println("=======================");
        
        //String.tocharArray() => char[] : 모든 문자 처리 가능
        char[]	result2 = msg.toCharArray();
        
        for (int i = 0; i < result2.length; i++) { //입출력 통신용
        	System.out.println(result2[i]);
		}
        
        System.out.println("=======================");
        
        
        
	}

}
