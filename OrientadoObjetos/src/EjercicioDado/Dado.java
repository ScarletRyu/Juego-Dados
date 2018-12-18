package EjercicioDado;


//Creamos la clase dado
public class Dado 
{
    private int valor;
    
    //Codigo para tirada de dados
    public void tirar() 
	{
        setValor(1+(int)(Math.random()*6));
    	}
    
    //Mostrar valor del dado
    public void imprimir() 
	{
        System.out.println("El valor del dado es:"+getValor());
    	}
    
    public int retornarValor() 
	{
        return getValor();
    	}

    
    
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}

