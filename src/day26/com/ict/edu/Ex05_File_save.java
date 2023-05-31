package day26.com.ict.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_File_save {
	public static void main(String filePath) {
		String pathname = filePath;
		File file = new File(pathname);
		FileOutputStream fos = null;
		String result = null;
		try {
			fos = new FileOutputStream(file);

			byte[] b = new byte[(int) file.length()];
			fos.write(b);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fos.flush();
			} catch (Exception e2) {

			}
		}
	}
}
