package com.activity;
import com.Pintado.movimiento.MarcianosView;
import com.matamarcianosv1.R;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;


public class Nivel1Activity extends Activity {
	
	   private MarcianosView marcianosView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    //setContentView(new MarcianosView(this));
	    setContentView(R.layout.main);
	    ///creamos una instacia con la id de un Layout que creamos
	    marcianosView = (MarcianosView) findViewById(R.id.marcianosView);
	   ///para manipular el audio con los botones de sonido
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
	}
	//metodo que pausa el juego 
	  @Override
	   public void onPause()
	   {
	      super.onPause(); 
	      marcianosView.stopGame(); // terminates el juego
	   } 

	   // metodo que destruye el juego
	   @Override
	   protected void onDestroy()
	   {
	      super.onDestroy();
	      marcianosView.releaseResources();
	   }
	 

}
