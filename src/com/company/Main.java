package com.company;

public class Main {

    public static void main(String[] args) {

        //CREACION DE OBJETOS
        Cliente cliente1 = new Cliente("Matias",1164312741);
        Cliente cliente2 = new Cliente("Ayrton",1164312745);

        Inmobiliaria inmobiliaria1 = new Inmobiliaria("Remates Cordoba","Cordoba 4596");
        Inmobiliaria inmobiliaria2 = new Inmobiliaria("Subastas Corrientes","Corrientes 450");
        Inmobiliaria inmobiliaria3 = new Inmobiliaria("Liquidaciones Colon","Paseo colon 951");

        Inmueble inmueble1 = new Inmueble("Casa Rosada", 900);
        Inmueble inmueble2 = new Inmueble("Congreso", 950);
        Inmueble inmueble3 = new Inmueble("Museo de bellas artes", 750);

        //LA INMOBILIARIA AGREGA LOS INTERESADOS A SUS RESPECTIVOS INMUEBLES EN VENTA
        inmobiliaria1.agregarInteresado(inmueble1,inmobiliaria2);
        inmobiliaria1.agregarInteresado(inmueble1,inmobiliaria3);
        inmobiliaria1.agregarInteresado(inmueble1,cliente1);
        inmobiliaria1.agregarInteresado(inmueble1,cliente2);
        //LA INMOBILIARIA MODIFICA EL PRECIO DEL UN INMUEBLE Y ENVIAN MENSAJES A LOS INTERESADOS
        inmobiliaria1.cambiarPrecio(inmueble1,200);

    }
}
