package com.juego;

import android.graphics.Rect;

public class BalaMarcianoMoveThread extends Thread{
	 
	 private BalaMarciano balamarciano;
	 private Rect screen;//la clase rectangulo
	 private boolean run; //para correr o pausar la ejecucion
	 public int speedX; //valor de las abance de la bala en eje X
	 public int speedY;//valor de las abance de la bala en eje X
     private final int a=0;//opcines de dirreccion
     private final int b=1;
     private final int c=2;
     private int op;
     
     //constructor 
	public BalaMarcianoMoveThread(BalaMarciano balamarciano ,Rect screen,int op) {
		  this.screen = screen;
		  this.balamarciano=balamarciano;
	
		  this.run = false;
		  this.speedX = 4;
		  this.speedY = 1;
		  this.op=op;
	}
	//metodos que nos devuelven el valor de SpeedX Y SpeedY 
	////metodos que nos permiten modificar sus valores
	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public void setRunning(boolean run) {
		  this.run = run;
		 }
	//metodo que se ejecuta mientras run=true
	 @Override
	 public void run() {
	  while(run) {
	   try {
		   //tiempo de retardo
	    Thread.sleep(10);
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }
	    switch(op){
	    case a: 
	    balamarciano.move(speedX, speedY); 
	    break;
	    case b:
	    balamarciano.move1(speedX, speedY);
	    break;
	    case c:
		 balamarciano.move2(speedX, speedY);
		 break;
	    }
	    
	  }
	 }

}
