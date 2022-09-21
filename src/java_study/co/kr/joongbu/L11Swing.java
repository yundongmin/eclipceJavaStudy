package java_study.co.kr.joongbu;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class L11Swing {
	public static void main(String[] args) {
		// Frame awt -> JFrame Swing GUI를 제공하는  객체
		// java : 플랫폼 (os) 에 독립적이다. => 모든 os에서 비슷하게 제공하는 객체를 생성
		JFrame frame = new JFrame("swing frame");
		JButton btn = new JButton("버튼 component");
		JButton btn2 = new JButton("버튼2 component");
		// frame은 기본 레이웃(BorderLayout) 이 지정되어 있다.
		//frame.add(btn, BorderLayout.CENTER);
		//frame.add(btn2, BorderLayout.NORTH);
		//frame.setBounds(100, 100, 300, 100);
		frame.setLayout(null);		// 레이아웃을 없애면 위치나 크기로 컴포넌트(버튼)의 위치를 지정할 수 있다.
		btn.setBounds(0, 0, 100, 80);	// frame에 존재할 위치와 크기 지정
		btn2.setBounds(150, 0, 100, 80);	
		frame.add(btn);
		frame.add(btn2);
		frame.setBounds(100, 100, 300, 100); // 프레임의 화면 위치
		frame.setVisible(true);
		
	}

}
