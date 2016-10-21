package com.example.albertvilaret.teoria151124drawablesiestils;

import android.graphics.Color;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PrincipalActivity extends ActionBarActivity
{

//a Carpeta Drawables, new drawable Resource file "capes"
//cambiem selector per layer-list
    ImageView ivColors;
    Button btnColors;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ivColors = (ImageView) findViewById(R.id.colors);
        btnColors = (Button) findViewById(R.id.btnColors);
        btnColors.postDelayed(changeColorRunnable,1000);

    }
    int currentColor;
    private Runnable changeColorRunnable = new Runnable() {

        @Override
        public void run() {
            switch(currentColor){
                case Color.RED:
                    currentColor = Color.BLACK;
                    break;
                case Color.BLACK:
                    currentColor = Color.RED;
                    break;
            }
            ivColors.setBackgroundColor(currentColor);

        }
    };
    public void clickDeImatge (View vista)
    {
        ImageView imatge = (ImageView)vista;

        switch (vista.getId())
        {
            case R.id.imgNivells:
                int nivell = imatge.getDrawable().getLevel();
                imatge.getDrawable().setLevel((nivell+1) % 4);
                break;

        }
    }


    public void colorsClick(View view) {
        //ivColors.postDelayed(changeColorRunnable,1000);
/*
* a=Integer.parseInt(ARGB[0]);
              r=Integer.parseInt(ARGB[1]);
              g=Integer.parseInt(ARGB[2]);
              b=Integer.parseInt(ARGB[3]);
              text1.setBackgroundColor(Color.rgb(r, g, b));*/
        final int[] r = {0};
        final int[] g = {0};
        int b=00;
        final Color c = null;



        for (int i=0;i<500;i++){

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ivColors.setBackgroundColor(Color.BLUE);
                    try {
                        this.finalize();
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }

            },1000);
        }
        ivColors.setBackgroundColor(Color.RED);


    }
}
