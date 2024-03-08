package co.edu.uniquindio.poo.JuegoRPG;

import java.util.List;

public class CharacterRegistration {
    private static CharacterRegistration registration;
    List<Character> listaPersonajes;

    public static CharacterRegistration getInstance() {
        if (registration == null) {
            registration = new CharacterRegistration();
        }
        return registration;
    }

    public void registrarNombre(CharacterBuilder builder, Character name) {
        if (listaPersonajes.contains(builder.build())) {
            System.out.println("El nombre:" + name.getName() + " ya existe");

        } else
            listaPersonajes.add(builder.build());
        System.out.println("Se creo el personaje ");
    }
}
