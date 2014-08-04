package com.Pintado.movimiento;


import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
	 //clase de donde se ejecuta todo el juego
	@SuppressLint("WrongCall")
	public class MarcianosThread extends Thread {
	 
	 private SurfaceHolder sh;//clase existente de java que se utiliza para controlar la ejecucion
	 private MarcianosView view;//haces una referencia a la clase MarcianosView donde esta el metodo drawGameElements(canvas) 
	 private boolean run;//valor booleano para parar el juego
	 //constructor donde se envian las 2 clases referenciadas
	 public MarcianosThread(SurfaceHolder sh, MarcianosView view) {
	  this.sh = sh;
	  this.view = view;
	  run = false;
	 }
	 // metodo donde podemos modificar la ejecucion de juego
	 public void setRunning(boolean run) {
	  this.run = run;
	 }
	 ///metodo donde se ejecuta todo el juego 
	 @Override
	public void run() {
		  Canvas canvas;
	  while(run) {
	   canvas = null;
	   try {
	    canvas = sh.lockCanvas(null);
	    synchronized(sh) {
	     view.drawGameElements(canvas);
	    }
	   } finally {
	    if(canvas != null)
	     sh.unlockCanvasAndPost(canvas);
	   }
	
	  }
	 }
	}
