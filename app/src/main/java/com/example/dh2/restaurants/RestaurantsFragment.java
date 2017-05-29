package com.example.dh2.restaurants;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {



    public static RestaurantsFragment fabricameElFragment (Integer imagenId, String nombreResto){

        RestaurantsFragment restaurantsFragment = new RestaurantsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("Imagen", imagenId);
        bundle.putString("Nombre", nombreResto);
        restaurantsFragment.setArguments(bundle);

        return restaurantsFragment;
    }


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        Bundle bundle = getArguments();
        ImageView imagen = (ImageView) view.findViewById(R.id.imageViewFotoRestaurant);
        imagen.setImageResource(bundle.getInt("Imagen"));

        TextView nombreResto = (TextView) view.findViewById(R.id.textViewNombreRestaurant);
        nombreResto.setText(bundle.getString("Nombre"));

        return view;
    }

}
