package co.edu.uniquindio.poo.JuegoRPG;

public class Personaje {
    public void personajes(){
        Guerrero guerrero = new Guerrero();
        Arquero arquero = new Arquero();
        Mago mago = new Mago();
        
        guerrero.agregarAtributos();
        guerrero.agregarHablilidades();
        arquero.agregarAtributos();
        arquero.agregarHablilidades();
        mago.agregarAtributos();
        mago.agregarHablilidades();
        
    }
}
