package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
	
	private double x;
	private double y;
	private double velX;
	private double velY;
	
	private BufferedImage player;
	
	public Player(double x, double y, Game game){
		this.x = x;
		this.y = y;
		
		SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
		try {
			player = ImageIO.read(getClass().getResource("/sprite_player.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void tick(){
		x += velX;
		y += velY;
	}
	
	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

	public void render(Graphics g){
		g.drawImage(player, (int)x, (int)y, null);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
