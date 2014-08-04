package com.Opciones;
//clase de la logica de las opciones a configurar
public class Opciones {
	//parametros de las opciones 
	private static Opciones opciones = null;
	private boolean sonido;
	private boolean vibracion;
	private boolean control;
    //constructor
	private Opciones() {
		sonido = true;
		vibracion = true;
		control= true;
	}
   //sincroniza la clase Opciones 
	public static synchronized Opciones getInstance() {
		if(opciones == null)
			opciones = new Opciones();
		return opciones;
	}
    //metodo que manipulan las opciones segun el check a precionamos(seleccionar y deseleccionar)
	public void toggleSound() {
		sonido = !sonido;
	}

	public void toggleVibration() {
		vibracion = !vibracion;
	}
	
	public void toggleControl() {
		control = !control;
	}
	
	public boolean soundEnabled() {
		return sonido;
	}

	public boolean vibrationEnabled() {
		return vibracion;
	}
	public boolean controlEnabled() {
		return control;
	}
}
