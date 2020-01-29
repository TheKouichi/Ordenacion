import java.util.Scanner;

public class Ordenar3Numeros {

	protected int num1;
	protected int num2;
	protected int num3;
	protected Scanner entrada;
	

	
	public String ordenacion() {
		
		entrada = new Scanner(System.in);
		 
		 System.out.println("Introduce numero 1");
		 num1 = entrada.nextInt();
		 System.out.println("Introduce numero 2");
		 num2 = entrada.nextInt();
		 System.out.println("Introduce numero 3");
		 num3 = entrada.nextInt();
		 
		if (num1 <= num2 && num1 <= num3) {
			 if (num3 < num2)
				 return (num1 + "," + num3 + "," + num2);
			 else
				 return num1 + "," + num2 + "," + num3;
		 }
		 
		 else if(num2 <= num3 && num2 <= num1){
			 if (num3 < num1) 
				 return num2 + "," + num3 + "," + num1;
			 else 
				 return num2 + "," + num1 + "," + num3;
		 }
		 else{
			 if (num1 < num2) 
				 return num3 + "," + num1 + "," + num2;
			 else 
				 return num3 + "," + num2 + "," + num1;
		 }
	}
}
