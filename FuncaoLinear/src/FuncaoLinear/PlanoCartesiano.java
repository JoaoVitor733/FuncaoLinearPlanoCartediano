package FuncaoLinear;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PlanoCartesiano extends JPanel {
	
	private int a,b,a1,b1,a2,b2,y;

	
	public PlanoCartesiano(int y []){ 
		  a = y[1]; // x = -1
		  b = y[0]; // x = 1
		  a1 = y[3]; // x = -2
		  b1 = y[2]; // x = 2
		  a2 = y[9]; // x = -5
		  b2 = y[8];  // x = 5
		  this.y = y[10]; // valor b
	}
	
	public void paint(Graphics g) {
		//eixo Y
		g.drawLine(200, 0, 200, 400);
		//eixo x
	    g.drawLine(0, 200, 400, 200);
	    
	    //cor da malha
	    g.setColor(Color.LIGHT_GRAY);
	    
	    //criando a malha
	    for(int i = 0; i < 400;i+=40) {
	    	for(int j = 0; j <400;j+=40) {
	    		g.drawRect(i, j, 40, 40);
	    	}
	    }
	   
	    // cor dos pontos
	    g.setColor(Color.blue);
	    
	    //colocando pontos no eixo x e y
	    for(int i=0; i < 400;i+=40) {
	    	if(i!=200)
	    	g.fillRect(198, i, 3, 3);
	    	g.fillRect(i, 198, 3, 3);
	    }
	    
	    //cor da reta
	    g.setColor(Color.magenta);
	    g.drawLine(200, y, 160, a); //linha do ponto B até x = -1
	    g.drawLine(200, y, 240, b); //linha do ponto B até x = 1
	    g.drawLine(160, a, 120, a1); //linha do x = -1 ate x = -2
	    g.drawLine(240, b, 280, b1); //linha do x = 1 ate x = 2
	    g.drawLine(120, a1, 0, a2);  //linha do x = -2 ate x = -5
	    g.drawLine(280, b1, 400, b2); //linha do x = 2 ate x = -5
	}

}
