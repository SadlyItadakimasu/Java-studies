package curso_programacao;

import java.util.Locale;

public class Exercicio_fixacao {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
	
		System.out.printf("%nMeasued with eight decimal places: %.8f%nRounded (three decimal places): %.3f%n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
   
	
	}

}
