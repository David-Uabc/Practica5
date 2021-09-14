
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David-pc
 */
public class Main {
    public static void main(String[] args)
	{
		byte personaje = 0, opcion = 4;
		Scanner entrada = new Scanner(System.in);
		
		Pajaro[] p = new Pajaro[3]; //Se reserva en memoria el espacio para 3 referencias tipo "Pajaro"
		
		p[0] = new Red(); //Se crean los objetos.
		p[1] = new Bomb();
		p[2] = new Blue();
		
		do //Bucle para que usuario ingrese la opcion que desea ver.
		{
			if(opcion == 4) //Cuando opcion es igual a 4, se cambia de personaje.
				personaje = getEscogerPersonaje(p, entrada);
			 
			else //De lo contrario, hace una pausa (esto para dejar ver el mensaje de la opcion escogida).
			{
				entrada.nextLine();
				entrada.nextLine();
			}
			
			System.out.print("\n");

			p[personaje].getPersonaje(); //Se muestra el personaje.
			
			System.out.println("\n1. Ver habilidad del personaje\n2. Ver saludo del personaje\n3. Ver peso del personaje"
					+ "\n4. Cambiar personaje" + "\n5. Salir");
			
			System.out.println("\nIngresa la opcion correspondiente: ");
			opcion = entrada.nextByte(); //Se almacena la opcion elegida por el usuario.
			
			switch(opcion) //Se selecciona la opcion que usuario haya escogido
			{	
				case 1: p[personaje].getHabilidad();	break;
				
				case 2: p[personaje].getSaludo();		break;
				
				case 3:	p[personaje].getPeso();			
			}	
			
		}while(opcion != 5); //El bucle terminara cuando la opcion sea igual a 5.
		
		entrada.close(); //Se cierra objeto tipo Scanner.
	}
	
	public static byte getEscogerPersonaje(Pajaro[] p, Scanner entrada) //Metodo para escoger el personaje.
	{
		byte personaje; //Se declara variable para almacenar el personaje.
		
		do //Bucle para que usuario escoga su personaje.
		{
			System.out.print("\nPersonajes\n\n" );
			
			System.out.println("1. " + p[0].getNombre());
			System.out.println("2. " + p[1].getNombre());
			System.out.println("3. " + p[2].getNombre() );
			
			System.out.println("Escoge tu personaje: ");
			personaje = entrada.nextByte();
			
		}while(personaje < 1 || personaje >3);
	
		return --personaje;  //Se le resta 1 debido a la forma del conteo de los arreglos
	}
    
    
    
}
