package Game;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player {
	JLabel player = new JLabel();
	public Player() {
		player.setSize(50, 50);
		player.setLocation(500, 825);
	}
	
	public void MoveUpW() {
		player.setLocation(player.getX(), player.getY() - 5);
	}
	public void MoveLeftA() {
		player.setLocation(player.getX() - 5, player.getY());
	}
	public void MoveDownS() {
		player.setLocation(player.getX(), player.getY() + 5);
	}
	public void MoveRightD() {
		player.setLocation(player.getX() + 5, player.getY());
	}
	
	public JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
