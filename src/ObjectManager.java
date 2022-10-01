import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {

	Rocketship rocket;
	ArrayList<Projectile> projectiles = new ArrayList<>();
	ArrayList<Alien> aliens = new ArrayList<>();
	Random rand = new Random();
	
	public ObjectManager(Rocketship newrocket) {
		
		rocket = newrocket;
		
	}
	
	void addProjectile(Projectile newprojectiles) {
		
		projectiles.add(newprojectiles);
		
	}
	
	void addAlien() {
		
		aliens.add(new Alien(rand.nextInt(LeagueInvaders.WIDTH),0,50,50));
		
	}
	
	void update() {
		
		for(int i=0;i<aliens.size();i++) {
			
			Alien e = aliens.get(i);
			e.update();
			
			if(e.y < 0 || e.y > 720) {
				e.isActive = false;
			}
			Projectile f = projectiles.get(i);
			f.update();
			
			if(f.y < 0 || f.y > 720) {
				f.isActive = false;
			}
			
		}
		
	}
	
	void draw(Graphics gr) {
		
		rocket.draw(gr);
		
		for(int i=0;i<aliens.size();i++) {
			Alien g = aliens.get(i);
			g.draw(gr);
		}
		
		for(int i=0;i<projectiles.size();i++) {
			Projectile h = projectiles.get(i);
			h.draw(gr);
		}
		
	}
	
	void purgeObjects() {
		
		for(int i=0;i<aliens.size();i++) {
			Alien g = aliens.get(i);
			if(g.isActive == false) {
				aliens.remove(g);
			}
		}
		for(int i=0;i<projectiles.size();i++) {
			Projectile h = projectiles.get(i);
			if(h.isActive == false) {
				projectiles.remove(h);
			}
		}
		
	}
	
}
