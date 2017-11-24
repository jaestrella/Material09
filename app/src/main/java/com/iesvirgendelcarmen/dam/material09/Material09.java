package com.iesvirgendelcarmen.dam.material09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class Material09 extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);

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
}
