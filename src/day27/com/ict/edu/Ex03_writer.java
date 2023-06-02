package day27.com.ict.edu;

import java.io.File;
import java.io.FileWriter;

//FileOutputStream = > 1byte 처리, write(아스키코드), write(byte[b])
//FilWriter 	   = > 2byte 처리, write(string str);

public class Ex03_writer {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			
		String pathname = "D:/ksj/ex01.txt";
		File file = new File(pathname);
		fw = new FileWriter(file);
		//내뇬
		String msg = "안녕하세요\n 1231\n Hello";
		fw.write(msg);
		fw.flush();		 
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				fw.close();
			}catch(Exception e2) {
			}
		}
	}
}
