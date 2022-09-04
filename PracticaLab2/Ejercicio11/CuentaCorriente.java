package Ejercicio11;

import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroDeCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
    this.saldo = saldo;
    this.nombreTitular = nombreTitular;
    this.numeroDeCuenta = (int)(Math.random()*100);//para asignar un n° de cta aleatorio y para redondear
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
    public double getSaldoCuenta() {

        return saldo;
    }

   public String getdatosDelaCuenta() {

        return("\n-------INFORMACION DE CUENTA---------\n"+
                "Nombre: "+this.nombreTitular+"\n"+
                "nro Cuenta: "+Double.toString(this.numeroDeCuenta)+"\n"+
                "Saldo: $"+this.saldo+"\n");
}

    public void Transferencia(CuentaCorriente cuenta2, double importe){
        this.saldo = saldo - importe;
        cuenta2.saldo = saldo + importe;
        System.out.print("Trasfereriste el importe de:$ " + importe);

    }
}