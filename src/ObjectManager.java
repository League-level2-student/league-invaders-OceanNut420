import java.util.Random;

public class ObjectManager {

	Rocketship rocket;
	Projectile[] projectiles = {};
	Alien[] aliens = {};
	Random rand = new Random();
	
	public ObjectManager(Rocketship newrocket) {
		
		rocket = newrocket;
		
	}
	
	void addProjectile(Projectile[] newprojectiles) {
		
		projectiles = newprojectiles;
		
	}
	
	void addAlien() {
		
		aliens[].add(new Alien(rand.nextInt(LeagueInvaders.WIDTH),0,50,50));
		
	}
	
	void update() {
		
		for(int i=0;i<aliens.length;i++) {
			
			aliens[i].update();
			
			if(aliens[i].y < 0 || aliens[i].y > 720) {
				aliens[i].isActive = false;
			}
			
		}
		
	}
	
}
