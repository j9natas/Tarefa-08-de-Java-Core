package lista_8;






public class FAHRENHEIT08 {

	
	
	  public static void main(String[] args) {
	        System.out.println("Conversão de graus Celsius para Fahrenheit:");
	        System.out.println("--------------------------------------------");
	        System.out.println("Celsius   |   Fahrenheit");
	        System.out.println("--------------------------");
	        
	       
	        for (int celsius = 10; celsius <= 100; celsius += 10) {
	            double fahrenheit = converterParaFahrenheit(celsius);
	            System.out.printf("%3d       |   %.2f%n", celsius, fahrenheit);
	        }
	    }
	    
	   
	    public static double converterParaFahrenheit(int celsius) {
	        return (9.0 * celsius + 160) / 5;
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

