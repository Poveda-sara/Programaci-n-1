/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class usuarios
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    
	    String[] nombre = new String [100];
	    String[] cargo = new String [100];
	    double[] sueldo = new double [100];
	    int opcion; 
	    int numero;
	    String respuesta;
	    do { 
	        System.out.println("----------menú---------");
	        System.out.println("(1): Agregar usuario ");
	        System.out.println("(2): Editar usuario ");
	        System.out.println("(3): Eliminar usuario ");
	        System.out.println("(4): Terminar");
	        opcion = entrada.nextInt();
	        entrada.nextLine();
	        switch(opcion) {
	            case 1:
	                
	        
	        
	    for ( int i = 0; i < 100; i++ ){
	        System.out.println("Usuario #" + (i + 1 ));
	        System.out.println("¿Comó es tu nombre?");
	        nombre[i] = entrada.nextLine();
	        System.out.println("¿Cual es tu cargo?");
	        cargo[i] = entrada.nextLine();
	        System.out.println("¿De cuanto es tu sueldo?");
	        sueldo[i] = entrada.nextDouble();
	        entrada.nextLine();
	        
	        System.out.println("¿Quieres agregar otro usuario?");
	        respuesta = entrada.nextLine();
	        if (respuesta.equalsIgnoreCase("no"))
	        break;
	        
	    }
	            
	        
	        break;
	   case 2:
	       System.out.println("Ingresa el número del usuario que deseas editar:");
	       numero = entrada.nextInt();
	       entrada.nextLine();
	       if (numero < 1 || numero > 100 || nombre[numero - 1] == null) {
        System.out.println("Ese usuario no existe D: ");}
        else{ 
	       System.out.println("Ingrese el nuevo nombre :");
	       nombre[numero - 1] = entrada.nextLine();
	       System.out.println("ingrese el nuevo cargo :");
	       cargo[numero - 1] = entrada.nextLine();
	       System.out.println("ingrese el nuevo sueldo: ");
	       sueldo[numero - 1] = entrada.nextDouble();
	       entrada.nextLine();
	       System.out.println("Usuario editado :D");
        }
	       break;
	       
	       
	  case 3: 
	      System.out.println("Numero del usuario que desea eliminar:");
	      numero = entrada.nextInt();
	      entrada.nextLine();
	      if (numero >= 1 && numero <= 100 && nombre[numero - 1] != null) {
	      
	      nombre[numero - 1] = null;
	      cargo[numero - 1 ] = null;
	      sueldo[numero - 1] = 0;
	      System.out.println("Usuario eliminado :D");
	      }
	      else { 
	          System.out.println("el Usuario no existe ");
	      }
	      break;
	  case 4:
	      System.out.println("Programa finalizado :D");
	      break;
	      default:
	      System.out.println("Opcion no valida");
	        }
	      
	   } while (opcion != 4);
	   entrada.close();
	       }
		
	}

