import java.util.Scanner;

public class ExercicioAreas {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double a, b, c;
	
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	
	double areadotriangulo = (a*c)/2;
	double areadocirculo = c*c*3.14159;
	double areadotrapezio = ((a+b)*c)/2;
	double areadoquadrado = b*b;
	double areadoretangulo = a*b;
	
	System.out.printf("Area do Triangulo = %.3f%n", areadotriangulo);
	System.out.printf("Area do Circulo = %.3f%n", areadocirculo);
	System.out.printf("Area do Trapezio = %.3f%n", areadotrapezio);
	System.out.printf("Area do Quadrado = %.3f%n", areadoquadrado);
	System.out.printf("Area do Retangulo = %.3f%n", areadoretangulo);

	sc.close();
	
	}
}