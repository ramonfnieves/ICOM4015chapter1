import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9032539863554018689L;
	int counter = 0;

	public void paintComponent(Graphics g){
		
		MutableCar topLeftCar = new MutableCar(0,0, Color.CYAN);
		/*Espacio vs Tiempo
		 * 
		 * Car bottomRightCar = new Car(getWidth()-60, getHeight()-30);
		Car topRightCar = new Car(getWidth()-60, 0);
		Car bottomLeftCar = new Car(0, getHeight()-30);*/
		
		topLeftCar.setColor(Color.GREEN);
		topLeftCar.draw(g);
		topLeftCar.setPosition(0, getHeight()-30);
		topLeftCar.setColor(Color.BLUE);
		topLeftCar.draw(g);
		topLeftCar.setPosition(getWidth()-60, 0);
		topLeftCar.setColor(Color.RED);
		topLeftCar.draw(g);
		topLeftCar.setPosition(getWidth()-60, getHeight()-30);
		topLeftCar.setColor(Color.ORANGE);
		topLeftCar.draw(g);
		
	/*	Espacio vs Tiempo
	 * 
	 * bottomRightCar.draw(g);
		topRightCar.draw(g);
		bottomLeftCar.draw(g);*/
		
		System.out.println(counter++);
	}
}
