
public class GameObject {
	
	int x;
	int y;
	int width;
	int height;
	int speed;
	boolean isActive;
	
	public GameObject(int newx, int newy, int newwidth, int newheight) {
		
		x = newx;
		y = newy;
		width = newwidth;
		height = newheight;
		
		speed = 0;
		isActive = true;
		
	}
	
	void update() {
		
	}
		
}
