package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	private Image screenImage;
	private Graphics screenGraphics;
	//���� ���۸� ����� ���� �ν��Ͻ� 
	
	private Image introBackground;
	//�̹����� ������� ��ü
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);//���Ƿ� ������ ���� ����
		setLocationRelativeTo(null);// ȭ�� ���߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����â ����� ��� ���� 
		//�̰� ������ ��׶��忡�� ��� ���ư� 
		setVisible(true);
		//����ȭ�鿡 ����ش޶�.
		introBackground = new ImageIcon(Main.class.getResource("../Images/introBackground.jpg")).getImage();
		//mainŬ������ ��ġ�� ������� �̹����� �������� �̹��� �޴� �ν��Ͻ��� ����?
	}
	public void paint(Graphics g) {
		//paint�� ���� ��ӵ� �޼ҵ� �ΰ���
		
		
		
	}

}
