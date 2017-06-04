package com.example.dh2.restaurants.Views.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.dh2.restaurants.Model.Receta;
import com.example.dh2.restaurants.R;
import com.example.dh2.restaurants.Views.Adapters.AdapterRecyclerViewRecetas;

import java.util.ArrayList;
import java.util.List;

public class RecetasActivity extends AppCompatActivity {

    private List<Receta> listaRecetas;
    private AdapterRecyclerViewRecetas adapterRecetas;
    private RecyclerView recyclerViewRecetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        List<Receta> listaRecetas = new ArrayList<>();
        listaRecetas.add(new Receta(R.drawable.bacalao_guarnicion,"Bacalao a la Brasa "));
        listaRecetas.add(new Receta(R.drawable.ceviche_central,"Ceviche Limeño"));
        listaRecetas.add(new Receta(R.drawable.cordero_bora,"Cordero 'a la inverté'"));
        listaRecetas.add(new Receta(R.drawable.solomllo_tegui,"Solomillo porteño"));
        listaRecetas.add(new Receta(R.drawable.toasted_mini_rice_dom,"Mini Arroz con champignos"));


        final RecyclerView recyclerViewRecetas = (RecyclerView)findViewById(R.id.recyclerViewRecetas);
        recyclerViewRecetas.setHasFixedSize(true);

        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        AdapterRecyclerViewRecetas adapterRecetas = new AdapterRecyclerViewRecetas(this,listaRecetas);


        View.OnClickListener listenerRecetas = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(RecetasActivity.this, "Receta Solicitada... ", Toast.LENGTH_SHORT).show();
            }
        };

        adapterRecetas.setClickListener(listenerRecetas);
        recyclerViewRecetas.setAdapter(adapterRecetas);
    }

}
