/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class Circulo extends Ellipse2D.Double {

    public Color color = null;
    public boolean relleno = false;

    public Circulo(int _posX, int _posY, int _diametro, Color _color, boolean _relleno) {
	super();
	//Asigna las coordenadas de inicio del circulo
	x = _posX;
	y = _posY;
	//Asigna el tamaño del circulo
	width = _diametro;
	height = _diametro;
	//Asigna el color y relleno del circulo
	color = _color;
	relleno = _relleno;

    }

    public void dibujate(Graphics2D g2, int _posX, int _posY) {
	// Asignamos el tamaño del circulo
	int diametro = Math.abs((int) x - _posX);
	width = diametro;
	height = diametro;
	// Asigna el color del circulo
	g2.setColor(color);
	// Asigna el relleno del circulo
	if (relleno) {
	    g2.fill(this);
	} else {
	    g2.draw(this);
	}
    }

}
