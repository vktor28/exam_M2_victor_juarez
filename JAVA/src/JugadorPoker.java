public class JugadorPoker {
    private String nombre;
    private int edad;
    private String sexo;
    private int posicion;


    public JugadorPoker() {
    }

    public JugadorPoker(String nombre, int edad, String sexo, int posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.posicion = posicion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPosicion() {
        return this.posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", posicion='" + getPosicion() + "'" +
            "}";
    }


    public static void celebrarVictoria(){
        System.out.println(" -->>>> Yyyyyyhaaaaaaaa!!!\n");
    }


}
