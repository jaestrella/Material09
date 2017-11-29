package com.iesvirgendelcarmen.dam.material09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class Material09 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView icono;
    private static  final int DURACION=250;
    boolean giro=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);

        icono=(ImageView)findViewById(R.id.imagen2);

        toolbar=(Toolbar)findViewById(R.id.barra1);
        toolbar.setTitle("EL RAPTO DE LAS SABINAS");
        toolbar.setSubtitle("Jacques Louis David");
        toolbar.inflateMenu(R.menu.menu);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.opcion1:
                        Toast.makeText(getApplication(),"TOCADA OPCION 1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.opcion2:
                        Toast.makeText(getApplication(),"TOCADA OPCION 2",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.opcion3:
                        Toast.makeText(getApplication(),"TOCADA OPCION 3",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });


    }
    private void rotate(float angulo){
        Animation animacion=new RotateAnimation(0.0f,angulo,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        animacion.setFillAfter(true);
        animacion.setDuration(DURACION);
        icono.startAnimation(animacion);
    }
    public void tocado(View view){
        if (giro!=false){
            icono.setImageResource(R.mipmap.menos);
            rotate(-180.0f);
            giro=false;
        }else{
            icono.setImageResource(R.mipmap.mas);
            rotate(180.0f);
            giro=true;
        }
    }
}
