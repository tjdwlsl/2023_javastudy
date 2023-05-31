package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//D:/ksj/test01.txt 읽어서 D:/ksj/test02.txt 내용 추가
public class Ex03_File_IO {
	public static void main(String[] args) {
		String pathname = "D:/ksj/test01.txt";
		String pathname1 = "D:/ksj/test02.txt";
		File file = new File(pathname);
		File file1 = new File(pathname1);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file1,true);
			bos = new BufferedOutputStream(bos);
			
			//모든 파일의 복사, 이동은 해당 방식으로 해야함
			//이게 기본? 이거쓴느거 추천
//			int b = 0;
//			while(b = bis.read()) != -1	{
//				bos.write(b);
//			}
//			
			byte[] b = new byte[(int) file.length()];
			fis.read(b);
			fos.write(b);
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}		
	}
}
