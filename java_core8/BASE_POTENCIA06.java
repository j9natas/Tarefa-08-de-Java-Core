package lista_8;

import java.util.Scanner;

public class BASE_POTENCIA06 {

	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Digite a base da potência: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente da potência: ");
        int expoente = scanner.nextInt();
        
      
        double resultado = calcularPotencia(base, expoente);
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        
        scanner.close();
    }
    

    public static double calcularPotencia(double base, int expoente) {
        if (expoente == 0) {
            return 1; 
        } else {
            double resultado = 1;
            for (int i = 0; i < Math.abs(expoente); i++) {
                resultado *= base;
            }
            if (expoente < 0) {
                return 1 / resultado; 
            } else {
                return resultado;
            }
        }
    }
}
	
	

