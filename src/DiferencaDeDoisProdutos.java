import java.util.Scanner;

public class DiferencaDeDoisProdutos {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a, b, c, d;
	
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();
	
	System.out.println("A diferenca é igual a " + (a*b-c*d));	
	
	sc.close();
	
	}
}