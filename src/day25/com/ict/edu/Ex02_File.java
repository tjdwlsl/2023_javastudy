package day25.com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex02_File {
	public static void main(String[] args) {
		String pathname = "D:/ksj/exam01.txt";
		File file = new File(pathname);
		try {
			boolean res = file.createNewFile();
			if(res) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패 (기존에 같은 이름에 파일이 존재)");
			}
			System.out.println("=======================");
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("상대경로 : " + file.getPath());
			System.out.println("파일이름 : " + file.getName());
			System.out.println("=======================");
			
			//방법2
			//위에 String pathname을 한줄로 합침
			//위에도 종종쓰임(둘다 외우기)
			File file2 = new File("D:/ksj/EXAM/AAA"); 
			//중간에 하나라도 없으면 만들어지지 않음
			//boolean res2 = file2.mkdir();
			//중간에 디렉토리가 엇ㅂ어도 만들어짐
			boolean res2 = file2.mkdirs();
			if(res) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패(기존에 같은 이름의 디렉토리 존재)");
			}
			System.out.println("==");
			
			//파일삭제
			pathname = "D:/ksj/exam01.txt";
			File file3 = new File(pathname);
			boolean res3 = file3.delete();
			if(res3) {
				System.out.println("파일삭제 성공");
			}else {
				System.out.println("파일삭제 실패");
			}
			System.out.println("=====================");
			
			//디렉토리 삭제
			File file4 = new File("D:/ksj/EXAM/AAA");
			boolean res4 = file4.delete();
			if(res4) {
				System.out.println("디렉토리삭제 성공");
				File file5 = new File("D:/ksj/EXAM");
				boolean res5 = file5.delete();
				if(res5) {
					System.out.println("디렉토리 EXAM 삭제 성공");
				}else {
					System.out.println("디렉토리 EXAM 삭제 실패");
				}
			}else {
				System.out.println("디렉토리 AAA 삭제 실패");
			}
			System.out.println("=====================");
			
			
			
		} catch (IOException e) {
			System.out.println("위치가 틀렸습니다.");
		}
		
	}

}
