import java.awt.Rectangle;

public class GameObject {
	
	int x;
	int y;
	int width;
	int height;
	int speed;
	boolean isActive;
	Rectangle collisionBox;
	
	public GameObject(int newx, int newy, int newwidth, int newheight) {
		
		x = newx;
		y = newy;
		width = newwidth;
		height = newheight;
		
		speed = 0;
		isActive = true;
		
		collisionBox = new Rectangle(x, y, width, height);
		
	}
	
	void update() {
		
		collisionBox.setBounds(x, y, width, height);
		
	}
		
}
