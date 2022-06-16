package com.company;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria implements ClientePotencial{

    private String nombre;
    private String direccion;
    private List<Inmueble> inmuebles= new ArrayList<>();


    public Inmobiliaria(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    private void enviarMensaje (Inmueble inmueble,int precio){
        for (ClientePotencial interesado: inmueble.getInteresados()) {
            interesado.recibirMensaje(inmueble.getNombre(),precio);
        };
    }
    public void agregarInteresado(Inmueble inmueble,ClientePotencial clientePotencial){
        inmueble.agregarInteresado(clientePotencial);
    }

    public void cambiarPrecio(Inmueble inmueble,int precio){
        inmueble.cambiarPrecio(precio);
        enviarMensaje(inmueble,precio);

    }

    public void recibirMensaje(String inmueble, int precio) {
        System.out.print("\n"+ nombre + " el precio actual del inmueble  "+ inmueble +" es $" + precio);
    }
}
