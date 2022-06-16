package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inmueble {

    private String nombre;
    private int precio;
    private List<ClientePotencial> interesados = new ArrayList<>();

    public Inmueble(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void agregarInteresado(ClientePotencial clientePotencial){
        interesados.add(clientePotencial);
    }

    public List<ClientePotencial> getInteresados() {
        return interesados;
    }

    public void cambiarPrecio(int precio){
        this.precio = precio;
    }

}
