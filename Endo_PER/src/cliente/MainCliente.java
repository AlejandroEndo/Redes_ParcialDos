package cliente;

import processing.core.PApplet;

public class MainCliente extends PApplet {

	Logica logica;

	@Override
	public void setup() {
		colorMode(HSB, 360, 100, 100);
		noStroke();
		smooth();
		textAlign(CENTER);
		size(500, 500);
		logica = new Logica(this);
	}

	@Override
	public void draw() {
		background(360);
		logica.pintar();

	}

}
