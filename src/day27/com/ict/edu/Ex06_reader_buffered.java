package day27.com.ict.edu;

import java.io.BufferedReader;
import java.io.FileReader;

//bufferedReader : readLine() : 한 줄씩 읽음, 더이상 읽을 수 없을 때 null;
public class Ex06_reader_buffered {
	public static void main(String[] args) {
		String pathname = "D:/ksj/ex01.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(pathname);
			br = new BufferedReader(fr);
			
			String msg = null;
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}

}
