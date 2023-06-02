package day28.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//OutputStreamWriter : 바이트 스트림을 문자스트림으로 변경
//OutputStream(바이트스트림)=> OutputStreamWriter (거치면)=> BufferedWriter(문자스트림)로 사용가능

//InputStreamReader : 바이트 스트림을 문자스트림으로 변경
//InputStream => InputStreamWriter => BufferReader
public class Ex02_OutputStreamWriter {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			//System.out.println("원하는 문자 : ");//화면단으로 찍힘
			//모니터에 정보를 내보내자
			osw = new OutputStreamWriter(System.out); //바이트스트림
			bw = new BufferedWriter(osw); //거치면
			bw.write("원하는 문자 : ");//문자스트림
			bw.flush();
			
			//키보드를 통해 정보를 입력받기 =(scan)
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine(); //한줄씩읽음
			
			//받은 정보 출력
			bw.write("받은 문자 : " + msg);
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();	
			} catch (Exception e2) {
			}
		}
	}

}
