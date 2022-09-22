public class SalaCine {
    private int capacidad;
    private String Pelicula;
    private String Nombre;
    private Espectadores[] espectadores;

    public SalaCine(int capacidad, String pelicula, String nombre, Espectadores[] espectadores) {
        capacidad = capacidad;
        Pelicula = pelicula;
        Nombre = nombre;
        this.espectadores = espectadores;
    }


    public int getcapacidad() {
        return capacidad;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public String getNombre() {
        return Nombre;
    }
    public String getEspectadores() {//si o si debe tener el tipo de retorno. (String en este caso)
        try {

            String listadoEspectadores ="LISTADO DE ESPECTADORES: \n";
            for (Espectadores espectador : this.espectadores) {
                listadoEspectadores = listadoEspectadores+espectador.toString();
            }
            return listadoEspectadores;

        } catch (Exception e) {
            return "SIN ESPECTADORES CARGADOS";
        }

    }


    public void setEspectadores(Espectadores[] espectadores) {
        if(espectadores.length>this.capacidad) {
            System.out.println("CAPACIDAD DE ESPECTADORES SUPERADA");
        }else {
            this.espectadores = espectadores;
        }
    }
    }



