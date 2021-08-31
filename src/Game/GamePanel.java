package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU = 0;
	final int GAME = 1;
	final int GAMEOVER = 2;
	final int VICTORY = 3;
	final int PAUSE = 4;
	final int INSTRUCTIONS = 5;
	
	int currentState = 0;
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;
	GamePanel() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == GAMEOVER){
		    drawGameoverState(g);
		} else if (currentState == VICTORY){
			drawVictoryState(g);
		} else if (currentState == PAUSE){
			drawPauseState(g);
		} else if (currentState == INSTRUCTIONS) {
			drawIntructionsState(g);
		}
	}
	
	void updateMenuState() {
		
	}
	void updateGameState() {
		
	}
	void updateGameoverState() {

	}
	void updateVictoryState() {
		
	}
	void updatePauseState() {
		
	}
	void updateInstruState() {
		
	}
	
	void drawMenuState(Graphics g) {
		
	}
	void drawGameState(Graphics g) {
		
	}
	void drawGameoverState(Graphics g) {
		
	}
	void drawVictoryState(Graphics g) {
		
	}
	void drawPauseState(Graphics g) {
		
	}
	void drawIntructionsState(Graphics g) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
}
