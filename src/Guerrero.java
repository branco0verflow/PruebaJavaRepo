public class Guerrero extends Personaje {
    private int PuntosAtaques;

    public int getPuntosAtaques() {
        return PuntosAtaques;
    }

    public void setPuntosAtaques(int puntosAtaques) {
        PuntosAtaques = puntosAtaques;
    }

    public Guerrero(){

    }

    public Guerrero(String nombre, int salud, int puntosAtaque){
        super(nombre, salud);
        this.PuntosAtaques = puntosAtaque;
    }

    public void Atacar(){
        System.out.println();
        System.out.println();
        System.out.println("El guerrero está atacando! ");
        System.out.println();
        System.out.println();

    }
}
