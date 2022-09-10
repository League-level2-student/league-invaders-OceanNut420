import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font insFont;
    Timer frameDraw;
    Rocketship r = new Rocketship(250,700,50,50);
	
    public GamePanel() {
    	
    	titleFont = new Font("Arial", Font.PLAIN, 48);
    	insFont = new Font("Arial", Font.PLAIN, 24);
    	frameDraw = new Timer(1000/60, this);
    	
        frameDraw.start();
    	
    }
    
	@Override
	public void paintComponent(Graphics g){

		if(currentState == MENU){
		    drawMenuState(g);
		}
		else if(currentState == GAME){
		    drawGameState(g);
		}
		else if(currentState == END){
		    drawEndState(g);
		}
		
	}
	
	void updateMenuState() { 
		
	}
	
	void updateGameState() { 
		
	}
	
	void updateEndState()  { 
		
	}

	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	
	void drawMenuState(Graphics g) { 
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 25, 100);
		
		g.setFont(insFont);
		g.drawString("Press ENTER to start", 135, 400);
		g.drawString("Press SPACE for instructions", 100, 550);
		
	}
	
	void drawGameState(Graphics g) { 
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);

		r.draw(g);
		
	}
	
	void drawEndState(Graphics g)  { 
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);

		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Game Over", 120, 100);
		
		g.setFont(insFont);
		g.drawString("You killed enemies", 145, 400);
		g.drawString("Press ENTER to restart", 120, 550);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		
		//System.out.println("action");
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}   
		
		if(currentState == 1) {
		if (arg0.getKeyCode()==KeyEvent.VK_UP) {
		    System.out.println("UP");
		}
		
		if (arg0.getKeyCode()==KeyEvent.VK_DOWN) {
		    System.out.println("DOWN");
		}
		
		if (arg0.getKeyCode()==KeyEvent.VK_LEFT) {
		    System.out.println("LEFT");
		}
		
		if (arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
		    System.out.println("RIGHT");
		}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
