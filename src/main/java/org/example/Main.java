package org.example;

import clases.Biblioteca;
import clases.Empleado;
import clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        Scanner entradaPorTeclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        empleado.setNombre(entradaPorTeclado.nextLine());
        System.out.println("Ingrese la identificacion del empleado: ");
        empleado.setIdentificacion(entradaPorTeclado.nextLine());
        empleado.calculoComision();
        empleado.calcularSalario();
        System.out.println("El nombre del empleado es: "+ empleado.getNombre());
        System.out.println("la identificacion del empleado es: " + empleado.getIdentificacion());
        System.out.println("Las deducciones son de : " + empleado.getDeducciones());
        System.out.println("El numero de ventas es de: " + empleado.getNumeroVentas());
        System.out.println("Las comisiones son de : " + empleado.getValorcomision());
        System.out.println("El salario neto es: " + empleado.getSalarioNeto());


        Tienda tienda = new Tienda();
        tienda.setCantidad(2);

        double total=tienda.calcularCosto();

        System.out.println("El total es de: "+total);



        Biblioteca biblioteca=new Biblioteca();
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        biblioteca.setNombre(sc.nextLine());
        System.out.println("Digite el Codigo del libro: ");
        biblioteca.setCodigo(sc.next());
        System.out.println("Digite Numero de paginas  del libro: ");
        biblioteca.setPaginas(sc.next());
        System.out.println("Digite numero de ejemplares del libro: ");
        biblioteca.setEjemplares(sc.nextInt());
        System.out.println("Digite el autor del libro: ");
        biblioteca.setAutor(sc.next());

        System.out.println("Nombre del libro "+biblioteca.getNombre());
        System.out.println("Codigo del libro "+biblioteca.getCodigo());
        System.out.println("Numero de Paginas "+biblioteca.getPaginas());
        System.out.println("Numero de ejemplares "+biblioteca.getEjemplares());
        System.out.println("Autor "+biblioteca.getAutor());



    }
}

