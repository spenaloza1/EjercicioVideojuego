import Videojuego.logica.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {
        //Punto 1
        List<Videojuego> videojuegos = new ArrayList<>();

        //Punto 2
        Videojuego video1 = new Videojuego(123,"Banjo Kazooie","Nintendo",4,"Plataforma");
        Videojuego video2 = new Videojuego(100,"Mario Party","Nintendo 64",8,"Plataforma");
        Videojuego video3 = new Videojuego(222,"Sims 2","PC",4,"Simulador de vida interactivo");
        Videojuego video4 = new Videojuego(321,"Counter Strike 1.6","PC",1,"Shooter");
        Videojuego video5 = new Videojuego(333,"Mario Kart 64","Nintendo",2,"Plataforma");

        videojuegos.add(video1);
        videojuegos.add(video2);
        videojuegos.add(video3);
        videojuegos.add(video4);
        videojuegos.add(video5);

        //Punto 3 - recorrido
        for(Videojuego vid: videojuegos){
            System.out.println("Titulo: " + vid.getTitulo() +
                             " Consola: " + vid.getConsola() +
                            " Cant jugadores: " + vid.getCantJugadores());
        }

        //Punto 4 - cambio de nombre y jugadores
        video1.setTitulo("Banjoo Kazoie 2");
        video1.setCantJugadores(2);

        video5.setTitulo("Super Mario Kart");
        video5.setCantJugadores(4);
        System.out.println("******************");
        //Punto 5
        for(Videojuego vid: videojuegos){
             if(vid.getConsola().equals("Nintendo 64")){
                 System.out.println(vid.toString());
             }
        }

    }
}