/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class Cuadrado extends Forma {
    public Cuadrado (int _posX, int _posY, Color _color, boolean _relleno) {
	//Inicializa el constructo del cuadrado correctamente con 3 lados
	super(_posX, _posY, 4, _color, _relleno);
    }
}