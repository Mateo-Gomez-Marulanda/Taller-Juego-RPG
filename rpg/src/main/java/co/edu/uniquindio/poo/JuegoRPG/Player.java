package co.edu.uniquindio.poo.JuegoRPG;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Character> listaPersonajes;
    CharacterCreator creador;

    public Player() {
        listaPersonajes = new ArrayList<>();
    }

    public void addMage(String name, String CharacterCLass, int level, List<String> skills, List<String> attributes,
            List<String> equipment, String description, String nickName, double money) {
        MageBuilder builder = new MageBuilder();
        creador.constructor(name, CharacterCLass, level, skills, attributes, equipment, description, nickName, money);

        listaPersonajes.add(builder.build());

    }

}