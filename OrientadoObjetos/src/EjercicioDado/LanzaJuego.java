package EjercicioDado;

//Clase Juego de dados, en su constructor llama al constructor por defecto que tiene la clase Dado.
//Ese constructor no lo hemos definido lo genera por defecto el compilador. 

public class LanzaJuego
{
  
  public static void main(String[] ar){
      JuegoDeDados j=new JuegoDeDados();
      j.jugar();
  }
}