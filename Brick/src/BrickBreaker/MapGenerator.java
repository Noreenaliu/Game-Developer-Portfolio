package BrickBreaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
	public int map[][];
	public int brickWidth;
	public int brickHeigh;
	public MapGenerator(int row,int col) {
		map= new int [row][col];
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				map[i][j]=1;
			}
		}
		brickWidth =540/col;
		brickHeigh =150/row;
	}
	public void draw(Graphics2D g) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;i<map.length;j++) {
			if (map[i][j]>0) {
				g.setColor(Color.white);
				g.drawRect(j= brickWidth+80,i=brickHeigh+50,brickWidth, brickHeigh);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.black);
				g.drawRect(j= brickWidth+80,i=brickHeigh+50,brickWidth, brickHeigh);
			}
		}
	}
}
public void setBrickVaule(int value,int row,int col) {
	map[row][col]=value;
	}
}
	
