/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class Triangulo extends Polygon {

    public Color color = null;
    public boolean relleno = false;

    public Triangulo(int _posX, int _posY, int _altura, Color _color, boolean _relleno) {
	npoints = 3;
	//Asigna las coordenadas del primer punto del triangulo (X0 Y0)
	xpoints[0] = _posX;
	ypoints[0] = _posY;

	//Asigna los valores para Y iguales a la altura
	ypoints[1] = _posY + _altura;
	ypoints[2] = _posY + _altura;

	//Calcualamos la mitad de la base
	int mediaBase = (int) (_altura / Math.tan(Math.toRadians(60)));

	//Asigna los valores para X iguales a la distancia con el medio del triangulo
	xpoints[1] = _posX + mediaBase;
	xpoints[2] = _posX - mediaBase;

	//Asigna el color y relleno del cuadrado
	color = _color;
	relleno = _relleno;
    }

    public void dibujate(Graphics2D g2, int _posX, int _posY) {
	// Redibuja el triangulo
	int altura = Math.abs((int) ypoints[0] - _posY);

	//Asigna los valores para Y iguales a la altura
	ypoints[1] = _posY + altura;
	ypoints[2] = _posY + altura;

	//Calcualamos la mitad de la base
	int mediaBase = (int) (altura / Math.tan(Math.toRadians(60)));

	//Asigna los valores para X iguales a la distancia con el medio del triangulo
	xpoints[1] = xpoints[0] + mediaBase;
	xpoints[2] = xpoints[0] - mediaBase;

	// Asigna el color del triangulo
	g2.setColor(color);
	// Asigna el relleno del triangulo
	if (relleno) {
	    g2.fill(this);
	} else {
	    g2.draw(this);
	}
    }
}
