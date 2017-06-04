package com.example.dh2.restaurants.Model;

/**
 * Created by elnia on 6/3/2017.
 */

public class Receta {
    private Integer imageId;
    private String nombreDelPlato;

    public Receta(Integer imageId, String nombreDelPlato) {
        this.imageId = imageId;
        this.nombreDelPlato = nombreDelPlato;
    }

    public Integer getImageId() {
        return imageId;
    }

    public String getNombreDelPlato() {
        return nombreDelPlato;
    }
}
