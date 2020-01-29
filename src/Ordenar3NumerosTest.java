import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Ordenar3NumerosTest {

	@Test
	public void OrdenarTest() {
		System.out.println("INTRODUCE LOS NUMEROS QUE ESTABLECE CADA CASO EN SUS RESPECTIVOS COMENTARIOS");
		System.out.println("CASO 1:");
		/* Caso 1:
		 * num1 = 2
		 * num2 = 8
		 * num3 = 5
		 */
		Ordenar3Numeros Ordenacion1 = new Ordenar3Numeros();
		System.out.println(Ordenacion1.ordenacion());
		System.out.println("CASO 2:");
		/* Caso 2:
		 * num1 = 1
		 * num2 = 2
		 * num3 = 3
		 */
		Ordenar3Numeros Ordenacion2 = new Ordenar3Numeros();
		System.out.println(Ordenacion2.ordenacion());
		System.out.println("CASO 3:");
		/* Caso 3:
		 * num1 = 7
		 * num2 = 4
		 * num3 = 6
		 */
		Ordenar3Numeros Ordenacion3 = new Ordenar3Numeros();
		System.out.println(Ordenacion3.ordenacion());
		System.out.println("CASO 4");
		/* Caso 4:
		 * num1 = 5
		 * num2 = 3
		 * num3 = 9
		 */
		Ordenar3Numeros Ordenacion4 = new Ordenar3Numeros();
		System.out.println(Ordenacion4.ordenacion());
		System.out.println("CASO 5:");
		/* Caso 5:
		 * num1 = 4
		 * num2 = 7
		 * num3 = 1
		 */
		Ordenar3Numeros Ordenacion5 = new Ordenar3Numeros();
		System.out.println(Ordenacion5.ordenacion());
		System.out.println("CASO 6:");
		/* Caso 6:
		 * num1 = 8
		 * num2 = 5
		 * num3 = 4
		 */
		Ordenar3Numeros Ordenacion6 = new Ordenar3Numeros();
		System.out.println(Ordenacion6.ordenacion());
	}
}
