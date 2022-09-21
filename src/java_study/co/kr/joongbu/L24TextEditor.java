package java_study.co.kr.joongbu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
class TextEditor extends JFrame {
	JTextArea ta;
	JMenuBar mb;
	JMenu menu;
	JMenuItem miNew, miOpen, miSave, miExit;
	public TextEditor() {
		super("텍스트 편집기"); // super: 부모 접근 지정자 super(): 부모의 생성자 호출
		ta=new JTextArea();
		mb=new JMenuBar();
		menu=new JMenu();
		miNew=new JMenuItem("새로 만들기");
		miOpen=new JMenuItem("열기");
		miSave=new JMenuItem("저장");
		miExit=new JMenuItem("끝내기");
		menu.add(miNew);
		menu.add(miOpen);
		menu.add(miSave);
		menu.add(miExit);
		mb.add(menu);
		// this.add(mb);
		this.setJMenuBar(mb);
		this.add(ta);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		miOpen.addActionListener((e)->{
			JFileChooser fileChooser=new JFileChooser();
			int option=fileChooser.showOpenDialog(this);
			if(option==JFileChooser.APPROVE_OPTION) {	// 파일이 선택되면
				File file=fileChooser.getSelectedFile();
				try {
					Scanner scanner =new Scanner(file);
					while(scanner.hasNext()) {
						String line=scanner.next();	// 문자열을 받아온다.
						System.out.println(line);
						ta.append(line+"\n");
					}
						
 					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.showOpenDialog(this);
	}
}

public class L24TextEditor {
	public static void main(String[] args) {
		TextEditor editor=new TextEditor();
		editor.setBounds(200, 1, 400, 400);
		editor.setVisible(true);
	}
}
