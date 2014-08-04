package com.juego;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
	 ///clase pabre de todos los objetos
	public abstract class Elemento {
	//parametros que se heredaran a los hijos 
	 protected static final int POS_ACTUAL = 2;
	 protected static final int MOVIMIENTO = 1;
	 public Coordenada origen;
	 protected int ancho;
     protected int alto;
	 protected Bitmap image;
	 protected Canvas canvas;
	 protected Paint paint;
	 
	 //constructor que heredan los hijos
	 public Elemento(Coordenada origen, int ancho, int alto,Bitmap image) {
		  this.origen = origen;
		  this.ancho = ancho;
		  this.alto = alto;
		 this.image=image;
		 }
	 //metodo que se indica si se puede mover el objeto 
	 public boolean puedoMover(int x, int y, Rect screen) {
		 return screen.contains(origen.getX() + x, origen.getY() + y,
		  origen.getX() + ancho + x, origen.getY() + alto + y);
		}
	 //metodos get y set 
	 public int getOrigenX() {
	  return origen.getX();
	 }
	 
	 public int getOrigenY() {
	  return origen.getY();
	 }
	 public void setOrigenX(int newX) {
		 origen.setX(newX);
		}

	 public void setOrigenY(int newY) {
		 origen.setY(newY);
		}
	 public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Bitmap getImage() {
		return image;
	}

	public void setImage(Bitmap image) {
		this.image = image;
	}
	 //metodo que crea un Rect(rectangulo)	
	 public Rect getRectElemento() {
	  return new Rect(getOrigenX(), getOrigenY(),getOrigenX()+ancho, getOrigenY()+alto);
	 }
     //metodo de pintado que heredaran los hijos 
	 public abstract void onDraw(Canvas _canvas);
	}