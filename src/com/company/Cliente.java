package com.company;

public class Cliente implements ClientePotencial {

    private String nombre;
    private int telefono;

    public Cliente(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void recibirMensaje(String inmueble, int precio) {
        System.out.print("\n" + nombre +" el precio actual del inmueble  "+ inmueble +" es $" + precio);

    }
}
