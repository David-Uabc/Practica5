/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David-pc
 */
public class Red extends Pajaro {
    
    public Red()
	{
		super("Red", "¡Grito de guerra!", 8);
	}
	
	public void getHabilidad() 
	{
		System.out.print("\n¡Grito de guerraaa! ");
	}
	
	public void getSaludo()
	{
		System.out.print("\n¡Hola, soy Red!");
	}
	
	public void getPersonaje()
	{
		System.out.print("\n🐦");
	}
    
}
