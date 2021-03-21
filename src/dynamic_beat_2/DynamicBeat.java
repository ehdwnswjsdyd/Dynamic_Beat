package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	private Image screenImage;
	private Graphics screenGraphics;
	//더블 버퍼링 기술을 위한 인스턴스 
	
	private Image introBackground;
	//이미지를 담기위한 객체
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//임의로 사이즈 조절 못함
		setLocationRelativeTo(null);// 화면 정중앙에 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//게임창 종료시 모두 종료 
		//이게 없으면 백그라운드에서 계속 돌아감 
		setVisible(true);
		//바탕화면에 출력해달라.
		introBackground = new ImageIcon(Main.class.getResource("../Images/introBackground.jpg")).getImage();
		//main클래스의 위치를 기반으로 이미지를 가져오고 이미지 받는 인스턴스로 정돈?
	}
	public void paint(Graphics g) {
		//paint는 거의 약속된 메소드 인가봐
		
		
		
	}

}
