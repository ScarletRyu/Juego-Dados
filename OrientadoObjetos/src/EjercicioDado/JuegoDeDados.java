package EjercicioDado;

//clase Dado con el valor y tres m�todos p�blicos


public class JuegoDeDados 
{
  private Dado dado1,dado2,dado3;
  
  public JuegoDeDados() 
	{
      dado1=new Dado();
      dado2=new Dado();
      dado3=new Dado();        	
  	}
  
 
  
  //Metodo jugar, pasamo los datos de la tirada y devolvemos al ganador
  public void jugar() 
  {
  	System.out.println("Jugador 1 ha sacado:");
      dado1.tirar();
      dado1.imprimir();
      dado2.tirar();
      dado2.imprimir();
      dado3.tirar();
      dado3.imprimir();
      int j1 = Sumar();
      System.out.println("");
              
      System.out.println("Jugador 2 ha sacado:");
      dado1.tirar();
      dado1.imprimir();
      dado2.tirar();
      dado2.imprimir();
      dado3.tirar();
      dado3.imprimir();
      int j2 = Sumar();
      System.out.println("");
      
     if(j1 > j2) {
  	   System.out.println("El jugador 1 ha ganado");
  	   
     }else if (j1 == j2){
  	   System.out.println("Los dos jugadores han empatado");
     }
     else {
    	 System.out.println("El jugador 2 ha ganado");
     }
      
  }
  
  //Puntuaciones de tiradas de dados
  final static int TRIO = 3;
  final static int PAREJA = 2;
  final static int BASURA= 0;
  
  
  
  //Metodo sumar
  public int Sumar() {
  	int suma = 0;
  	
  	if(comprobarParejaTrio() == 3) {
  		suma = dado1.getValor() + dado2.getValor() + dado3.getValor() + 10;
  	}else if(comprobarParejaTrio() == 2) {
  		suma = dado1.getValor() + dado2.getValor() + dado3.getValor() + 5;
  	}else {
  		suma = dado1.getValor() + dado2.getValor() + dado3.getValor();
  	}
  	
  	
  	return suma;
  }
  
  
  public int comprobarParejaTrio() {
  	
  	int trio = 3;
  	
  	if(dado1.getValor() == dado2.getValor() && dado1.getValor() == dado3.getValor() ){
  		trio = TRIO;
  	}else if(dado1.getValor() == dado2.getValor() || dado1.getValor() == dado3.getValor() || dado2.getValor() == dado3.getValor()){
  		trio = PAREJA;
  	}else {
  		trio = BASURA;
  	}
  	
  	return trio;
  }



}