package com.example.fuentes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
        getSupportActionBar().hide();
    }

    class Lienzo extends View {
        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            canvas.drawRGB(255, 255, 255);
            Paint pincel1 = new Paint();
            pincel1.setARGB(255, 0, 0, 0);
            pincel1.setTextSize(80);
            Typeface face = Typeface.createFromAsset(getAssets(),
                    "Devroye Unicode.ttf");
            pincel1.setTypeface(face);
            canvas.drawText("Fuente:", 0, 320, pincel1);
            canvas.drawText("Devroye Unicode", 0, 520, pincel1);
        }
    }
}