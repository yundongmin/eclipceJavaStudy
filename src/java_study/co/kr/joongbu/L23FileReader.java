package java_study.co.kr.joongbu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L23FileReader {
	public static void main(String[] args) {
//		FileReader fr=null; // 문자열로 작성된 파일을 불러오는 객체
//		BufferedReader br = null;
		
		try(
				FileReader fr=new FileReader("./src/java_study/co/kr/jungbu/L20InputOutSteam.java");
				BufferedReader br=new BufferedReader(fr);
		){
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch ( IOException  e) {
			e.printStackTrace();
		} 
//		finally
//		{
//			try {
//				if(br!=null)br.close();
//				if(fr!=null)fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		catch (FileNotFoundException e) {e.printStackTrace();}	
		// 자식의 예외보다 부모의 예외가 먼저 있으면 절대로 실행되지 않는다.
		
		// Exception > IOException > FileNotFoundException
	}

}
