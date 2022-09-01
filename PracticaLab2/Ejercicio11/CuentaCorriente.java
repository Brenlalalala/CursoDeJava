package Ejercicio11;

import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;

    private long numeroDeCuenta;
    private double saldoDeCuenta;

    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random NumAleatorioCta = new Random();
        this.numeroDeCuenta = Math.abs(NumAleatorioCta.nextLong());//para asignar un n° de cta aleatorio y
            } //BUSCAR math.abs

    public CuentaCorriente() {
        this.nombreTitular = null;
        this.saldo = 0;
        this.numeroDeCuenta = 0;
    }

    public String verInformacion() {

        return ("\n-------INFORMACION DE CUENTA---------\n"+
                "Nombre: "+this.nombreTitular+"\n"+
                "nro Cuenta: "+Double.toString(this.numeroDeCuenta)+"\n"+
                "Saldo: $"+this.saldo+"\n");
    }

    public void setDepositar(double importe) {
        this.saldo = this.saldo + importe;
    }

    public void setExtraer(double importe) {
        this.saldo = this.saldo - importe;
    }

    public Double getSaldoCuenta () {

        return saldoDeCuenta;
    }

    public String datosCuenta () {
        return this.numeroDeCuenta + this.nombreTitular + this.saldo + this.saldoDeCuenta;
}
    /*public double Transferencia (String cuenta1, String cuenta2, double importe){
      cuenta1=  (saldoDeCuenta - importe);
        cuenta2 = (saldoDeCuenta + importe);
       return
}

    /*public String verSaldo() {
        return "$ "+Double.toString(this.saldo);
    }

    public long verNroCuenta() {
        return this.nroCuenta;
    }*/
}
