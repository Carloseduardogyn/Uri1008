package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    
		int numeroFuncionario;
		int qtdHoras;
        double valorHora; 
        
        numeroFuncionario = sc.nextInt();
        qtdHoras = sc.nextInt();
        valorHora = sc.nextDouble();
        
        double salario = qtdHoras * valorHora;
        
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
