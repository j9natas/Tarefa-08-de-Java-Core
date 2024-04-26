package lista_8;




public class REUSLTADOS_50_70_10 {

	
	
	
	
	
	public static void main(String[] args) {
        int soma = 0;
        int quantidadePares = 0;
        
       
        for (int i = 50; i <= 70; i++) {
            if (i % 2 == 0) { 
                soma += i; 
                quantidadePares++; 
            }
        }
        
        double media = (double) soma / quantidadePares;
        
        System.out.println("Resultados:");
        System.out.println("Soma dos valores pares de 50 a 70: " + soma);
        System.out.println("Média aritmética dos valores pares de 50 a 70: " + media);
    }
}
	
	
	
	
	
	
	
	
	
	

