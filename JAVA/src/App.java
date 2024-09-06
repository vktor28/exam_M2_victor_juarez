import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList <JugadorPoker> jugadores = new ArrayList<>();

        JugadorPoker j1 = new JugadorPoker("Jose", 18, "hombre",6);
        JugadorPoker j2 = new JugadorPoker("Laura", 29, "mujer", 5);
        JugadorPoker j3 = new JugadorPoker("Roberto", 42, "hombre", 3);
        JugadorPoker j4 = new JugadorPoker("John", 50, "hombre", 2);
        JugadorPoker j5 = new JugadorPoker("Sara", 23, "mujer", 1);
        JugadorPoker j6 = new JugadorPoker("Albert", 28, "hombre", 4);

        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        jugadores.add(j4);
        jugadores.add(j5);
        jugadores.add(j6);
        
        System.out.println("____________\n");
        System.out.println("Lista Jugadores");
        System.out.println("____________");
        for(int i=0; i<jugadores.size(); i++){
            System.out.println("- " + jugadores.get(i).getNombre() + " | Edad: " + jugadores.get(i).getEdad() + " | Sexo: " + jugadores.get(i).getSexo() + " | Posición: " + jugadores.get(i).getPosicion());
            
        }

        System.out.println("\n________\nY EL GANADOR DEL TORNEO ES...");
        for(int i=0; i<jugadores.size(); i++){
        if(jugadores.get(i).getPosicion()==1){
            System.out.println(jugadores.get(i).getNombre() + "ha ganado el tornedo!");
            System.out.println("-- " + jugadores.get(i).getNombre() + "dice:");
            JugadorPoker.celebrarVictoria();
        }
        }

}
}
