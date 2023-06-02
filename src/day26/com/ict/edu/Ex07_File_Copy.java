package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07_File_Copy {
	public static void main(String filePath, String text) {
		String pathname = filePath;
		String pathname1 = filePath;
		
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
			
			String str = text;
			byte[] b = str.getBytes();
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
