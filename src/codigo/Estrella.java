/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class Estrella extends Forma {

    public Estrella(int _posX, int _posY, Color _color, boolean _relleno) {
	//Inicializa el constructo de la estrella correctamente con 24 puntos
	super(_posX, _posY, 16, _color, _relleno);
    }

    @Override
    public void calculaVertices(int _radio, double _giro) {
	for (int i = 0; i < npoints; i++) {
	    xpoints[i] = (int) (x + _radio * Math.cos((2 * Math.PI * i + _giro) / npoints));
	    xpoints[i+1] = (int) (x + _radio/2 * Math.cos((2 * Math.PI * i + _giro/2) / npoints));
	    ypoints[i] = (int) (y + _radio * Math.sin((2 * Math.PI * i + _giro) / npoints));
	    ypoints[i+1] = (int) (y + _radio/2 * Math.sin((2 * Math.PI * i + _giro /2) / npoints));
	    i++;
	}
    }
}
