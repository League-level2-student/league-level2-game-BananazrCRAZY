package Game;

import javax.swing.JLabel;

public class Enemy {
	JLabel enemy = new JLabel();
	public void Enemy(int x, int y, double speed) {
		enemy.setSize(50, 50);
		enemy.setLocation(x, y);
	}
}
