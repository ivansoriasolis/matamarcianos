package com.juego;
 ///clase de las coordenadas que utilizaran todo los objetos 
	public class Coordenada {
	 //parametros de X,Y de las cordenadas
	 private int x;
	 private int y;
	 
	 //contructor
	 public Coordenada(int x, int y) {
      this.x = x;
	  this.y = y;
	 }
	 //metodos get y set
	 public int getX() {
	  return x;
	 }
	 
	 public void setX(int x) {
	  this.x = x;
	 }
	 
	 public int getY() {
	  return y;
	 }
	 
	 public void setY(int y) {
	  this.y = y;
	 }
	}