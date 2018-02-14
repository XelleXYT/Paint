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
public class Pentagono extends Forma {

    public Pentagono(int _posX, int _posY, Color _color, boolean _relleno) {
	//Inicializa el constructo del triangulo correctamente con 3 lados
	super(_posX, _posY, 5, _color, _relleno);
    }
}
