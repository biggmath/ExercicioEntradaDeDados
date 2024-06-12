import java.util.Scanner;

public class ExercicioCodigoDePecas {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int cod1, numdepecas1, cod2, numdepecas2;
	double valorcod1, valorcod2;
	
	cod1 = sc.nextInt();
	numdepecas1 = sc.nextInt();
	valorcod1 = sc.nextDouble();
	cod2 = sc.nextInt();
	numdepecas2 = sc.nextInt();
	valorcod2 = sc.nextDouble();
	
	System.out.printf("VALOR A PAGAR = R$ %.2f%n", ((numdepecas1 * valorcod1)+(numdepecas2*valorcod2)));	
	
	sc.close();
	
	}
}