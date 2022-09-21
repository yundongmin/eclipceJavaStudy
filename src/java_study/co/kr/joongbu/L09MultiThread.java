package java_study.co.kr.joongbu;

import java.time.LocalTime;
import java.util.Scanner;

 class Clock implements Runnable {
	// 스레드로 생성할 코드 작성
	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class L09MultiThread {
	public static void main(String[] args) {
		System.out.println("첫번째");
		System.out.println("두번째");
		System.out.println("세번째");
		
		Clock clock=new Clock();	
		// Thread의 매개변수 타입을 Runnable로 제한(타입의 명확한 언어의 특징)
		// 타입이 명확한 객체지향 언어의 장점과 단점
		// 장점 : 매개변수의 타입이 명확해서 오류가 발생하지 않는다.
		// 단점 : 번거롭다. (상속 구현 => 객체생성 => 매개변수 사용)
		// 단점 극복 1 : 인터페이스를 익명 클래스로 구현
		// 단점 극복 2 : 람다식 사용  (추상메서드가 1개만 있는 인터페이스)
		Thread clockTread=new Thread(clock);	// Thread : 스레드를 run()에 작성된 코드를 생성하는 객체
		clockTread.start(); // start() : 스레드 생성하는 함수 
		
		System.out.println("네번째");
		Scanner scanner=new Scanner(System.in);
		while(true) {
			String line=scanner.nextLine();
			System.out.println("당신이 입력한 값: "+ line);
		}
	}
}
