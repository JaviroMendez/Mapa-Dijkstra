import java.util.Scanner;
public class TuNombre
{
 public static void main(String[] args)
 {
  Scanner pedir=new Scanner(System.in);
  System.out.println("\n Dame tu nombre:");
  String nombre=pedir.nextLine();
  System.out.println("\Hola bienvenido"+nombre+"\n Presione una tecla para continuar:");
  String tecla=pedir.nextLine();
 }
} 