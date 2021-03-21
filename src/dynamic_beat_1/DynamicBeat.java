package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	
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
		
		
		
	}

}
