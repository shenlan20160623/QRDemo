package com.hellokitty;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelToDisplayPic extends JPanel{
	
	private Image image;
	 	 
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public PanelToDisplayPic(){
	  image=new ImageIcon("1").getImage();
	  
	  this.setPreferredSize(new Dimension(image.getWidth(this),image.getHeight(this)));
	 }
		 
	 public void paint(Graphics g){
	  g.drawImage(image,0,0,image.getWidth(this),image.getHeight(this),0,0,image.getWidth(this),image.getHeight(this),this);
	 }
} 


