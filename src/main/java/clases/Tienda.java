package clases;

import clases.Producto;

import java.util.Scanner;

public class Tienda {

    private int cantidad;
    private final double IVA=0.19;


    public Tienda() {

    }

    public Tienda(int cantidad) {

        this.cantidad = cantidad;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIVA() {
        return IVA;
    }

    public double calcularCosto(){

        Scanner entradaTeclado = new Scanner(System.in);
        int precio;
        System.out.println("Digite el precio del producto: ");
        precio=entradaTeclado.nextInt();

        Producto papas = new Producto();


        papas.setPrecio(precio);

        int valorNeto=papas.getPrecio()*this.cantidad;

        double valorIVA=valorNeto*this.IVA;

        double valorTotal=valorNeto+valorIVA;

        return valorTotal;

    }



}