package day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//BufferedWriter : newLine() => 줄바꿈기능
public class Ex04_witer_buffered {
public static void main(String[] args) {
	FileWriter fw = null;
	BufferedWriter bw = null;
	try {
		
		String pathname = "D:/ksj/ex02.txt";
		File file = new File(pathname);
		fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		//내용
		//String msg = "안녕하세요\n 1231\n Hello";
		bw.write("안녕하세요");
		bw.newLine();
		bw.write("123456789");
		bw.newLine();
		bw.write("HELLO");
		bw.flush();		 
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				bw.close();
			}catch(Exception e2) {
			}
		}

	}
}
