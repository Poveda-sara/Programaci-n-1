/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int opcion = 0;
	    int usuarios = 0;
	    
	    String nombre = "";
	    String cargo = "";
	    String telefono = "";
	    String sueldo = "";
	    
	    while (opcion != 4){
		System.out.println("---------Menú----------");
		System.out.println("(1):Crear usuario");
		System.out.println("(2):Editar usuario");
		System.out.println("(3):Borrar usuario");
		System.out.println("(4):Proceso Terminado");
		
	    opcion = teclado.nextInt();
		
		switch(opcion){
		    case 1:
		        System.out.println("Ingresa tu Nombre: ");
		        nombre = teclado.nextLine();
		        teclado.nextLine();
		        System.out.println("Ingresa tu cargo : ");
		        cargo = teclado.nextLine();
		        System.out.println("Ingresa un Teléfono de respaldo :");
		        telefono = teclado.nextLine();
		        System.out.println("Ingresa tu sueldo :");
		        sueldo = teclado.nextLine();
		        System.out.println(" Se creo correctamente :D");
		        usuarios ++ ;
		        break;
	        case 2 :
	            if (usuarios == 0) {
	                System.out.println("Crea un usuario");}
	                else {
	                    System.out.println("------Editar usuario-----");
	                    System.out.println("Edita tu  nombre :");
	                    nombre = teclado.nextLine();
	                    teclado.nextLine();
	                    System.out.println("Edita tu cargo :");
	                    cargo = teclado.nextLine();
	                    System.out.println("Ingresa el nuevo teléfono :");
	                    telefono = teclado.nextLine();
	                    System.out.println(" Edita tu sueldo :");
	                    sueldo = teclado.nextLine();
	                    System.out.println("Editados correctamente :D");
	                   } 
	                   break;
	       case 3 : if ( usuarios == 0) { 
	           System.out.println("Crea un usuario ");}
	           else {
	               System.out.println("Se elimino el usuario correctamente :D");
	               usuarios --;
	               } break;
	       case 4 :
	      System.out.println("Proceso Terminado :D");
	           break;
	       default:
	       System.out.println("No valido");
	           }
	           
	           
	           
	            }
	            
		   
		        
		        
		}
	}

