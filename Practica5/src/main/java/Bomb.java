/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David-pc
 */
public class Bomb extends Pajaro {
    
    public Bomb()
	{
		super("Bomb", "¡Explosión!", 10);
	}
	
	public void getHabilidad()
	{
		System.out.print("\n¡ E X P L O S I Ó N ! ");
	}
	
	public void getSaludo()
	{
		System.out.print("\n¡Hola, soy Bomb!");
	}
	
	public void getPersonaje()
	{
		 System.out.print("\n🦆");
	}
    
}
