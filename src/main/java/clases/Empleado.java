package clases;

import java.util.Scanner;

public class Empleado {

    private String identificacion;
    private String nombre;
    private final int SALARIO = 3500000;
    private int numeroVentas;
    private int valorcomision;
    private double deducciones;

    private double salarioNeto;

    public Empleado() {
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSALARIO() {
        return SALARIO;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public int getValorcomision() {
        return valorcomision;
    }

    public void setValorcomision(int valorcomision) {
        this.valorcomision = valorcomision;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public double calculoComision() {
        Scanner entradaPorTeclado = new Scanner(System.in);

        System.out.println("Ingrese las deducciones del empleado: ");
        this.deducciones = entradaPorTeclado.nextDouble();

        System.out.println("Ingrese la cantidad de venta: ");
        this.numeroVentas = entradaPorTeclado.nextInt();

        if (this.numeroVentas > 0) {
            return this.valorcomision = (int) (this.numeroVentas * (1500000 - (this.deducciones * 0.5)));

        } else {

            return valorcomision = 0;

        }


    }

    public double calcularSalario () {
        return this.salarioNeto = this.SALARIO + this.valorcomision - this.deducciones;

    }


}
