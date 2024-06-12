import java.util.Scanner;

public class AreaDoCirculo {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double raio, area, pi, raioaoquadrado;
	
	raio = sc.nextDouble();
	pi = 3.14159;
	raioaoquadrado = Math.pow(raio, 2);
	
	System.out.printf("A area do circulo é igual a %.4f%n", raioaoquadrado*pi);	
	
	sc.close();
	
	}
}