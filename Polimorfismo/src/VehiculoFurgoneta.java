public class VehiculoFurgoneta extends Vehiculo {

 protected int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String mostarDatos() {
        return matricula+marca+modelo+carga;
    }
}
