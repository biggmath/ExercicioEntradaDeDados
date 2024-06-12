import java.util.Scanner;

public class ExercicioHorasTrabalhadas {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int nFuncionario = sc.nextInt();
	int horasTrabalhadas = sc.nextInt();
	double valorPorHora = sc.nextDouble();
	
	double salario = horasTrabalhadas * valorPorHora;
	
	System.out.println("Funcionario Registrado no número = " + nFuncionario);
	System.out.printf("o Salário a receber com base em " + horasTrabalhadas + " horas de trabalho é de = U$ %.2f%n", salario);
	
	sc.close();
	
	}
}