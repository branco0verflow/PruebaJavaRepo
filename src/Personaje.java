public abstract class Personaje {
    private String Nombre;
    private int Salud;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int salud) {
        Salud = salud;
    }


    public Personaje(){

    }

    public Personaje(String nombre, int salud){
        this.Nombre = nombre;
        this.Salud = salud;
    }




}
