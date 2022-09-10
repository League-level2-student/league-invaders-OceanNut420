import javax.swing.JFrame;

public class LeagueInvaders {
	
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	GamePanel GP;
	JFrame frame;
	
	public static void main(String[] args) {
		
		LeagueInvaders LI = new LeagueInvaders();
		LI.setup();
		
	}
	
	public LeagueInvaders() {
		frame = new JFrame();
		GP = new GamePanel();
		
	}
	
	void setup() {
		frame.add(GP);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(GP);
		
	}
	
}
