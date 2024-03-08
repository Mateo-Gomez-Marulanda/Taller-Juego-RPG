package co.edu.uniquindio.poo.JuegoRPG;

import java.util.List;

public class App {
        public static void main(String[] args) {
                CharacterBuilder builder = new ArcherBuilder();
                CharacterCreator creador = new CharacterCreator(builder);

               

                builder = new WarriorBuilder();
                creador = new CharacterCreator(builder);

                creador.constructor("Zacarias", "guerrero", 1,
                                List.of("Espada Afilada ", " Golpe Definitivo ", " Escudo Protector"),
                                List.of("Fuerza ", " Resistencia ", " Vitalidad"),
                                List.of("Escudo de madera", "Espada de novato", "peto de bronce"),
                                "Gran pelaedor cuerpo a cuerpo con una resistencia excepcional", "Sir. Z", 1000);

                Character warrior = builder.build();
                System.out.println("Guerrero creado: " + warrior);

                builder = new MageBuilder();
                creador = new CharacterCreator(builder);

                creador.constructor("Stella", "Mago", 1, List.of("Inteligencia ", " Sabiduría ", " Energía Mágica"),
                                List.of("Bola de Fuego ", " Rayo Eléctrico ", " Hechizo de Curación"),
                                List.of("baculo de aprendiz ", "posion de mana ", " bata magica"),
                                "Combatinete magico con trucas bajo la manga", "Star", 1000);

                Character mage = builder.build();
                System.out.println("Mago creado: " + mage);

                CharacterRegistration characterRegistration = CharacterRegistration.getInstance();
                System.out.println(characterRegistration);

        }
}