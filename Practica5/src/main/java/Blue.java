/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David-pc
 */
public class Blue extends Pajaro {
    
    public Blue()
	{
		super("Blue", "División", 4);
	}
	
	public void getHabilidad()
	{
		System.out.print("\n¡División! ");
	}
	
	public void getSaludo()
	{
		System.out.print("\n¡Hola, soy de la raza Blue! y me llamo jake");
	}
	
	public void getPersonaje()
	{
		 System.out.print("\n🦅");
	}
}
