package com.example.dh2.restaurants.Views.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dh2.restaurants.Model.Receta;
import com.example.dh2.restaurants.R;

import java.util.List;

/**
 * Created by elniau on 6/3/2017.
 */

public class AdapterRecyclerViewRecetas extends RecyclerView.Adapter implements View.OnClickListener {

    private Context context;
    private List<Receta> listaRecetas;
    private View.OnClickListener clickListener;

    //Constructor del Adapter
    public AdapterRecyclerViewRecetas(Context context, List<Receta> listaRecetas) {
        this.context = context;
        this.listaRecetas = listaRecetas;
    }

    public void setClickListener(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.item_recyclerview_recetas, parent, false);
        ViewHolderDeRecetas viewHolderDeRecetas = new ViewHolderDeRecetas(itemView);

        //clickListener
        itemView.setOnClickListener(clickListener);

        return viewHolderDeRecetas;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //obtengo un objeto de la lista
        Receta unaReceta = listaRecetas.get(position);
        //casteo el holder
        ViewHolderDeRecetas viewHolderDeRecetas = (ViewHolderDeRecetas) holder;
        //el holder la settea en la celda
        viewHolderDeRecetas.cargarReceta(unaReceta);

    }

    @Override
    public int getItemCount() {
        return listaRecetas.size();
    }

    @Override
    public void onClick(View v) {
        clickListener.onClick(v);
    }

    //Contruyo el ViewHolder dentro de la clase
    private class ViewHolderDeRecetas extends RecyclerView.ViewHolder {

        private TextView textViewNombreReceta;
        private ImageView imageViewReceta;

        public ViewHolderDeRecetas(View itemView) {
            super(itemView);
            textViewNombreReceta = (TextView) itemView.findViewById(R.id.textViewNombrePlato);
            imageViewReceta = (ImageView) itemView.findViewById(R.id.imageViewPlato);
        }

        public void cargarReceta(Receta unaReceta) {
            textViewNombreReceta.setText(unaReceta.getNombreDelPlato());
            imageViewReceta.setImageResource(unaReceta.getImageId());
        }

    }
}
