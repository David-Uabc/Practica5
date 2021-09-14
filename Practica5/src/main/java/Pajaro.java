/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David-pc
 */
public abstract class Pajaro {
    
    private String nombre;
	private String habilidad;
	private int peso;
	
	public Pajaro(String nombre, String habilidad, int peso)
	{
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.peso = peso;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void getPeso()
	{
		System.out.println("\nMi peso es de " + peso + " kilos");

	}
	
	public abstract void getHabilidad(); 
	public abstract void getSaludo();
	public abstract void getPersonaje();

    
    
}
