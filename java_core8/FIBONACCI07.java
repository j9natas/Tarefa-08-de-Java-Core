package lista_8;



public class FIBONACCI07 {

	
	
	
	
	 public static void main(String[] args) {
	        int limite = 15; 
	        
	        int termo1 = 1;
	        int termo2 = 1;
	        
	        System.out.println("Série de Fibonacci até o décimo quinto termo:");
	        System.out.print(termo1 + " " + termo2 + " "); 
	        
	        for (int i = 3; i <= limite; i++) {
	            int proximoTermo = termo1 + termo2;
	            System.out.print(proximoTermo + " ");
	            termo1 = termo2;
	            termo2 = proximoTermo;
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

