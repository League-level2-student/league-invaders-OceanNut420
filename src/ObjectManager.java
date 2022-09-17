import java.util.Random;

public class ObjectManager {

	int rocket;
	int[] projectiles = {};
	int[] aliens = {};
	Random rand = new Random();
	
	public ObjectManager(int newrocket) {
		
		rocket = newrocket;
		
	}
	
	void addProjectile(int[] newprojectiles) {
		
		projectiles = newprojectiles;
		
	}
	
	void addAlien() {
		
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
		
	}
	
}
