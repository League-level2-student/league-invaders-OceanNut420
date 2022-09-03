import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font insFont;
	
    public GamePanel() {
    	
    	titleFont = new Font("Arial", Font.PLAIN, 48);
    	insFont = new Font("Arial", Font.PLAIN, 24);
    	
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

		
	}
	
	void drawEndState(Graphics g)  { 
		
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);

		
	}
	
}
