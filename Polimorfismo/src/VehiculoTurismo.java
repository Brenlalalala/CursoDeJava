public class VehiculoTurismo extends Vehiculo{

    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }


    @Override
    public String mostarDatos(){
        return matricula+marca+modelo+numeroPuertas;
    }
    }

