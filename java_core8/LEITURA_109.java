package lista_8;


import java.util.Scanner;

public class LEITURA_109 {

	
	
	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int somatorio = 0;
        int contador = 0;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            int valor = scanner.nextInt();
            somatorio += valor; 
            contador++; 
        }
        
       
        double media = (double) somatorio / contador;
        
      
        System.out.println("O somatório dos valores é: " + somatorio);
        System.out.println("A média aritmética dos valores é: " + media);
        
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

