package co.edu.uniquindio.poo.JuegoRPG;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class RegistroJugador {
   
    public record registrarJugador(Collection<Jugador> jugadores){

    }

    public void registrarJugador(Jugador nombreJugador, Collection<Jugador> jugadores) {
        validarJugadorExiste(nombreJugador);
        jugadores.add(nombreJugador);
    }

    public Optional<Jugador> buscarJugador(Jugador nombreJugador, Collection<Jugador> jugadores) {
        Predicate<Jugador> nombreIgual = j -> j.getNombreJugador().equals(nombreJugador.getNombreJugador());
        return jugadores.stream().filter(nombreIgual).findAny();
    }

    private void validarJugadorExiste(Jugador nombreJugador) {
        boolean existeJugador = buscarJugador(nombreJugador, null).isPresent();
        ASSERTION.assertion(!existeJugador, "El jugador ya esta registrado");
    }
}
