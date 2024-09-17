public class Mago extends Personaje{

    private int puntoMagia;

    public int getPuntoMagia() {
        return puntoMagia;
    }

    public void setPuntoMagia(int puntoMagia) {
        this.puntoMagia = puntoMagia;
    }


    public Mago(){
    }


    public Mago(String nombre, int salud, int PuntoMagia){
        super(nombre, salud);
        this.puntoMagia = PuntoMagia;
    }

    public void LanzarHechizo(){
        System.out.println();
        System.out.println();
        System.out.println("El mago está lanzando un hechizo! ");
        System.out.println();
        System.out.println();

    }

}
