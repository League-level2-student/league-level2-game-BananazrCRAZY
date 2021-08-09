package Game;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dogeball implements ActionListener, KeyListener, MouseListener {
	JFrame startScreen = new JFrame();
	JFrame game = new JFrame();
	JPanel p = new JPanel();
	JLabel title = new JLabel("DOGEBALL");
	JButton play = new JButton("PLAY");
	JButton exit = new JButton("EXIT");
	
	JFrame gameF = new JFrame();
	JLabel ball = new JLabel();
	Player player = new Player();
	Enemy enemyl1e1 = new Enemy();
	
	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	public static void main(String[] args) {
		Dogeball db = new Dogeball();
	}
	
	public Dogeball() {
		startScreen.setVisible(true);
		startScreen.setDefaultCloseOperation(startScreen.EXIT_ON_CLOSE);
		startScreen.getContentPane().setPreferredSize(new Dimension(1000, 1000));
		startScreen.add(p);
		
		gameF.addKeyListener(this);
		gameF.addMouseListener(this);
		gameF.getContentPane().setPreferredSize(new Dimension(1000, 1000));
		
		play.addActionListener(this);
		exit.addActionListener(this);
		
		p.add(title);
		p.add(play);
		p.add(exit);
		startScreen.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == exit) {
			System.exit(0);
		}
		if (e.getSource() == play) {
			PlayLvl1();
		}
		if ((ball.getX() == player.player.getX()) && (ball.getY() == player.player.getY())) {
			JLabel gameover = new JLabel("GAMEOVER");
			p.add(gameover);
		}
		if ((ball.getX() == enemies.getX()) && (ball.getY() == enemies.getY())) {
			JLabel gameover = new JLabel("GAMEOVER");
			p.add(gameover);
		}
	}
	
	public void PlayLvl1() {
		gameF.dispose();
		startScreen.dispose();
		p.removeAll();
		gameF.setVisible(true);
		gameF.setDefaultCloseOperation(gameF.EXIT_ON_CLOSE);
		gameF.add(p);
		
		enemyl1e1.Enemy(500, 175, 10);
		p.add(player.player);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == 119) {
			//w
			player.MoveUpW();
		}
		if (e.getKeyCode() == 97) {
			//a
			player.MoveLeftA();
		}
		if (e.getKeyCode() == 115) {
			//s
			player.MoveDownS();
		}
		if (e.getKeyCode() == 100) {
			//d
			player.MoveRightD();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}

